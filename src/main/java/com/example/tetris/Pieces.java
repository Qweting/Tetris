package com.example.tetris;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import static java.util.Map.entry;

import java.util.*;

public class Pieces {
    int startX; //start value is set at x = 250 & y = 450, XDIFF & YDIFF repressents the size difference between shapes,
    int startY;

    int XDIFF;
    int YDIFF;

    int height, HD;
    int width, WD;
    String dimension;
    boolean goUP,goDOWN, goLEFT, goRIGHT;
    int shapesSize;
    Rectangle[] shapes;
    boolean check;

    public List<String> randomShape =
            Arrays.asList(
            "2x2 L-Shape", "3x3 L-Shape", "3x2 L-Shape",
            "1x1 Square", "2x2 Square", "3x3 Square",
            "T-Shape", "3x3 T-Shape", "S-Shape",
            "2x1 I-Shape", "3x1 I-Shape");

    Random random = new Random();

    private int DX = 4;
    private int DY = 4;


    public Pieces(int startX, int startY) {
        this.startX = startX;
        this.startY = startY;
    }


    public Rectangle[] drawShapeL(String dimension) {
        if (dimension.equalsIgnoreCase("2x2 L-Shape")) {
            shapesSize = 2;
            shapes = new Rectangle[shapesSize];
            for (int i = 0; i < shapesSize; i++) {
                if (i == 0) {
                    width = 30;
                    height = 60;
                    shapes[i] = new Rectangle(width, height, Color.PURPLE);
                    shapes[i].setLayoutX(startX);
                    shapes[i].setLayoutY(startY);
                }if (i == 1) {
                    XDIFF = startX + width;
                    YDIFF = startY + width;
                    WD = 30;
                    HD = 30;
                    shapes[i] = new Rectangle(WD, HD, Color.PURPLE);
                    shapes[i].setLayoutX(XDIFF);
                    shapes[i].setLayoutY(YDIFF);}}
        }
        if (dimension.equalsIgnoreCase("3x3 L-Shape")) {
            shapesSize = 2;
            shapes = new Rectangle[shapesSize];
            for (int i = 0; i < shapesSize; i++) {
                if (i == 0) {
                    width = 30;
                    height = 90;
                    shapes[i] = new Rectangle(width, height, Color.PURPLE);
                    shapes[i].setLayoutX(startX);
                    shapes[i].setLayoutY(startY);
                }
                if (i == 1) {
                    XDIFF = startX + width;
                    YDIFF = startY + 60;
                    WD = 60;
                    HD = 30;
                    shapes[i] = new Rectangle(WD, HD, Color.PURPLE);
                    shapes[i].setLayoutX(XDIFF);
                    shapes[i].setLayoutY(YDIFF);}}}
        if (dimension.equalsIgnoreCase("3x2 L-Shape")) {
            shapesSize = 2;
            shapes = new Rectangle[shapesSize];
            for (int i = 0; i < shapesSize; i++) {
                if (i == 0) {
                    width = 30;
                    height = 90;
                    shapes[i] = new Rectangle(width, height, Color.PURPLE);
                    shapes[i].setLayoutX(startX);
                    shapes[i].setLayoutY(startY);
                }if (i == 1) {
                    XDIFF = startX + width;
                    YDIFF = startY + 60;
                    WD = 30;
                    HD = 30;
                    shapes[i] = new Rectangle(WD, HD, Color.PURPLE);
                    shapes[i].setLayoutX(XDIFF);
                    shapes[i].setLayoutY(YDIFF);}}}
        return shapes;}

