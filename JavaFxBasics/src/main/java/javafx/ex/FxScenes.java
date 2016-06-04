/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.ex;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class FxScenes extends Application {
    Stage window;
    Scene scene1, scene2;
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage)throws Exception{
        
        window =  primaryStage;
        
        Label lebel1 = new Label("Welcome to the First scene");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));
        
        //Layout in verticall column
        VBox vlayout = new VBox(20);
        vlayout.getChildren().addAll(lebel1,button1);
        scene1 = new Scene(vlayout, 200,200);
        
        Label lebel2 = new Label("Welcome to the Second scene");
        Button button2 = new Button("Go to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));
        
        //Layout in verticall column
        StackPane pane = new StackPane();
        pane.getChildren().addAll(lebel2,button2);
        scene2 = new Scene(pane, 200,200);
        
        window.setScene(scene1);
        window.setTitle("FxFx");
        window.show();
    } 
    
 }
    

