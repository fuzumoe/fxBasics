/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.ex;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class JavaFxListView extends Application{
    
    Stage window;
    Scene scene;
    Button button;
    ListView<String> listView;
    
    public static void main(String[] args){
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception{
        window = stage;
        button = new Button("Click Me");
        listView = new ListView<>();
        listView.getItems().addAll("iCCC","ASDAFA","1SADFAS");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        button.setOnAction(e -> buttonClicked());
        
        
        VBox layout = new VBox(20);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(listView,button);
        
        scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    private void buttonClicked() {
        String message = "";
        
        ObservableList<String> txt;
        txt = listView.getSelectionModel().getSelectedItems();
        
        message = txt.stream().map((t) -> "\n"+t).reduce(message, String::concat);
         
        System.out.println(message);
     }
    
}

