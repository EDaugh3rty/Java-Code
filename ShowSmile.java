/*Ethan Daugherty
Assignment 8
Date completed: November 12, 2021
Total Time Worked on Project: an hour and a half
Operating System: macOs
Description: 
   This program use javaFX to show a picture.*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class ShowSmile extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a circle and set its properties
    Circle circleFace = new Circle();
    circleFace.setCenterX(250);
    circleFace.setCenterY(250);
    circleFace.setRadius(200);
    circleFace.setStroke(Color.BLACK);
    circleFace.setFill(Color.YELLOW);
    
    Circle rightEye = new Circle();
    rightEye.setCenterX(150);
    rightEye.setCenterY(175);
    rightEye.setRadius(35);
    rightEye.setStroke(Color.BLACK);
    rightEye.setFill(Color.WHITE);
    
    Circle rightPupil = new Circle();
    rightPupil.setCenterX(150);
    rightPupil.setCenterY(175);
    rightPupil.setRadius(17);
    rightPupil.setStroke(Color.BLACK);
    rightPupil.setFill(Color.BLACK);
    
    Circle leftEye = new Circle();
    leftEye.setCenterX(350);
    leftEye.setCenterY(175);
    leftEye.setRadius(35);
    leftEye.setStroke(Color.BLACK);
    leftEye.setFill(Color.WHITE);
    
    Circle leftPupil = new Circle();
    leftPupil.setCenterX(350);
    leftPupil.setCenterY(175);
    leftPupil.setRadius(17);
    leftPupil.setStroke(Color.BLACK);
    leftPupil.setFill(Color.BLACK);
    
    Arc rightEyebrow = new Arc(350, 155, 75, 35, 65,80);
    rightEyebrow.setFill(Color.rgb(85,25,0));
    
    Arc leftEyebrow = new Arc(190, 155, 110, 45, 85,60);
    leftEyebrow.setFill(Color.rgb(85,25,0));
    
    Arc smile = new Arc(250, 120, 200, 245, 240,80);
    
    Line theNose = new Line(250,175,255,270);
    Line theNose1 = new Line(255,270,300,240);
    
    Ellipse theHat = new Ellipse(250,74,150,25);
      theHat.setFill(Color.rgb(65,64,64));
    Arc theHat1 = new Arc(250,50,120,45,-12,220);
      theHat1.setFill(Color.rgb(65,64,64));
    
  
    
        
        
    // Create a pane to hold the circle 
    Pane pane = new Pane();
    pane.getChildren().add(circleFace);
    pane.getChildren().add(rightEye);
    pane.getChildren().add(rightPupil);
    pane.getChildren().add(leftEye);
    pane.getChildren().add(leftPupil);
    pane.getChildren().add(rightEyebrow);
    pane.getChildren().add(leftEyebrow);
    pane.getChildren().add(smile);
    pane.getChildren().add(theNose);
    pane.getChildren().add(theNose1);
    pane.getChildren().add(theHat);
    pane.getChildren().add(theHat1);
    
    
    
    
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 500, 500);
    primaryStage.setTitle("I Don't Know"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}