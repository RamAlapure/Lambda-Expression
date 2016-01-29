/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Ram
 */
public class JavaFXApplication5 extends Application {
    int count = 0;
    Label label;
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("JavaFX 8 Tutorial 8 - Save Action Event with Lambda Expression");
        
        HBox hbox = new HBox(10);
        Scene scene = new Scene(hbox, 300, 250, Color.SILVER);
        
        Button add = new Button("Add");
        add.setOnAction(e -> {
            count++;
            label.setText(Integer.toString(count));
        });
        
        Button sub = new Button("Sub");
        sub.setOnAction(e -> {
            count--;
            label.setText(Integer.toString(count));
        });
        
        label = new Label();
        label.setText(Integer.toString(count));
        
        HBox.setMargin(label, new Insets(5,5,5,5));
        hbox.getChildren().addAll(label, add, sub);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
