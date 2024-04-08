package org.example;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class customJPanel extends JPanel {
    int counter = 0; //Counter for accessing data in-order from rgbArray.
    ArrayList<Integer> rgbArray;
    customJPanel(ArrayList<Integer> rgbValueArray) { //Setting constructor to accept rgbValueArray dependency from Main, and overriding default JPanel background color.
        this.setBackground(Color.BLACK);
        rgbArray = rgbValueArray;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        //Painting ASCII symbols on JPanel in the same order that sub-images from Main were processed.
        //The amount of symbols painted on JPanel matches the sub-images collected from the original image/frame.
        //The RGB averages are passed from Main are processed in-order. An ASCII symbol is painted depending on the current average being processed.
        for (int i = 0; i < 1280; i = i + 10) {
            for (int j = 0; j < 960; j = j + 10){
                if (rgbArray.get(counter) > 0 && rgbArray.get(counter) <= 34){
                    g.drawString(" ", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 35 && rgbArray.get(counter) <= 39) {
                    g.drawString("_", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 40 && rgbArray.get(counter) <= 44) {
                    g.drawString(".", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 45 && rgbArray.get(counter) <= 49) {
                    g.drawString(",", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 50 && rgbArray.get(counter) <= 54) {
                    g.drawString("~", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 55 && rgbArray.get(counter) <= 59) {
                    g.drawString("-", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 60 && rgbArray.get(counter) <= 64) {
                    g.drawString("=", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 65 && rgbArray.get(counter) <= 69) {
                    g.drawString("+", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 70 && rgbArray.get(counter) <= 79) {
                    g.drawString(":", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 80 && rgbArray.get(counter) <= 89) {
                    g.drawString(";", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 90 && rgbArray.get(counter) <= 99) {
                    g.drawString("c", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 100 && rgbArray.get(counter) <= 109) {
                    g.drawString("b", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 110 && rgbArray.get(counter) <= 119) {
                    g.drawString("a", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 120 && rgbArray.get(counter) <= 129) {
                    g.drawString("!", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 130 && rgbArray.get(counter) <= 139) {
                    g.drawString("?", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 140 && rgbArray.get(counter) <= 149) {
                    g.drawString("0", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 150 && rgbArray.get(counter) <= 159) {
                    g.drawString("1", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 160 && rgbArray.get(counter) <= 169) {
                    g.drawString("2", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 170 && rgbArray.get(counter) <= 179) {
                    g.drawString("3", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 180 && rgbArray.get(counter) <= 189) {
                    g.drawString("4", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 190 && rgbArray.get(counter) <= 199) {
                    g.drawString("5", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 200 && rgbArray.get(counter) <= 209) {
                    g.drawString("6", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 210 && rgbArray.get(counter) <= 219) {
                    g.drawString("7", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 220 && rgbArray.get(counter) <= 229) {
                    g.drawString("8", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 230 && rgbArray.get(counter) <= 234) {
                    g.drawString("9", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 235 && rgbArray.get(counter) <= 239) {
                    g.drawString("$", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 240 && rgbArray.get(counter) <= 244) {
                    g.drawString("W", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 245 && rgbArray.get(counter) <= 249) {
                    g.drawString("#", i + 150, j + 200);
                }
                else if (rgbArray.get(counter) >= 250 && rgbArray.get(counter) <= 255) {
                    g.drawString("@", i + 150, j + 200);
                }

                if (counter != rgbArray.size()) {
                    counter += 1;
                }
            }
        }
        //Resetting counter.
        counter = 0;
    }
}
