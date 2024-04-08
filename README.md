## What is ASCIICam?

ASCIICam is a Java-made application that processes individual frames from a computer camera in order to produce an ASCII symbol video filter.
This is done by creating sub-sections/images for each frame, calculating the average RGB values of them, and individually painting the corresponding symbol onto a single cell
in a (currently) 64x48 grid using JFrame/JPanel.

## Specifics.
* Developed on Intellij w/ Maven build.
* Uses JavaCV for capturing frames and converting them to buffered images.
* Uses Swing, AWT, JFrame and JPanel for displaying ASCII symbols.
* Current ASCII scale (from black to white, starting with a space(" ")): " _.,--=+:;cba!?0123456789$W#@".

## Structure:
* `src/main/java/org/example/Main.java`: Entry point of program; is also responsible for starting camera, grabbing frames, creating sub-images of said frames, calculating RGB averages,
and passing RGB values into array (which is passed to customJPanel in constructor).
* `src/main/java/org/example/customJPanel.java`: Class that extends abstract JPanel class; responsible for parsing RGB values from array and displaying appropriate ASCII symbol, per
cell, onto JPanel stored in JFrame.

### Code Flow Visualizer: 
* Main.java -> customJPanel.java

## Releases: 
* v1.0.0 - Contains all necessary code to capture camera frames and display them using an "ASCII Filter"; ultimately producing a video filter.
* v1.0.1 - Doubled resolution for finer images. Added more detailed comments in both Main.java and customJPaenl.java. Fixed symbol duplicate.

## How to run locally.
*COMING SOON*
