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
public class FxPopUpWindow extends Application {
    
     Stage window;
     Scene scene;
     Button button;
    
    public static void main(String[] args) {
        launch(args);
    }
     
    @Override
    public void start(Stage stage) throws Exception{
        window = stage;
        window.setTitle("FxFx");
      
        
        button = new Button("Click Me");
        button.setOnAction(e -> AlertBox.display("BAMABO", "BLA BLA BLA") );
        
        StackPane pane = new StackPane();
        pane.getChildren().add(button);
        scene = new Scene(pane,300,250);
        window.setScene(scene);
        window.show();
        
    }

 

     
}

 class AlertBox{
    
     public static void display(String title,String message){
         
         Stage window = new Stage();
         
         //block parent window (modality behavior)
         window.initModality(Modality.APPLICATION_MODAL);
         window.setTitle(title);
         window.setMaxHeight(250);
         
         Label label = new Label();
         label.setText(message);
         Button closeButton = new Button("Close the new Window");
         closeButton.setOnAction(e -> window.close());
         
         VBox layout = new VBox(10);
         layout.getChildren().addAll(label,closeButton);
         layout.setAlignment(Pos.CENTER);
         
         window.setScene(new Scene(layout));
         window.showAndWait();
     }
}
