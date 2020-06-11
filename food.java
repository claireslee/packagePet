import javafx.animation.Animation;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
public class food extends Application {
   double x = 300;
   double y = 300;
  
   @Override // Override the start method in the Application class
       public void start(Stage primaryStage) {
       StackPane sPane = new StackPane();
       Image bg = new Image("images/backgroundimage.jpg");
       ImageView park = new ImageView();
       park.setImage(bg);
      
       BorderPane bp = new BorderPane();
 
       HBox hBox = new HBox(10);
       VBox vBox = new VBox();

       sPane.getChildren().add(park);
       sPane.getChildren().add(bp);
     
       hBox.setAlignment(Pos.BOTTOM_CENTER);
       vBox.setPadding(new Insets(20, 50, 0, 0));
       vBox.setAlignment(Pos.BOTTOM_CENTER);
    
 
      
       Rectangle r1 = new Rectangle(40, x);
       r1.setStroke(Color.BLACK);
       r1.setFill(Color.BLACK);
       Rectangle r3 = new Rectangle(40, 300);
       r3.setStroke(Color.BLACK);
       r3.setFill(Color.WHITE);
      
       Rectangle r4 = new Rectangle(40, y);
       r4.setStroke(Color.BLACK);
       r4.setFill(Color.BLACK);
      
      
       Rectangle r5 = new Rectangle(40, 300);
       r5.setStroke(Color.BLACK);
       r5.setFill(Color.WHITE);
       Label l1 = new Label("Hunger");
       Label l2 = new Label("Cleanliness");
      
       sPane.getChildren().addAll(r3, r1, r5, r4, l1, l2);
       StackPane.setAlignment(r1, Pos.BOTTOM_LEFT);
       StackPane.setAlignment(r3, Pos.BOTTOM_LEFT);
       StackPane.setAlignment(r4, Pos.BOTTOM_RIGHT);
       StackPane.setAlignment(r5, Pos.BOTTOM_RIGHT);
      
       StackPane.setAlignment(l1, Pos.CENTER_LEFT);
       StackPane.setAlignment(l2, Pos.CENTER_RIGHT);
       // Create a handler for changing text
       EventHandler<ActionEvent> eventHandler = e -> {
           if (r1.getHeight() != 0) {
               x-=10;
               r1.setHeight(x);
           }
      
           else {
               x-=10;
               r1.setHeight(x);
           }
          
           if (r4.getHeight() != 0) {
               y-=15;
               r4.setHeight(y);
           }
  
           else {
               y-=15;
               r4.setHeight(y);
           }
       };
       // Create an animation for alternating text
       Timeline animation = new Timeline(
           new KeyFrame(Duration.millis(5000), eventHandler));
           animation.setCycleCount(Timeline.INDEFINITE);
           animation.play(); // Start animation
       // Pause and resume animation
       sPane.setOnMouseClicked(e -> {
           if (animation.getStatus() == Animation.Status.PAUSED) {
               animation.play();
           }
      
           else {
           animation.pause();
           }
       });
 
       Image image1 = new Image(getClass().getResourceAsStream("images/foodicon.png"));
       Button food = new Button("");
       food.setGraphic(new ImageView(image1));
       food.setOnAction(new EventHandler<ActionEvent>() {
           @Override public void handle(ActionEvent e) {
                Image doggyfood = new Image("images/doggyfood.png");
                ImageView bowl = new ImageView();
                bowl.setImage(doggyfood);
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
 
       StackPane.setAlignment(bp, Pos.BOTTOM_CENTER);
       bp.setCenter(vBox);
       bp.setBottom(hBox);
 
 
       // Create a scene and place it in the stage
       Scene scene = new Scene(sPane);
       primaryStage.setTitle("Package Pet"); // Set the stage title
       primaryStage.setScene(scene);
       bp.setMinSize(1200, 650);
       park.fitWidthProperty().bind(bp.widthProperty());
       park.fitHeightProperty().bind(bp.heightProperty()); // Place the scene in the stage
       primaryStage.show(); // Display the stage
   }
}
