package com.example.tetris;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.security.Key;
import java.util.Random;

public class Main extends Application {
    Group root;
    Scene scene;
    Rectangle bar;

    @Override
    public void start(Stage stage) throws Exception {
        root = new Group();


        Pieces p = new Pieces(800, 820);
        Pieces p1 = new Pieces(300, 820);
        Pieces p2 = new Pieces(500, 820);
        Pieces p3 = new Pieces(700, 820);

        bar = new Rectangle( 900, 125, Color.LIGHTGREY);
        bar.setY(800);
        scene = p.moveShapes(root, 900, 925, Color.BEIGE);
        root.getChildren().add(bar);



        root.getChildren().addAll(p.randomShape());
        root.getChildren().addAll(p1.randomShape());
        root.getChildren().addAll(p2.randomShape());
        root.getChildren().addAll(p3.randomShape());

        root.setFocusTraversable(true);



        stage.setScene(scene);
        stage.show();
    }


}
//        scene = new Scene(root,1000, 900, Color.AQUA);

//        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent keyEvent) {
//                if (keyEvent.getCode() == KeyCode.UP) {
//                    for (int i = 0; i < p.shapes.length; i++) {
//                        if (i == 0) {
//                            p.shapes[i].relocate(p.startX += 50, p.startY);
//                        }
//                        if (i == 1) {
//                            p.shapes[i].relocate(p.startX += 50, p.startY);
//                        }
//                    }
//                }
//            }
//        });

//        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent keyEvent) {
//                if (keyEvent.getCode() == KeyCode.UP) {
//                }
//            }
//        });