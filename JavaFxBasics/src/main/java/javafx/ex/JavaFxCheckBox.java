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
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class JavaFxCheckBox extends Application {
     
     Stage window;
     Scene scene;
     Button button;
     public static void main(String[] args){
         launch(args);
     }
    @Override
    public void start(Stage stage) throws Exception {
         window = stage;
         window.setTitle("Checkbox Example");
         
         button = new Button("Order Now!");
         
         
         
         
         CheckBox box1 =  new CheckBox("Oranges");
         CheckBox box2 = new CheckBox("Apples");
         box2.setSelected(true);
         
         button.setOnAction(e -> handleOptions(box1,box2));
         
         VBox layout = new VBox(10);
         layout.setPadding(new Insets(20,20,20,20));
         layout.getChildren().addAll(button,box1,box2);
         
         scene = new Scene(layout,300,250);
         window.setScene(scene);
         window.show();
         
     }
    
    
    private void handleOptions(CheckBox box1,CheckBox box2){
        String  message =" The users order was:\n ";
        
        if(box1.isSelected())
            message+=" Orange";
        if(box2.isSelected())
            message+=" Apple";
        System.out.println(message);
    }
    
}
