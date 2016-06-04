/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.ex;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class JavaFxMenu extends Application {

    Stage window;
    Scene scene;
    BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("FxFx");

        Menu fileMenu = new Menu("File");
        MenuItem newFile = new MenuItem("New...");
        fileMenu.setOnAction(e -> System.out.println("NEW..........."));

        fileMenu.getItems().add(newFile);

        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Setting..."));
        fileMenu.getItems().add(new SeparatorMenuItem());

        fileMenu.getItems().add(new MenuItem("Exit..."));

        Menu editeMenu = new Menu("Edit");
        editeMenu.getItems().add(new Menu("Undo"));
        editeMenu.getItems().add(new MenuItem("Redo"));
        editeMenu.getItems().add(new MenuItem("Copy"));
        MenuItem paste = new MenuItem("Paste");
        paste.setDisable(true);
        editeMenu.getItems().add(paste);

        Menu helpMenu = new Menu("Help");

        CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
        showLines.setOnAction(e -> {
            if (showLines.isSelected()) {
                System.out.println("Program will now dispalay line numbers");
            } else {
                System.out.println("Hiding line number");
            }
        });

        CheckMenuItem autoSave = new CheckMenuItem("Enable Auto Save");
        autoSave.setSelected(true);
        helpMenu.getItems().addAll(showLines, autoSave);

        Menu difficultyMenu = new Menu("Difficulty");
        ToggleGroup difficultyToggle = new ToggleGroup();

        RadioMenuItem easy = new RadioMenuItem("Easy");
        RadioMenuItem medium = new RadioMenuItem("Medium");
        RadioMenuItem hard = new RadioMenuItem("Hard");
        
        easy.setToggleGroup(difficultyToggle);
        medium.setToggleGroup(difficultyToggle);
        hard.setToggleGroup(difficultyToggle);
        
        difficultyMenu.getItems().addAll(easy,medium,hard);
        
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editeMenu, helpMenu,difficultyMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);

        scene = new Scene(layout, 400, 400);
        window.setScene(scene);
        window.show();

    }

}
