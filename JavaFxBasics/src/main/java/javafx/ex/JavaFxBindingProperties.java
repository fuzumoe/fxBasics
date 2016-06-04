/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.ex;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class JavaFxBindingProperties extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("FxFx");

        IntegerProperty x = new SimpleIntegerProperty(3);
        IntegerProperty y = new SimpleIntegerProperty();
        
        y.bind(x.multiply(9));
        
        System.out.println("x :"+x.getValue());
        System.out.println("y :"+y.getValue());
        
        x.set(10);
        
        System.out.println("x :"+x.getValue());
        System.out.println("y :"+y.getValue());
        
        button = new Button("Submit");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 230);
        window.setScene(scene);
        window.show();
    }

}
