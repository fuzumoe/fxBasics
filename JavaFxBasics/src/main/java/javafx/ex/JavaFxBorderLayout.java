/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.ex;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

/**
 *
 * @author adam
 */
public class JavaFxBorderLayout extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("FxFx");

        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");

        HBox topMenu = new HBox();
        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

        Button buttonD = new Button("Projects");
        Button buttonE = new Button("Services");
        Button buttonF = new Button("Navigator");

        VBox leftMenu = new VBox();
        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        scene = new Scene(borderPane, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
