import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class background extends Application {
    @Override
    public void start (Stage primaryStage){

        Image bg = new Image("images/backgroundpic.jpg");
        ImageView park = new ImageView();
        park.setImage(bg);

        Pane pane = new Pane();
        Scene scene = new Scene(pane);
        HBox box = new HBox();
        box.getChildren().add(park);
        pane.getChildren().add(box);
        pane.setMinSize(0, 0);
        park.fitWidthProperty().bind(pane.widthProperty());
        park.fitHeightProperty().bind(pane.heightProperty());
		primaryStage.setTitle("Package Pet");
		primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}