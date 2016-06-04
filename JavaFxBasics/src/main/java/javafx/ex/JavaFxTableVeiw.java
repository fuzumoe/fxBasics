/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.ex;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class JavaFxTableVeiw extends Application {

    Stage window;
    TableView<Product> table;
    TextField nameInput, priceInput, qntInput;
    Button addButton,deleteButton;
    

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        window = stage;
        window.setTitle("FxFx");

        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Product, String> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<Product, String> qntColumn = new TableColumn<>("Quantity");
        qntColumn.setMinWidth(100);
        qntColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        
        
        
      nameInput = new TextField();
      nameInput.setPromptText("Name");
      priceInput = new TextField();
      priceInput.setPromptText("Price");
      qntInput = new  TextField();
      qntInput.setPromptText("Quntity");
      
      addButton  = new Button("Add");
      addButton.setOnAction(e-> addButtonClicked());
      deleteButton = new Button("Delete");
      deleteButton.setOnAction(e -> deleteButtonClicked());

      
        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, priceColumn, qntColumn);
        
        //hBox

        
        
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        
        VBox vBox = new VBox(20);
        vBox.getChildren().addAll(table,hBox);
        
        hBox.getChildren().addAll(nameInput,priceInput,qntInput,addButton,deleteButton);

        Scene scene = new Scene(vBox);

        window.setScene(scene);
        window.show();
    }

    public ObservableList<Product> getProduct() {

        ObservableList<Product> products = FXCollections.observableArrayList();

        products.add(new Product("Laptop", 859.34, 200));
        products.add(new Product("Boom", 5552.12, 232));
        products.add(new Product("RindFleisch", 223.9, 323));
        products.add(new Product("GipGop", 444.9, 113));
      
        return products;
    }

    private void deleteButtonClicked() {
       ObservableList<Product> productSelected,allproducts;
       allproducts = table.getItems();
       productSelected = table.getSelectionModel().getSelectedItems();
       
       productSelected.forEach(allproducts::remove);
       
        
        
       
     }

    private void addButtonClicked() {
         Product product = new Product();
         product.setName(nameInput.getText());
         product.setPrice(new Double(priceInput.getText()));
         product.setQuantity(new Integer(qntInput.getText()));
         table.getItems().addAll(product);
         
         nameInput.clear();
         priceInput.clear();
         qntInput.clear();
     }

}
