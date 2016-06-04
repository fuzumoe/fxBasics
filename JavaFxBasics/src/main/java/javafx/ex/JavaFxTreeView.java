/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.ex;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class JavaFxTreeView extends Application {

    Stage window;
    Scene scene;
    Button button;
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        button = new Button("Click Me");

        TreeItem<String> root, bucky, megan;

        root = new TreeItem<>();
        root.setExpanded(true);

        

        bucky = makeBrach("bucky", root);
        makeBrach("bb", bucky);
        makeBrach("adfa", bucky);

        megan = makeBrach("Megan", root);
        makeBrach("asdf", megan);
        makeBrach("sadf",megan);

        tree = new TreeView<>(root);
        tree.setShowRoot(true);
        tree.getSelectionModel().selectedItemProperty().addListener(
                (ObservableValue,oldValue,newValue)->{
                    if(newValue != null)
                        System.out.println(newValue.getValue());
                     
                }
        );
        
        VBox layout = new VBox(20);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(tree,button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        
        window.show();
    }

    private TreeItem<String> makeBrach(String title, TreeItem parent) {
         TreeItem<String> item = new TreeItem<>(title);
         item.setExpanded(true);
         parent.getChildren().add(item);
         
         return item;
    }

}
