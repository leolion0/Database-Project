/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coolcarsproject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author koryo
 */

public class playground extends Application {
    Stage window;
    Scene scene;
    Button button;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("ChoiceBox Demo");
        button = new Button("Click me");
        
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        
        //getItems returns the ObservableList object which you can add items to
        choiceBox.getItems().add("Lamborghini");
        choiceBox.getItems().add("Tesla");
        choiceBox.getItems().addAll("car1", "car2", "car3");
        
        //Set default value
        choiceBox.setValue("Lamborghini");
        
        button.setOnAction(e -> getChoice(choiceBox));
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(choiceBox, button);
        
        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
        
        
    }
    
    private void getChoice(ChoiceBox<String> choiceBox){
        String car = choiceBox.getValue();
        System.out.print(car);
    }
    
}