    Rectangle[] drawSquares(String dimension) {
        if (dimension.equalsIgnoreCase("1x1 Square")) {
            shapesSize = 1;
            shapes = new Rectangle[shapesSize];
            for (int i = 0; i < shapesSize; i++) {
                if (i == 0) {
                    shapes[i] = new Rectangle(30, 30, Color.PURPLE);
                    shapes[i].setLayoutX(startX);
                    shapes[i].setLayoutY(startY);}}}
        if (dimension.equalsIgnoreCase("2x2 Square")) {
            shapesSize = 1;
            shapes = new Rectangle[shapesSize];
            for (int i = 0; i < shapesSize; i++) {
                if (i == 0) {
                    shapes[i] = new Rectangle(60, 60, Color.PURPLE);
                    shapes[i].setLayoutX(startX);
                    shapes[i].setLayoutY(startY);}
                }}
        if (dimension.equalsIgnoreCase("3x3 Square")) {
            shapesSize = 1;
            shapes = new Rectangle[shapesSize];
            for (int i = 0; i < shapesSize; i++) {
                if (i == 0) {
                    shapes[i] = new Rectangle(90, 90, Color.PURPLE);
                    shapes[i].setLayoutX(startX);
                    shapes[i].setLayoutY(startY);}
            }}
        return shapes;}

    Rectangle[] drawOthers(String dimension) {
        if (dimension.equalsIgnoreCase("T-Shape")) {
            shapesSize = 2;
            shapes = new Rectangle[shapesSize];
            for (int i = 0; i < shapesSize; i++) {
                if (i == 0) {
                    height = 30;
                    width = 90;
                    shapes[i] = new Rectangle(width, height, Color.PURPLE);
                    shapes[i].setLayoutX(startX);
                    shapes[i].setLayoutY(startY);}
                if (i == 1) {
                    XDIFF = startX + height;
                    YDIFF = startY + height;
                    HD = 30;
                    WD = 30;
                    shapes[i] = new Rectangle(30, 30, Color.PURPLE);
                    shapes[i].setLayoutX(XDIFF);
                    shapes[i].setLayoutY(YDIFF);}}
        }
        if (dimension.equalsIgnoreCase("3x3 T-Shape")) {
            shapesSize = 2;
            shapes = new Rectangle[shapesSize];
            for (int i = 0; i < shapesSize; i++) {
                if (i == 0) {
                    height = 30;
                    width = 90;
                    shapes[i] = new Rectangle(width, height, Color.PURPLE);
                    shapes[i].setLayoutX(startX);
                    shapes[i].setLayoutY(startY);}
                if (i == 1) {
                    XDIFF = startX + height;
                    YDIFF = startY + height;
                    HD = 60;
                    WD = 30;
                    shapes[i] = new Rectangle(WD, HD, Color.PURPLE);
                    shapes[i].setLayoutX(XDIFF);
                    shapes[i].setLayoutY(YDIFF);}}
        }
        if (dimension.equalsIgnoreCase("S-Shape")) {
            shapesSize = 2;
            shapes = new Rectangle[shapesSize];
            for (int i = 0; i < shapesSize; i++) {
                if (i == 0) {
                    height = 30;
                    width = 90;
                    shapes[i] = new Rectangle(width, height, Color.PURPLE);
                    shapes[i].setLayoutX(startX);
                    shapes[i].setLayoutY(startY);}
                if (i == 1) {
                    XDIFF = startX ;
                    YDIFF = startY + height;
                    WD = 30;
                    HD = 60;
                    shapes[i] = new Rectangle(WD, HD, Color.PURPLE);
                    shapes[i].setLayoutX(XDIFF);
                    shapes[i].setLayoutY(YDIFF);}
                }
        }
        if (dimension.equalsIgnoreCase("2x1 I-Shape")) {
            shapesSize = 1;
            shapes = new Rectangle[shapesSize];
            for (int i = 0; i < shapesSize; i++) {
                if (i == 0) {
                    width = 30;
                    height = 60;
                    shapes[i] = new Rectangle(width, height, Color.PURPLE);
                    shapes[i].setLayoutX(startX);
                    shapes[i].setLayoutY(startY);}}}
        if (dimension.equalsIgnoreCase("3x1 I-Shape")) {
            shapesSize = 1;
            shapes = new Rectangle[shapesSize];
            for (int i = 0; i < shapesSize; i++) {
                if (i == 0) {
                    width = 30;
                    height = 90;
                    shapes[i] = new Rectangle(width, height, Color.PURPLE);
                    shapes[i].setLayoutX(startX);
                    shapes[i].setLayoutY(startY);}}}

        return shapes;
    }

