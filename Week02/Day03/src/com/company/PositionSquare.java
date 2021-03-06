package com.company;

import javax.swing.*;
import java.awt.*;


public class PositionSquare {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.n.
        for (int i = 0; i < 3; i++) {
            drawSquare(randomCoordinate(), randomCoordinate(), graphics);
        }
    }

    public static int randomColor(){
        return ((int) Math.floor(Math.random()*256));
    }

    public static int randomCoordinate(){
        // x and y capped at 254 so that full squares are on the board
        return ((int) Math.floor(Math.random()*254));
    }

    public static void drawSquare(int x, int y, Graphics graphics){
        graphics.setColor(new Color(randomColor(), randomColor(), randomColor(), randomColor()));
        graphics.fillRect(randomCoordinate(), randomCoordinate(), 50, 50);
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}