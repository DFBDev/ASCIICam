package org.example;
import org.bytedeco.javacv.*;
import org.bytedeco.javacv.Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //UPDATES BRANCH
        int iterationCounter = 0;
        int rgbSum = 0;
        try (FrameGrabber fg = new OpenCVFrameGrabber(0)){ //Instantiating frame-grabber with primary camera in try-with-resources statement.
            //Starting frame grabber, creating instance of frame converter (to convert to buffered image), and creating instance of JFrame container.
            fg.start();
            Java2DFrameConverter j2d = new Java2DFrameConverter();
            JFrame jf = new JFrame("ASCIICam");

           while(true) {
               ArrayList<Integer> rgbValArray = new ArrayList<>(); //Storage for sequential collection of RGB values, which is later passed to customJPanel class.

               //Grabbing frame of video and converting it to buffered image; which offers more functionalities.
               Frame frame = fg.grabFrame();
               BufferedImage bi = j2d.getBufferedImage(frame);

               //Loop for processing pixels of image/video frame.
               //Outer for-loop is responsible for transversing the image horizontally, and moving forward 5 pixels after each iteration; ultimately treats the entire image as a collection of 5x5 pixel columns.
               //Nested for-loop is responsible for transversing vertically on each column and capturing 5x5 pixel sub-image.
               for (int k = 0; k < bi.getWidth(); k = k + 5) {
                   for (int r = 0; r < bi.getHeight(); r = r + 5){
                       BufferedImage subImage = bi.getSubimage(k,r, 5,5); //5x5 pixel sub-image.
                       for (int i = 0; i < subImage.getWidth(); i++) { //Calculating average RGB value for sub-image.
                           for (int j = 0; j < subImage.getHeight(); j++){
                               Color rgbValues = new Color(subImage.getRGB(i, j));
                               rgbSum = rgbSum + rgbValues.getRed() + rgbValues.getBlue() + rgbValues.getGreen();
                               iterationCounter++; //Used as divisor for rgb value total later on to calculate the average.
                           }
                       }
                       rgbValArray.add(rgbSum / (iterationCounter * 3));
                       //Resetting values.
                       rgbSum = 0;
                       iterationCounter = 0;
                   }
               }
                //Creating JPanel, setting properties of JFrame container, adding JPanel to JFrame container.
               JPanel jp = new customJPanel(rgbValArray);
               jf.setVisible(true);
               jf.setSize(1600,1500);
               jf.add(jp);
           }
        }
        catch (FrameGrabber.Exception e) {
            System.out.print("PROGRAM ERROR: " + e);
        }
    }
}