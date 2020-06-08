import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
 
public class Bar extends Application {
 
    @Override 
    public void start(Stage primaryStage) throws Exception {
        BorderPane bp = new BorderPane();
 
        Scene scene = new Scene(bp);
        primaryStage.setTitle("Package Pet");
 
        HBox hBox = new HBox(10);
 
        VBox vBox = new VBox();
        VBox vBox2 = new VBox();
 
        hBox.setAlignment(Pos.CENTER);
 
        vBox.setPadding(new Insets(20, 50, 0, 0));
        vBox2.setPadding(new Insets(50, 75, 0, 0));
        vBox.setAlignment(Pos.BOTTOM_CENTER);
        vBox2.setAlignment(Pos.BOTTOM_CENTER);

    Image image1 = new Image(getClass().getResourceAsStream("images/foodicon.png"));
        Button food = new Button("");
        food.setGraphic(new ImageView(image1));
        food.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("Accepted");
            }
        });
    
        Image image2 = new Image(getClass().getResourceAsStream("images/clothesicon.png"));
        Button clothes = new Button("");
        clothes.setGraphic(new ImageView(image2));
        clothes.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("Accepted");
            }
        });
 
    Image image3 = new Image(getClass().getResourceAsStream("images/ballicon.jpg"));
        Button ball = new Button("");
        ball.setGraphic(new ImageView(image3));
        ball.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("Accepted");
            }
        });
        
    Image image4 = new Image(getClass().getResourceAsStream("images/showericon.png"));
        Button shower = new Button("");
        shower.setGraphic(new ImageView(image4));
        shower.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("Accepted");
            }
        });
 
    Image image5 = new Image(getClass().getResourceAsStream("images/deathicon.png"));   
        Button death = new Button("");
        death.setGraphic(new ImageView(image5));
        death.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("Accepted");
            }
        });
 
        hBox.getChildren().addAll(food);
        hBox.getChildren().addAll(clothes);
        hBox.getChildren().addAll(ball);
        hBox.getChildren().addAll(shower);
        hBox.getChildren().addAll(death);
 
        bp.setCenter(vBox);
        bp.setBottom(hBox);

        primaryStage.setScene(scene); 
        primaryStage.show(); 
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}