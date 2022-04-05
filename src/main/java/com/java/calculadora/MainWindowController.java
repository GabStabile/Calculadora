package com.java.calculadora;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainWindowController {
    @FXML private Pane titlePane;

    private double x, y;

    public void init(Stage stage) {
        titlePane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();

            });
            titlePane.setOnMouseDragged(mouseEvent -> {
                stage.setX(mouseEvent.getSceneX()-x);
                stage.setY(mouseEvent.getSceneY()-y);


            });


    }


}
