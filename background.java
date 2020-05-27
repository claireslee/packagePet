import javafx.application.Application;
//import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import javafx.scene.layout.StackPane;
//import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class background extends Application {
    @Override
    public void start (Stage primaryStage){

        GridPane pane = new GridPane();
        pane.add(new ImageView(new Image("images/backgroundpic.jpg")), 0, 0);

        Scene scene = new Scene(pane);
		primaryStage.setTitle("Package Pet"); 
		primaryStage.setScene(scene); 
		primaryStage.show();
    }
}