/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.ex;

 
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class FxConfirmBox extends Application{
    Stage window;
    Scene scene;
    Button button;
    
    public static void main(String[] args){
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("FxFx");
        button = new Button("Click Me");
        
        button.setOnAction(e ->{ 
           boolean result = ConfimBox.display("Title", "Wow wwo");
           System.out.println(result);
                    });
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    } 
}
 
class ConfimBox{

     static boolean answer;
     
     public static boolean display(String title,String message){
         
         Stage window = new Stage();
         
         //block parent window (modality behavior)
         window.initModality(Modality.APPLICATION_MODAL);
         window.setTitle(title);
         window.setMaxHeight(250);
       
         Label label = new Label();
         label.setText(message);
         
         Button yesButton  = new Button("Yes");
         Button noButton = new Button("No");
         
         yesButton.setOnAction(e ->{
             answer = true;
             window.close();
         });
         
         noButton.setOnAction(e ->{
             answer = false;
             window.close();
         });
         
         
         VBox layout = new VBox(10);
         layout.getChildren().addAll(label,yesButton,noButton);
         layout.setAlignment(Pos.CENTER);
         
         window.setScene(new Scene(layout));
         window.showAndWait();
         return answer;
     }

     
}
