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
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class JavaFxInputValidation extends Application {
    
    Stage window;
    Scene scene;
    Button button;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("FxFx");
        
        TextField nameInput = new TextField();
        button = new Button("Click me");
        button.setOnAction(e -> isInit(nameInput,nameInput.getText()));
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameInput, button);
        
        scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
     }

    private boolean isInit(TextField input,String text) {
        try {
            int num = Integer.parseInt(input.getText());
            System.out.println("true");
            return true;
        } catch (Exception e) {
                        System.out.println("false");

            return false;
        }
     }
    
    
}
