import java.time.Duration;
import java.util.Timer;
import java.util.TimerTask;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

public class powerBar extends Application {
    double x = 70;
    @Override 
    public void start(Stage primaryStage) {
    GridPane pane = new GridPane();

    Rectangle r1 = new Rectangle(40, 70, 70, 40);
    r1.setStroke(Color.BLACK);
    r1.setFill(Color.WHITE);

    Rectangle r2 = new Rectangle(40, 70, x, 40);
    r2.setStroke(Color.BLACK);
    r2.setFill(Color.BLACK);
    
        
    
    

    pane.getChildren().addAll(r1);
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("powerBar"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage


}
}