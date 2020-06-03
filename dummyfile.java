import javafx.animation.Animation;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class dummyfile extends Application {
    double x = 70;
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
StackPane pane = new StackPane();
 // Place text into the stack pane

Rectangle r1 = new Rectangle(40, x);
r1.setStroke(Color.BLACK);
r1.setFill(Color.BLACK);


Rectangle r3 = new Rectangle(40, 70);
r3.setStroke(Color.BLACK);
r3.setFill(Color.WHITE);

pane.getChildren().addAll(r3, r1);

// Create a handler for changing text
EventHandler<ActionEvent> eventHandler = e -> {
if (r1.getHeight() != 0) {
x-=10;
r1.setHeight(x);
} 
else {
 
x-=10;
r1.setHeight(x);
} //15
};

// Create an animation for alternating text
Timeline animation = new Timeline(
new KeyFrame(Duration.millis(5000), eventHandler));
animation.setCycleCount(Timeline.INDEFINITE);
animation.play(); // Start animation

// Pause and resume animation
pane.setOnMouseClicked(e -> {
if (animation.getStatus() == Animation.Status.PAUSED) {
animation.play();
}
else {
animation.pause();
}
});

// Create a scene and place it in the stage
Scene scene = new Scene(pane, 250, 250);
primaryStage.setTitle("TimelineDemo"); // Set the stage title
primaryStage.setScene(scene); // Place the scene in the stage
primaryStage.show(); // Display the stage
}
}