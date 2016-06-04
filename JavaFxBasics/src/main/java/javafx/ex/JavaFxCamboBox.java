/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.ex;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class JavaFxCamboBox extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> cbox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        button = new Button("Click Me");

        cbox = new ComboBox<>();
        cbox.getItems().addAll("Good will Hunting","Love and Hate","Blabla movie blabla");
        
        cbox.setPromptText("What is your favorite movie?");
        cbox.setEditable(true);
        
        button.setOnAction(e -> printMovie());
        
        //Layout in verticall column
        VBox vlayout = new VBox(20);
        vlayout.setPadding(new Insets(20, 20, 20, 20));
        vlayout.getChildren().addAll(cbox,button);
        scene = new Scene(vlayout, 200, 200);

        window.setScene(scene);
        window.setTitle("FxFx");
        window.show();
    }

    private void printMovie() {
        System.out.println(cbox.getValue());
     }

}
