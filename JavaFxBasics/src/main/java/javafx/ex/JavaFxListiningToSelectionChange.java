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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class JavaFxListiningToSelectionChange extends Application {

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

        button = new Button("Click me");

        ChoiceBox<String> choice = new ChoiceBox<>();

        choice.getItems().add("Apple");
        choice.getItems().add("Orange");
        choice.getItems().addAll("Melon", "wine ", "Bannana");
        choice.setValue("Apple");
        button.setOnAction(e -> choiceHandle(choice));
        
        choice.getSelectionModel().selectedItemProperty().addListener((observableValues,oldValue,newValue)->System.out.println(newValue));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choice, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void choiceHandle(ChoiceBox choiceBox) {
        String message = (String) choiceBox.getValue();

        System.out.println(message);
    }

}