    //We create a scene and add that scene to our stage.
    Scene moveShapes(Group root, int width, int length, Color color) {
        Scene scene = new Scene(root, width, length, color);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch (keyEvent.getCode()) {
                    case UP: goUP = true; break;
                    case DOWN: goDOWN = true; break;
                    case RIGHT: goRIGHT = true; break;
                    case LEFT: goLEFT = true; break;
                    }}});
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch (keyEvent.getCode()) {
                    case UP: goUP = false; break;
                    case DOWN: goDOWN = false; break;
                    case RIGHT: goRIGHT = false; break;
                    case LEFT: goLEFT = false; break;
                    }}});

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                if (goUP) {
                    for (int i = 0; i < shapesSize ; i++) {
                        if (i == 0) {
                            shapes[i].relocate(startX, startY -= DY);
                        }
                        if(i == 1){
                            shapes[i].relocate(XDIFF, YDIFF-= DY);
                        }}}

                if (goDOWN) {
                    for (int i = 0; i < shapesSize ; i++) {
                        if (i == 0) {
                            shapes[i].relocate(startX, startY += DY);
                        }
                        if(i==1){
                            shapes[i].relocate(XDIFF, YDIFF += DY);
                        }}}
                if (goRIGHT) {
                    for (int i = 0; i < shapesSize ; i++) {
                        if (i == 0) {
                            shapes[i].relocate(startX += DX, startY);
                        }
                        if (i == 1) {
                            shapes[i].relocate(XDIFF += DX, YDIFF);
                        }}}
                if (goLEFT) {
                    for (int i = 0; i < shapesSize ; i++) {
                        if (i == 0) {
                            shapes[i].relocate(startX -= DX, startY);
                        }
                        if (i == 1) {
                            shapes[i].relocate(XDIFF -= DX, YDIFF);
                        }}}
            }
        };timer.start();
        return scene;
    }

    Rectangle[] randomShape() {
        int index = random.nextInt(randomShape.size());
        System.out.println(randomShape.get(index));
        System.out.println(index);
        if(index < 3) return drawShapeL(randomShape.get(index));
        if (index > 2 && index < 6 ) return drawSquares(randomShape.get(index));
        if (index >= 5) return drawOthers(randomShape.get(index));
        return null;
    }





}

//            public void handle(KeyEvent keyEvent) {
//                if (keyEvent.getCode() == KeyCode.UP) {
//                    start = true;
//                    for (int i = 0; i < shapes.length; i++) {
//                        if (i == 0) {
//                            shapes[i].relocate(LstarX, LstarY -= DY);
//                        }
//                        if (i == 1) {
//                            shapes[i].relocate(LDX, LDY -= DY);
//                        }
//                    }
//                }
//                if (keyEvent.getCode() == KeyCode.DOWN) {
//                    start = true;
//                    for (int i = 0; i < shapes.length; i++) {
//                        if (i == 0) {
//                            shapes[i].relocate(LstarX, LstarY += DY);
//                        }
//                        if (i == 1) {
//                            shapes[i].relocate(LDX, LDY += DY);
//                        }
//                    }
//                }
//                if (keyEvent.getCode() == KeyCode.RIGHT) {
//                    start = true;
//                    for (int i = 0; i < shapes.length; i++) {
//                        if (i == 0) {
//                            shapes[i].relocate(LstarX += DX, LstarY);
//                        }
//                        if (i == 1) {
//                            shapes[i].relocate(LDX += DX, LDY);
//                        }
//                    }
//                }
//                if (keyEvent.getCode() == KeyCode.LEFT) {
//                    start = true;
//                    for (int i = 0; i < shapes.length; i++) {
//                        if (i == 0) {
//                            shapes[i].relocate(LstarX -= DX, LstarY);
//                        }
//                        if (i == 1) {
//                            shapes[i].relocate(LDX -= DX, LDY);
//                        }
//                    }
//                }
//            }