/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.ex;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author adam
 */
public class JavaFxUsingPropertiesWithComponents extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("FxFx");
        
        Person person = new Person();
        person.firstNamePerson().addListener((observableValue,oldValue,newValue) ->{
            System.out.println("Name changed to :"+newValue);
            System.out.println("firstNameProperty :"+person.firstNamePerson());
            System.out.println("getFirstName() "+person.getFristname());
        });
        
        button = new Button("Submit");
        button.setOnAction(e -> person.setFirstName("Porken"));
        
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,230);
        window.setScene(scene);
        window.show();
    }

}
