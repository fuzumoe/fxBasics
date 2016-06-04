/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.ex;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class JavaFxEx extends Application /*implements EventHandler<ActionEvent>*/{
    
     Button button;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
     stage.setTitle("FxFx");
     
     button = new Button();
     button.setText("ClickMe");
     
     //set lambda based event listner
    // button.setOnAction((ActionEvent t) -> {System.out.print("test");}); 
     button.setOnAction(t->System.out.println("test test."));
     //set defacto based event listner
     //button.setOnAction(this);
     //class inner class based event Listner
    // button.setOnAction(new ClickEvents());
     
     StackPane layout = new StackPane();
     layout.getChildren().add(button);
     
     Scene scene = new Scene(layout,300,250);
     stage.setScene(scene);
     stage.show();
     
     
    }
//
//    @Override
//    public void handle(ActionEvent t) {
//          
//        //find the source of the event
//        if(t.getSource()==button){
//            System.out.println("JoJo");
//        }
//        
//    }
//    
//    class ClickEvents implements EventHandler<ActionEvent>{
//
//        @Override
//        public void handle(ActionEvent t) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//        
//    }
    
}
