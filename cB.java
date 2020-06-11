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
import javafx.scene.Node;
import javafx.scene.image.ImageView;
public class cB extends Application {
   double x = 300;
   double y = 300;
   boolean hatPressed = false;
   boolean necklacePressed = false;
   boolean glassesPressed = false;
  
   @Override // Override the start method in the Application class
       public void start(Stage primaryStage) {
       StackPane sPane = new StackPane();
       Image bg = new Image("images/backgroundimage.jpg");
    //    ImageView pet = new ImageView();
    //    pet.setImage(dog);
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
    //    }

        GridPane gpane = new GridPane();
        //gpane.getChildren().add(pet);
        // gpane.setPadding(new Insets(10, 10, 10, 10));
        gpane.setAlignment(Pos.CENTER);
        gpane.setHgap(5);
        gpane.setVgap(5);
        ImageView dog = new ImageView("images/dog.png");
        gpane.add(dog, 1, 1);

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
           if (r1.getHeight() != 0) {
               x-=10;
               r1.setHeight(x);
           }
      
           else {
               x-=10;
               r1.setHeight(x);
           }
          
           if (r4.getHeight() != 0) {
               y-=5;
               r4.setHeight(y);
           }
  
           else {
               y-=5;
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
               System.out.println("Accepted");
           }
       });
  
       Image image2 = new Image(getClass().getResourceAsStream("images/clothesicon.png"));
       //Image hat1 = new Image(getClass().getResourceAsStream("images/prettyhat.jpg")); 
    //  Image hat2 = new Image(getClass().getResourceAsStream("images/baseballhat.png"));
    //    Image bow = new Image(getClass().getResourceAsStream("images/bow.png")); 
    //    Image bowtie = new Image(getClass().getResourceAsStream("images/bowtie.jpg")); 
    Image hat3 = new Image(getClass().getResourceAsStream("images/cowboyhat.jpg")); 
    //    Image headband1 = new Image(getClass().getResourceAsStream("images/flowerheadband.jpg")); 
       Image glasses = new Image(getClass().getResourceAsStream("images/glasses.png")); 
    //    Image headband2 = new Image(getClass().getResourceAsStream("images/headband.png")); 
    //    Image necklace1 = new Image(getClass().getResourceAsStream("images/heartnecklace.jpg")); 
       Image necklace2 = new Image(getClass().getResourceAsStream("images/pearlnecklace.jpg")); 
    //    Image scarf = new Image(getClass().getResourceAsStream("images/scarf.jpg")); 
    //    Image sunglasses = new Image(getClass().getResourceAsStream("images/sunglasses.png")); 
    //    Image tie = new Image(getClass().getResourceAsStream("images/tie.png")); 
     //Image hat4 = new Image(getClass().getResourceAsStream("images/tophat.jpg")); 
    //    Image dogglasseshat = new Image(getClass().getResourceAsStream("images/dog-glasses,hat.png"));
    //    Image dogglassesneck = new Image(getClass().getResourceAsStream("images/dog-glasses,necklace.png")); 
    //    Image dogglassesneckhat = new Image(getClass().getResourceAsStream("images/dog-glasses,necklace,hat.png")); 
    //    Image dogglasses = new Image(getClass().getResourceAsStream("images/dog-glasses.png")); 
    //    Image doghat = new Image(getClass().getResourceAsStream("images/dog-hat.png"));
        ImageView doghat = new ImageView("images/dog-hat.png");
        ImageView dogglasseshat = new ImageView("images/dog-glasses,hat.png");
        ImageView dogglassesneck = new ImageView("images/dog-glasses,necklace.png");
        ImageView dogglassesneckhat = new ImageView("images/dog-glasses,necklace,hat.png");
        ImageView dogglasses = new ImageView("images/dog-glasses.png");
        ImageView dogneckhat = new ImageView("images/dog-necklace,hat.png");
        ImageView dogneck = new ImageView("images/dog-necklace.png");
        Image exitone = new Image(getClass().getResourceAsStream("images/exit.jpg")); 
        Image resetone = new Image(getClass().getResourceAsStream("images/reset.jpg")); 
        
    //    Image dogneckhat = new Image(getClass().getResourceAsStream("images/dog-necklace,hat.png")); 
    //    Image dogneck = new Image(getClass().getResourceAsStream("images/dog-necklace.png")); 
       Button clothes = new Button("");
       clothes.setGraphic(new ImageView(image2));
       clothes.setOnAction(new EventHandler<ActionEvent>() {
           @Override public void handle(ActionEvent e) {
            HBox cBox = new HBox();
            // Button hatone = new Button("");
            // hatone.setGraphic(new ImageView(hat1));
            // hatone.setOnAction(new EventHandler<ActionEvent>() {
            //     @Override public void handle(ActionEvent e) {
            //         System.out.println("Accepted");
            //     }
            // });
                // Button hattwo = new Button("");
                // hattwo.setGraphic(new ImageView(hat2));
                
                Button hatthree = new Button("");
                hatthree.setGraphic(new ImageView(hat3));
                hatthree.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent e) {
                        System.out.println("Accepted");
                        cBox.getChildren().remove(hatthree);
                        
                        gpane.getChildren().remove(dog);
                        gpane.add(doghat, 1, 1);

                        
                    }
                });
                
            // Button hatfour = new Button("");
            // hatfour.setGraphic(new ImageView(hat4));
            // hatfour.setOnAction(new EventHandler<ActionEvent>() {
            //     @Override public void handle(ActionEvent e) {
            //         System.out.println("Accepted");
            //     }
            // });
            //    Button necklaceone = new Button("");
            //    necklaceone.setGraphic(new ImageView(necklace1));
               Button necklacetwo = new Button("");
               necklacetwo.setGraphic(new ImageView(necklace2));
               necklacetwo.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                    System.out.println("Accepted");
                    cBox.getChildren().remove(necklacetwo);
                    gpane.getChildren().remove(dog);
                    gpane.add(dogneck, 1, 1);


                }
            });
            //    Button headbandone = new Button("");
            //    headbandone.setGraphic(new ImageView(headband1));
            //    Button headbandtwo = new Button("");
            //    headbandtwo.setGraphic(new ImageView(headband2));
                Button glassesone = new Button("");
               glassesone.setGraphic(new ImageView(glasses));
               glassesone.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                    System.out.println("Accepted");
                    cBox.getChildren().remove(glassesone);
                    gpane.getChildren().remove(dog);
                    gpane.add(dogglasses, 1, 1);
                }
            });




            Button reset = new Button("");
            reset.setGraphic(new ImageView(resetone));
            reset.setOnAction(new EventHandler<ActionEvent>() {
             @Override public void handle(ActionEvent e) {
                 System.out.println("Accepted");
            
                 gpane.getChildren().removeAll(doghat, dogneck, dogglasses);
                      gpane.add(dog, 1, 1);

                cBox.getChildren().removeAll(glassesone, hatthree, necklacetwo);
                cBox.getChildren().addAll(glassesone, hatthree, necklacetwo);
                

                } 
            });


            Button exit = new Button("");
               exit.setGraphic(new ImageView(exitone));
               exit.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                    System.out.println("Accepted");
                    cBox.getChildren().removeAll(glassesone, hatthree, necklacetwo, exit, reset);

                
                }
            });

           

                


            
            //    Button sunglassesone = new Button("");
            //    sunglassesone.setGraphic(new ImageView(sunglasses));
            //    Button tieone = new Button("");
            //    tieone.setGraphic(new ImageView(tie));
            //    Button bowtieone = new Button("");
            //    bowtieone.setGraphic(new ImageView(bowtie));
            //    Button bowone = new Button("");
            //    bowone.setGraphic(new ImageView(bow));
            //    Button scarfone = new Button("");
            //    scarfone.setGraphic(new ImageView(scarf));
            //    cBox.getChildren().addAll(scarfone, bowone, bowtieone, tieone, sunglassesone, glassesone, headbandone, headbandtwo, necklaceone, necklacetwo, hatfour, hatthree, hattwo, hatone);
                cBox.getChildren().addAll(glassesone, necklacetwo, hatthree, exit, reset);
                hBox.getChildren().add(cBox);

                bp.setTop(cBox);
               

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