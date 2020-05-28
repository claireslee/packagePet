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
    @Override 
    public void start(Stage primaryStage) {
    GridPane pane = new GridPane();

    Rectangle r1 = new Rectangle(40, 70, 70, 40);
    r1.setStroke(Color.BLACK);
    r1.setFill(Color.WHITE);

    double x = 70;
    Rectangle r2 = new Rectangle(40, 70, x, 40);
    r2.setStroke(Color.BLACK);
    r2.setFill(Color.BLACK);

    long mTime = System.currentTimeMillis();
    long end = mTime + 5000; // 5 seconds 
    while (System.currentTimeMillis() > end) {
        if (x==10){
            //kill it
        }
        else{
            x-=20;
            pane.getChildren().remove(r2);
            Rectangle r3 = new Rectangle(40, 70, x, 40);
            r3.setStroke(Color.BLACK);
            r3.setFill(Color.BLACK);

        }
    
    }
    pane.getChildren().addAll(r1, r2);
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("powerBar"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage


}
}