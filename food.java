import javafx.animation.Animation;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
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
import javafx.scene.Node;
import javafx.scene.image.ImageView;
public class food extends Application {
    double x = 300;
    double y = 300;
    @Override // Override the start method in the Application class
        public void start(Stage primaryStage) {
        StackPane sPane = new StackPane();
        Image bg = new Image("images/backgroundimage.jpg");
   //   ImageView pet = new ImageView();
   //   pet.setImage(dog);
        ImageView park = new ImageView();
        park.setImage(bg);
    
        BorderPane bp = new BorderPane();
        HBox hBox = new HBox(10);
        // VBox vBox = new VBox();
 
        sPane.getChildren().add(park);
        sPane.getChildren().add(bp);
     
   
        hBox.setAlignment(Pos.BOTTOM_CENTER);
        // vBox.setPadding(new Insets(20, 50, 0, 0));
        // vBox.setAlignment(Pos.BOTTOM_CENTER);
    //     @FXML
    //     private void doggie(ActionEvent event) throws Exception {
    //         GridPane gpane = new GridPane();
    //         gpane.getChildren().add(pet);
    //         Node source = (Node)event.getSource();
    //         Integer colIndex = GridPane.getColumnIndex(source);
    //         Integer rowIndex = GridPane.getRowIndex(source);
    //         GridPane.setConstraints(pet, colIndex, rowIndex);
    //      }
 
        GridPane gpane = new GridPane();
        //gpane.getChildren().add(pet);
        gpane.setPadding(new Insets(2, 2, 2, 2));
        gpane.setAlignment(Pos.CENTER);
        gpane.getColumnConstraints().add(new ColumnConstraints(100));
        gpane.getColumnConstraints().add(new ColumnConstraints(450));
        gpane.getColumnConstraints().add(new ColumnConstraints(100));
        gpane.getRowConstraints().add(new RowConstraints(200));
        gpane.getRowConstraints().add(new RowConstraints(300));
        gpane.getRowConstraints().add(new RowConstraints(100));
        // gpane.setHgap(5);
        // gpane.setVgap(10);
        ImageView dog = new ImageView("images/dog.png");
        gpane.add(dog, 1, 1);

        ImageView deaddog = new ImageView("images/deaddog.jpg");
        
        
        //  ColumnConstraints column1 = new ColumnConstraints(100,100,Double.MAX_VALUE);
        // ColumnConstraints column2 = new ColumnConstraints(100,100,Double.MAX_VALUE);
        // ColumnConstraints column3 = new ColumnConstraints(100,100,Double.MAX_VALUE);
        // gpane.getColumnConstraints().addAll(column1, column2, column3);
 
       // gpane.addAll(dog,9, 6);
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
            if (r1.getHeight() > 0) {
                x-=150; //x=10
                r1.setHeight(x);
            }
    
            else {
                //x-=10;
                //r1.setHeight(x);
                gpane.add(deaddog, 1, 1);
                gpane.getChildren().remove(dog);
                PauseTransition pause = new PauseTransition(
                    Duration.seconds(3) 
                );
                pause.setOnFinished(
                    event -> {
                    Rectangle blackrect = new Rectangle(2000, 2000);
                    blackrect.setFill(Color.BLACK);
                    sPane.getChildren().add(blackrect);

                    GridPane dgrid = new GridPane();
                    sPane.getChildren().add(dgrid);
                    dgrid.setAlignment(Pos.CENTER);

                    Label deathmsg = new Label("YOU HAVE STARVED TO DEATH!");
                    deathmsg.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                    deathmsg.setTextFill(Color.RED);
                    dgrid.add(deathmsg, 1, 1);

                    Button deadbt = new Button("Press to retry!");
                    dgrid.add(deadbt, 1, 2);
                    deadbt.setOnAction(new EventHandler<ActionEvent>() {
                        @Override public void handle(ActionEvent e) {
                        gpane.add(dog, 1, 1);
                        gpane.getChildren().remove(deaddog);
                        sPane.getChildren().remove(dgrid);
                        sPane.getChildren().remove(blackrect);
                        x+=300;
                        r1.setHeight(x);
                    }
                    });
                });
                pause.play();
        }
        
            if (r4.getHeight() != 0) {
                y-=5; //x=5
                r4.setHeight(y);
            }
            else {
                y-=5;
                r4.setHeight(y);
            }
        };

        //if (x == 0) {
            // dog.setImage(null);
            // System.gc();
            //gpane.add(deaddog, 1, 1);
            //gpane.getChildren().remove(dog);
        //}
    
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
                Button foodexit = new Button("");
 
                foodexit.setGraphic(new ImageView(doggyfood));
                foodexit.setStyle("-fx-background-color: transparent;");
                gpane.add(foodexit, 1, 2);

                foodexit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent e) {
                        gpane.getChildren().removeAll(foodexit);
                        if (x < 300 && x >= 1) {
                            x+=10;
                            r1.setHeight(x);
                        }
                    }
                });
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
        bp.setCenter(gpane);
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