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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

 
/**
 *   
 * @author adam
 */
public class JavaFxGridPane extends Application{
    
    Stage window;
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("thenewboston - JavaFx");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);
        
        //Name Label
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 0, 0);
        
        TextField nameInput = new TextField( );
        nameInput.setPromptText("username");
         GridPane.setConstraints(nameInput, 1, 0);
        
        
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel, 0, 1);
        
         PasswordField passInput = new PasswordField();
         passInput.setPromptText("passowrd");
         GridPane.setConstraints(passInput, 1, 1);
         
         Button loginButton = new Button("Log in");
         GridPane.setConstraints(loginButton, 1, 2);
         
         grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,loginButton);
         
         Scene scene = new Scene(grid);
         window.setScene(scene);
                
        window.show();
     }
   
}
