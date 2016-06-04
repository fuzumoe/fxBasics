/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.ex;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class FxConfirmBeforClose extends Application {
    Stage window;
    Button button;
    
    public static void main(String[] args){
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("FxFx");
        window.setOnCloseRequest(e->{
            e.consume();
            closeProgram();
        });
        
    
        button = new Button("Close Program");
        button.setOnAction(e -> closeProgram());
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
     }

    private void closeProgram() {
        Boolean answere = ConfimBox.display("Hahhh", "BB");
        if(answere){
        window.close();
        }
     }
    
    
}
