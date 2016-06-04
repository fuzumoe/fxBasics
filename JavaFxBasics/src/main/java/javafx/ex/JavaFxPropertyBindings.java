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
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class JavaFxPropertyBindings extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("FxFx");
        TextField textField = new TextField();
        textField.setMaxWidth(200);
        
        Label firstLabel = new Label("Welcome to the Site");
        Label secondLabel = new Label();
        
        HBox buttomText = new HBox(firstLabel,secondLabel);
        buttomText.setAlignment(Pos.CENTER);
        
        
        VBox layout = new VBox(10,textField,buttomText);
        layout.setAlignment(Pos.CENTER);
        
        secondLabel.textProperty().bind(textField.textProperty());
        
        Scene scene = new Scene(layout, 300, 230);
        window.setScene(scene);
        window.show();
    }

}
