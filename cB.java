import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.scene.shape.*;
import javafx.animation.PathTransition;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.animation.PathTransition.OrientationType;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
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
import javafx.geometry.Bounds;
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
   boolean baseballPressed = false;
   boolean bowPressed = false;
   boolean bowtiePressed = false;
   boolean flowerPressed = false;
   boolean heartPressed = false;
   boolean prettyhatPressed = false;
   boolean scarfPressed = false;
   boolean sunglassesPressed = false;
   boolean tiePressed = false;
   boolean tophatPressed = false;
   

   boolean playPressed = false;

  
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
       l1.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
        l1.setTextFill(Color.BLACK);

       Label l2 = new Label("Cleanliness");
       l2.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
        l2.setTextFill(Color.BLACK);
      
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
                Image doggyfood = new Image("images/doggyfood.png");
                Button foodexit = new Button("");
 
                foodexit.setGraphic(new ImageView(doggyfood));
                foodexit.setStyle("-fx-background-color: transparent;");
                gpane.add(foodexit, 1, 2);
                foodexit.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                    gpane.getChildren().removeAll(foodexit);
                    if (x < 300) {
                        x+=20;
                        r1.setHeight(x);
                    }

                    else if (x == 0) {
                        
                    }
                }
            });
        }
        });
  
       Image image2 = new Image(getClass().getResourceAsStream("images/clothesicon.png"));
       Image hat1 = new Image(getClass().getResourceAsStream("images/prettyhat.jpg")); 
      Image hat2 = new Image(getClass().getResourceAsStream("images/baseballhat.png"));
        Image bow = new Image(getClass().getResourceAsStream("images/bow.png")); 
        Image bowtie = new Image(getClass().getResourceAsStream("images/bowtie.jpg")); 
    Image hat3 = new Image(getClass().getResourceAsStream("images/cowboyhat.jpg")); 
        Image headband1 = new Image(getClass().getResourceAsStream("images/flowerheadband.jpg")); 
       Image glasses = new Image(getClass().getResourceAsStream("images/glasses.png")); 
        Image necklace1 = new Image(getClass().getResourceAsStream("images/heartnecklace.jpg")); 
       Image necklace2 = new Image(getClass().getResourceAsStream("images/pearlnecklace.jpg")); 
        Image scarf = new Image(getClass().getResourceAsStream("images/scarf.jpg")); 
        Image sunglasses = new Image(getClass().getResourceAsStream("images/sunglasses.png")); 
        Image tie = new Image(getClass().getResourceAsStream("images/tie.png")); 
     Image hat4 = new Image(getClass().getResourceAsStream("images/tophat.jpg")); 
     Image exitone = new Image(getClass().getResourceAsStream("images/exit.jpg")); 
     Image resetone = new Image(getClass().getResourceAsStream("images/reset.jpg")); 
        ImageView doghat = new ImageView("images/dog-hat.png");
        ImageView dogglasseshat = new ImageView("images/dog-glasses-hat.png");
        ImageView dogglassesneck = new ImageView("images/dog-glasses-necklace.png");
        ImageView dogglassesneckhat = new ImageView("images/dog-glasses-necklace-hat.png");
        ImageView dogglasses = new ImageView("images/dog-glasses.png");
        ImageView dogneckhat = new ImageView("images/dog-necklace-hat.png");
        ImageView dogneck = new ImageView("images/dog-necklace.png");
        ImageView dogbaseballbowtie = new ImageView("images/dog-baseball-bowtie.png");
        ImageView dogbaseballglassesbowtie= new ImageView("images/dog-baseball-glasses-bowtie.png");
        ImageView dogbaseballglassesheart = new ImageView("images/dog-baseball-glasses-heart.png");
        ImageView dogbaseballglassespearl = new ImageView("images/dog-baseball-glasses-pearl.png");
        ImageView dogbaseballglassesscarf = new ImageView("images/dog-baseball-glasses-scarf.png");
        ImageView dogbaseballglassestie = new ImageView("images/dog-baseball-glasses-tie.png");
        ImageView dogbaseballglasses = new ImageView("images/dog-baseball-glasses.png");
        ImageView dogbaseballheart = new ImageView("images/dog-baseball-heart.png");
        ImageView dogbaseballpearl = new ImageView("images/dog-baseball-pearl.png");
        ImageView dogbaseballscarf = new ImageView("images/dog-baseball-scarf.png");
        ImageView dogbaseballsunglassesbowtie = new ImageView("images/dog-baseball-sunglasses-bowtie.png");
        ImageView dogbaseballsunglassesheart = new ImageView("images/dog-baseball-sunglasses-heart.png");
        ImageView dogbaseballsunglassespearl = new ImageView("images/dog-baseball-sunglasses-pearl.png");
        ImageView dogbaseballsunglassesscarf = new ImageView("images/dog-baseball-sunglasses-scarf.png");
        ImageView dogbaseballsunglassestie = new ImageView("images/dog-baseball-sunglasses-tie.png");
        ImageView dogbaseballsunglasses = new ImageView("images/dog-baseball-sunglasses.png");
        ImageView dogbaseballtie = new ImageView("images/dog-baseball-tie.png");
        ImageView dogbaseball = new ImageView("images/dog-baseballhat.png");
        ImageView dogbowbowtie = new ImageView("images/dog-bow-bowtie.png");
        ImageView dogbowglassesbowtie = new ImageView("images/dog-bow-glasses-bowtie.png");
        ImageView dogbowglassesheart = new ImageView("images/dog-bow-glasses-heart.png");
        ImageView dogbowglassespearl = new ImageView("images/dog-bow-glasses-pearl.png");
        ImageView dogbowglassesscarf = new ImageView("images/dog-bow-glasses-scarf.png");
        ImageView dogbowglassestie = new ImageView("images/dog-bow-glasses-tie.png");
        ImageView dogbowglasses = new ImageView("images/dog-bow-glasses.png");
        ImageView dogbowheart = new ImageView("images/dog-bow-heart.png");
        ImageView dogbowpearl = new ImageView("images/dog-bow-pearl.png");
        ImageView dogbowscarf = new ImageView("images/dog-bow-scarf.png");
        ImageView dogbowsunglassesbowtie = new ImageView("images/dog-bow-sunglasses-bowtie.png");
        ImageView dogbowsunglassesheart = new ImageView("images/dog-bow-sunglasses-heart.png");
        ImageView dogbowsunglassespearl = new ImageView("images/dog-bow-sunglasses-pearl.png");
        ImageView dogbowsunglassesscarf = new ImageView("images/dog-bow-sunglasses-scarf.png");
        ImageView dogbowsunglassestie = new ImageView("images/dog-bow-sunglasses-tie.png");
        ImageView dogbowsunglasses = new ImageView("images/dog-bow-sunglasses.png");
        ImageView dogbowTie = new ImageView("images/dog-bow-tie.png");
        ImageView dogbow = new ImageView("images/dog-bow.png");
        ImageView dogbowtie = new ImageView("images/dog-bowtie.png");
        ImageView dogflowerbowtie = new ImageView("images/dog-flower-bowtie.png");
        ImageView dogflowerglassesbowtie = new ImageView("images/dog-flower-glasses-bowtie.png");
        ImageView dogflowerglassesheart = new ImageView("images/dog-flower-glasses-heart.png");
        ImageView dogflowerglassespearl = new ImageView("images/dog-flower-glasses-pearl.png");
        ImageView dogflowerglassesscarf = new ImageView("images/dog-flower-glasses-scarf.png");
        ImageView dogflowerglassestie = new ImageView("images/dog-flower-glasses-tie.png");
        ImageView dogflowerglasses = new ImageView("images/dog-flower-glasses.png");
        ImageView dogflowerheart = new ImageView("images/dog-flower-heart.png");
        ImageView dogflowerpearl = new ImageView("images/dog-flower-pearl.png");
        ImageView dogflowerscarf = new ImageView("images/dog-flower-scarf.png");
        ImageView dogflowersunglassesbowtie = new ImageView("images/dog-flower-sunglasses-bowtie.png");
        ImageView dogflowersunglassesheart = new ImageView("images/dog-flower-sunglasses-heart.png");
        ImageView dogflowersunglassespearl = new ImageView("images/dog-flower-sunglasses-pearl.png");
        ImageView dogflowersunglassesscarf = new ImageView("images/dog-flower-sunglasses-scarf.png");
        ImageView dogflowersunglassestie = new ImageView("images/dog-flower-sunglasses-tie.png");
        ImageView dogflowersunglasses = new ImageView("images/dog-flower-sunglasses.png");
        ImageView dogflowertie = new ImageView("images/dog-flower-tie.png");
        ImageView dogflower = new ImageView("images/dog-flower.png");
        ImageView dogglassesbowtie = new ImageView("images/dog-glasses-bowtie.png");
        ImageView dogglassesheart = new ImageView("images/dog-glasses-heart.png");
        ImageView dogglassesscarf = new ImageView("images/dog-glasses-scarf.png");
        ImageView dogglassestie = new ImageView("images/dog-glasses-tie.png");
        ImageView doghatbowtie = new ImageView("images/dog-hat-bowtie.png");
        ImageView doghatglassesbowtie = new ImageView("images/dog-hat-glasses-bowtie.png");
        ImageView doghatglassesheart = new ImageView("images/dog-hat-glasses-heart.png");
        ImageView doghatglassesscarf = new ImageView("images/dog-hat-glasses-scarf.png");
        ImageView doghatglassestie = new ImageView("images/dog-hat-glasses-tie.png");
        ImageView doghatheart = new ImageView("images/dog-hat-heart.png");
        ImageView doghatscarf = new ImageView("images/dog-hat-scarf.png");
        ImageView doghatsunglassesbowtie = new ImageView("images/dog-hat-sunglasses-bowtie.png");
        ImageView doghatsunglassesheart = new ImageView("images/dog-hat-sunglasses-heart.png");
        ImageView doghatsunglassesnecklace = new ImageView("images/dog-hat-sunglasses-necklace.png");
        ImageView doghatsunglassestie = new ImageView("images/dog-hat-sunglasses-tie.png");
        ImageView doghatsunglassesscarf = new ImageView("images/dog-hat-sunglasses-scarf.png");
        ImageView doghatsunglasses = new ImageView("images/dog-hat-sunglasses.png");
        ImageView doghattie = new ImageView("images/dog-hat-tie.png");
        ImageView dogheart = new ImageView("images/dog-heart.png");
        ImageView dogprettyhatbowtie = new ImageView("images/dog-prettyhat-bowtie.png");
        ImageView dogprettyhatglassesbowtie = new ImageView("images/dog-prettyhat-glasses-bowtie.png");
        ImageView dogprettyhatglassesheart = new ImageView("images/dog-prettyhat-glasses-heart.png");
        ImageView dogprettyhatglassespearl = new ImageView("images/dog-prettyhat-glasses-pearl.png");
        ImageView dogprettyhatglassesscarf = new ImageView("images/dog-prettyhat-glasses-scarf.png");
        ImageView dogprettyhatglassestie = new ImageView("images/dog-prettyhat-glasses-tie.png");
        ImageView dogprettyhatglasses = new ImageView("images/dog-prettyhat-glasses.png");
        ImageView dogprettyhatheart = new ImageView("images/dog-prettyhat-heart.png");
        ImageView dogprettyhatpearl = new ImageView("images/dog-prettyhat-pearl.png");
        ImageView dogprettyhatscarf = new ImageView("images/dog-prettyhat-scarf.png");
        ImageView dogprettyhatsunglassesbowtie = new ImageView("images/dog-prettyhat-sunglasses-bowtie.png");
        ImageView dogprettyhatsunglassesheart = new ImageView("images/dog-prettyhat-sunglasses-heart.png");
        ImageView dogprettyhatsunglassespearl = new ImageView("images/dog-prettyhat-sunglasses-pearl.png");
        ImageView dogprettyhatsunglassesscarf = new ImageView("images/dog-prettyhat-sunglasses-scarf.png");
        ImageView dogprettyhatsunglassestie = new ImageView("images/dog-prettyhat-sunglasses-tie.png");
        ImageView dogprettyhatsunglasses = new ImageView("images/dog-prettyhat-sunglasses.png");
        ImageView dogprettyhattie = new ImageView("images/dog-prettyhat-tie.png");
        ImageView dogprettyhat = new ImageView("images/dog-prettyhat.png");
        ImageView dogscarf = new ImageView("images/dog-scarf.png");
        ImageView dogsunglassesbowtie = new ImageView("images/dog-sunglasses-bowtie.png");
        ImageView dogsunglassesheart = new ImageView("images/dog-sunglasses-heart.png");
        ImageView dogsunglassespearl = new ImageView("images/dog-sunglasses-pearl.png");
        ImageView dogsunglassesscarf = new ImageView("images/dog-sunglasses-scarf.png");
        ImageView dogsunglassestie = new ImageView("images/dog-sunglasses-tie.png");
        ImageView dogsunglasses = new ImageView("images/dog-sunglasses.png");
        ImageView dogtie = new ImageView("images/dog-tie.png");
        ImageView dogtophatbowtie = new ImageView("images/dog-tophat-bowtie.png");
        ImageView dogtophatglassesbowtie = new ImageView("images/dog-tophat-glasses-bowtie.png");
        ImageView dogtophatglassesheart = new ImageView("images/dog-tophat-glasses-heart.png");
        ImageView dogtophatglassespearl = new ImageView("images/dog-tophat-glasses-pearl.png");
        ImageView dogtophatglassesscarf = new ImageView("images/dog-tophat-glasses-scarf.png");
        ImageView dogtophatglassestie = new ImageView("images/dog-tophat-glasses-tie.png");
        ImageView dogtophatglasses = new ImageView("images/dog-tophat-glasses.png");
        ImageView dogtophatheart = new ImageView("images/dog-tophat-heart.png");
        ImageView dogtophatpearl = new ImageView("images/dog-tophat-pearl.png");
        ImageView dogtophatscarf = new ImageView("images/dog-tophat-scarf.png");
        ImageView dogtophatsunglassesbowtie = new ImageView("images/dog-tophat-sunglasses-bowtie.png");
        ImageView dogtophatsunglassesheart = new ImageView("images/dog-tophat-sunglasses-heart.png");
        ImageView dogtophatsunglassespearl = new ImageView("images/dog-tophat-sunglasses-pearl.png");
        ImageView dogtophatsunglassesscarf = new ImageView("images/dog-tophat-sunglasses-scarf.png");
        ImageView dogtophatsunglassestie = new ImageView("images/dog-tophat-sunglasses-tie.png");
        ImageView dogtophatsunglasses = new ImageView("images/dog-tophat-sunglasses.png");
        ImageView dogtophattie = new ImageView("images/dog-tophat-tie.png");
        ImageView dogtophat = new ImageView("images/dog-tophat.png");


        
       Button clothes = new Button("");
       clothes.setGraphic(new ImageView(image2));
       clothes.setOnAction(new EventHandler<ActionEvent>() {
           @Override public void handle(ActionEvent e) {
            HBox cBox = new HBox();
                
                Button hatthree = new Button("");
                hatthree.setGraphic(new ImageView(hat3));
                hatthree.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent e) {

                        System.out.println("Accepted");
                        cBox.getChildren().remove(hatthree);
                        hatPressed = true;
                        baseballPressed = false;
                        bowPressed = false;
                        flowerPressed = false;
                        prettyhatPressed = false;
                        tophatPressed = false;
                        
                        gpane.getChildren().removeAll(dog, dogglasses, dogneck, dogneckhat, dogglassesneck, dogglassesneckhat, dogglasseshat, 
                        dogbaseballbowtie, dogbaseballglassesbowtie, dogbaseball, dogbaseballglasses, dogbaseballglassesheart, dogbaseballglassespearl, 
                        dogbaseballglassesscarf, dogbaseballglassestie, dogbaseballheart, dogbaseballpearl, dogbaseballscarf, dogbaseballsunglasses, 
                        dogbaseballsunglassesbowtie, dogbaseballsunglassesheart, dogbaseballsunglassespearl, dogbaseballsunglassesscarf, 
                        dogbaseballsunglassestie, dogbaseballtie, dogbow, dogbowTie, dogbowbowtie, dogbowglasses, dogbowglassesbowtie, dogbowglassesheart,
                        dogbowglassespearl, dogbowglassesscarf, dogbowglassestie, dogbowheart, dogbowpearl, dogbowscarf, dogbowsunglasses,
                        dogbowsunglassesbowtie, dogbowsunglassesheart, dogbowsunglassespearl, dogbowsunglassesscarf, dogbowsunglassestie, dogbowtie,
                        dogflowerbowtie, dogflowerglasses, dogflowerglassesbowtie, dogflowerglassesheart, dogflowerglassespearl, dogflowerglassesscarf,
                        dogflowerheart, dogflowerpearl, dogflowerscarf, dogflowersunglassesbowtie, dogflowersunglassesheart, 
                        dogflowerglassestie, dogflower, dogflowersunglasses, dogflowersunglassespearl, dogflowersunglassesscarf, dogflowersunglassestie,
                        dogflowertie, dogglassesbowtie, dogglassesheart, dogglassesscarf, dogglassestie, doghat, doghatbowtie, doghatglassesbowtie,
                        doghatglassesheart, doghatglassesscarf, doghatglassestie, doghatheart, doghatscarf, doghatsunglasses, doghatsunglassesbowtie,
                        doghatsunglassesheart, doghatsunglassesnecklace, doghatsunglassesscarf, doghatsunglassestie, doghattie, dogheart, dogprettyhat,
                        dogprettyhatbowtie, dogprettyhatglasses, dogprettyhatglassesbowtie, dogprettyhatglassesheart, dogprettyhatglassespearl,
                        dogprettyhatglassesscarf, dogprettyhatglassestie, dogprettyhatheart, dogprettyhatpearl, dogprettyhatscarf, dogprettyhatsunglasses,
                        dogprettyhatsunglassesbowtie, dogprettyhatsunglassesheart, dogprettyhatsunglassespearl, dogprettyhatsunglassesscarf, dogprettyhatsunglassestie,
                        dogprettyhattie, dogscarf, dogsunglasses, dogsunglassesbowtie, dogsunglassesheart, dogsunglassespearl, dogsunglassesscarf,
                        dogsunglassestie, dogtie, dogtophat, dogtophatbowtie, dogtophatglasses, dogtophatglassesbowtie, dogtophatglassesheart,
                        dogtophatglassespearl, dogtophatglassesscarf, dogtophatglassestie, dogtophatheart, dogtophatpearl, dogtophatscarf, dogtophatsunglasses,
                        dogtophatsunglassesbowtie, dogtophatsunglassesheart, dogtophatsunglassespearl, dogtophatsunglassesscarf, dogtophatsunglassestie, dogtophattie);
                        if (hatPressed == true && glassesPressed == false && necklacePressed == false && baseballPressed == false && bowPressed == false &&
                        bowtiePressed == false && flowerPressed == false && heartPressed == false && prettyhatPressed == false && scarfPressed == false &&
                        sunglassesPressed == false && tiePressed == false && tophatPressed == false){
                            gpane.add(doghat, 1, 1);
                            gpane.getChildren().removeAll(dog, dogglasses, dogneck, dogneckhat, dogglassesneck, dogglassesneckhat, dogglasseshat, 
                            dogbaseballbowtie, dogbaseballglassesbowtie, dogbaseball, dogbaseballglasses, dogbaseballglassesheart, dogbaseballglassespearl, 
                            dogbaseballglassesscarf, dogbaseballglassestie, dogbaseballheart, dogbaseballpearl, dogbaseballscarf, dogbaseballsunglasses, 
                            dogbaseballsunglassesbowtie, dogbaseballsunglassesheart, dogbaseballsunglassespearl, dogbaseballsunglassesscarf, 
                            dogbaseballsunglassestie, dogbaseballtie, dogbow, dogbowTie, dogbowbowtie, dogbowglasses, dogbowglassesbowtie, dogbowglassesheart,
                            dogbowglassespearl, dogbowglassesscarf, dogbowglassestie, dogbowheart, dogbowpearl, dogbowscarf, dogbowsunglasses,
                            dogbowsunglassesbowtie, dogbowsunglassesheart, dogbowsunglassespearl, dogbowsunglassesscarf, dogbowsunglassestie, dogbowtie,
                            dogflowerbowtie, dogflowerglasses, dogflowerglassesbowtie, dogflowerglassesheart, dogflowerglassespearl, dogflowerglassesscarf,
                            dogflowerheart, dogflowerpearl, dogflowerscarf, dogflowersunglassesbowtie, dogflowersunglassesheart, 
                            dogflowerglassestie, dogflower, dogflowersunglasses, dogflowersunglassespearl, dogflowersunglassesscarf, dogflowersunglassestie,
                            dogflowertie, dogglassesbowtie, dogglassesheart, dogglassesscarf, dogglassestie, doghatbowtie, doghatglassesbowtie,
                            doghatglassesheart, doghatglassesscarf, doghatglassestie, doghatheart, doghatscarf, doghatsunglasses, doghatsunglassesbowtie,
                            doghatsunglassesheart, doghatsunglassesnecklace, doghatsunglassesscarf, doghatsunglassestie, doghattie, dogheart, dogprettyhat,
                            dogprettyhatbowtie, dogprettyhatglasses, dogprettyhatglassesbowtie, dogprettyhatglassesheart, dogprettyhatglassespearl,
                            dogprettyhatglassesscarf, dogprettyhatglassestie, dogprettyhatheart, dogprettyhatpearl, dogprettyhatscarf, dogprettyhatsunglasses,
                            dogprettyhatsunglassesbowtie, dogprettyhatsunglassesheart, dogprettyhatsunglassespearl, dogprettyhatsunglassesscarf, dogprettyhatsunglassestie,
                            dogprettyhattie, dogscarf, dogsunglasses, dogsunglassesbowtie, dogsunglassesheart, dogsunglassespearl, dogsunglassesscarf,
                            dogsunglassestie, dogtie, dogtophat, dogtophatbowtie, dogtophatglasses, dogtophatglassesbowtie, dogtophatglassesheart,
                            dogtophatglassespearl, dogtophatglassesscarf, dogtophatglassestie, dogtophatheart, dogtophatpearl, dogtophatscarf, dogtophatsunglasses,
                            dogtophatsunglassesbowtie, dogtophatsunglassesheart, dogtophatsunglassespearl, dogtophatsunglassesscarf, dogtophatsunglassestie, dogtophattie);
                            }
                        if (hatPressed == true && glassesPressed == true && necklacePressed == false && baseballPressed == false && bowPressed == false &&
                        bowtiePressed == false && flowerPressed == false && heartPressed == false && prettyhatPressed == false && scarfPressed == false &&
                        sunglassesPressed == false && tiePressed == false && tophatPressed == false){
                            gpane.add(dogglasseshat, 1, 1);
                            gpane.getChildren().removeAll(dog, dogglasses, dogneck, dogneckhat, dogglassesneck, dogglassesneckhat,
                            dogbaseballbowtie, dogbaseballglassesbowtie, dogbaseball, dogbaseballglasses, dogbaseballglassesheart, dogbaseballglassespearl, 
                            dogbaseballglassesscarf, dogbaseballglassestie, dogbaseballheart, dogbaseballpearl, dogbaseballscarf, dogbaseballsunglasses, 
                            dogbaseballsunglassesbowtie, dogbaseballsunglassesheart, dogbaseballsunglassespearl, dogbaseballsunglassesscarf, 
                            dogbaseballsunglassestie, dogbaseballtie, dogbow, dogbowTie, dogbowbowtie, dogbowglasses, dogbowglassesbowtie, dogbowglassesheart,
                            dogbowglassespearl, dogbowglassesscarf, dogbowglassestie, dogbowheart, dogbowpearl, dogbowscarf, dogbowsunglasses,
                            dogbowsunglassesbowtie, dogbowsunglassesheart, dogbowsunglassespearl, dogbowsunglassesscarf, dogbowsunglassestie, dogbowtie,
                            dogflowerbowtie, dogflowerglasses, dogflowerglassesbowtie, dogflowerglassesheart, dogflowerglassespearl, dogflowerglassesscarf,
                            dogflowerheart, dogflowerpearl, dogflowerscarf, dogflowersunglassesbowtie, dogflowersunglassesheart, 
                            dogflowerglassestie, dogflower, dogflowersunglasses, dogflowersunglassespearl, dogflowersunglassesscarf, dogflowersunglassestie,
                            dogflowertie, dogglassesbowtie, dogglassesheart, dogglassesscarf, dogglassestie, doghatbowtie, doghatglassesbowtie, doghat,
                            doghatglassesheart, doghatglassesscarf, doghatglassestie, doghatheart, doghatscarf, doghatsunglasses, doghatsunglassesbowtie,
                            doghatsunglassesheart, doghatsunglassesnecklace, doghatsunglassesscarf, doghatsunglassestie, doghattie, dogheart, dogprettyhat,
                            dogprettyhatbowtie, dogprettyhatglasses, dogprettyhatglassesbowtie, dogprettyhatglassesheart, dogprettyhatglassespearl,
                            dogprettyhatglassesscarf, dogprettyhatglassestie, dogprettyhatheart, dogprettyhatpearl, dogprettyhatscarf, dogprettyhatsunglasses,
                            dogprettyhatsunglassesbowtie, dogprettyhatsunglassesheart, dogprettyhatsunglassespearl, dogprettyhatsunglassesscarf, dogprettyhatsunglassestie,
                            dogprettyhattie, dogscarf, dogsunglasses, dogsunglassesbowtie, dogsunglassesheart, dogsunglassespearl, dogsunglassesscarf,
                            dogsunglassestie, dogtie, dogtophat, dogtophatbowtie, dogtophatglasses, dogtophatglassesbowtie, dogtophatglassesheart,
                            dogtophatglassespearl, dogtophatglassesscarf, dogtophatglassestie, dogtophatheart, dogtophatpearl, dogtophatscarf, dogtophatsunglasses,
                            dogtophatsunglassesbowtie, dogtophatsunglassesheart, dogtophatsunglassespearl, dogtophatsunglassesscarf, dogtophatsunglassestie, dogtophattie);
                        }
                        if (hatPressed == true && glassesPressed == true && necklacePressed == true){
                            gpane.add(dogglassesneckhat, 1, 1);
                            gpane.getChildren().removeAll(dog, dogglasses, dogneck, dogneckhat, dogglassesneck, dogglasseshat, 
                            dogbaseballbowtie, dogbaseballglassesbowtie, dogbaseball, dogbaseballglasses, dogbaseballglassesheart, dogbaseballglassespearl, 
                            dogbaseballglassesscarf, dogbaseballglassestie, dogbaseballheart, dogbaseballpearl, dogbaseballscarf, dogbaseballsunglasses, 
                            dogbaseballsunglassesbowtie, dogbaseballsunglassesheart, dogbaseballsunglassespearl, dogbaseballsunglassesscarf, 
                            dogbaseballsunglassestie, dogbaseballtie, dogbow, dogbowTie, dogbowbowtie, dogbowglasses, dogbowglassesbowtie, dogbowglassesheart,
                            dogbowglassespearl, dogbowglassesscarf, dogbowglassestie, dogbowheart, dogbowpearl, dogbowscarf, dogbowsunglasses,
                            dogbowsunglassesbowtie, dogbowsunglassesheart, dogbowsunglassespearl, dogbowsunglassesscarf, dogbowsunglassestie, dogbowtie,
                            dogflowerbowtie, dogflowerglasses, dogflowerglassesbowtie, dogflowerglassesheart, dogflowerglassespearl, dogflowerglassesscarf,
                            dogflowerheart, dogflowerpearl, dogflowerscarf, dogflowersunglassesbowtie, dogflowersunglassesheart, 
                            dogflowerglassestie, dogflower, dogflowersunglasses, dogflowersunglassespearl, dogflowersunglassesscarf, dogflowersunglassestie,
                            dogflowertie, dogglassesbowtie, dogglassesheart, dogglassesscarf, dogglassestie, doghatbowtie, doghatglassesbowtie, doghat,
                            doghatglassesheart, doghatglassesscarf, doghatglassestie, doghatheart, doghatscarf, doghatsunglasses, doghatsunglassesbowtie,
                            doghatsunglassesheart, doghatsunglassesnecklace, doghatsunglassesscarf, doghatsunglassestie, doghattie, dogheart, dogprettyhat,
                            dogprettyhatbowtie, dogprettyhatglasses, dogprettyhatglassesbowtie, dogprettyhatglassesheart, dogprettyhatglassespearl,
                            dogprettyhatglassesscarf, dogprettyhatglassestie, dogprettyhatheart, dogprettyhatpearl, dogprettyhatscarf, dogprettyhatsunglasses,
                            dogprettyhatsunglassesbowtie, dogprettyhatsunglassesheart, dogprettyhatsunglassespearl, dogprettyhatsunglassesscarf, dogprettyhatsunglassestie,
                            dogprettyhattie, dogscarf, dogsunglasses, dogsunglassesbowtie, dogsunglassesheart, dogsunglassespearl, dogsunglassesscarf,
                            dogsunglassestie, dogtie, dogtophat, dogtophatbowtie, dogtophatglasses, dogtophatglassesbowtie, dogtophatglassesheart,
                            dogtophatglassespearl, dogtophatglassesscarf, dogtophatglassestie, dogtophatheart, dogtophatpearl, dogtophatscarf, dogtophatsunglasses,
                            dogtophatsunglassesbowtie, dogtophatsunglassesheart, dogtophatsunglassespearl, dogtophatsunglassesscarf, dogtophatsunglassestie, dogtophattie);
                        }
                        if (hatPressed == true && glassesPressed == false && necklacePressed == true){
                            gpane.add(dogneckhat, 1, 1);
                            gpane.getChildren().removeAll(dog, dogglasses, dogneck, dogglassesneck, dogglassesneckhat, dogglasseshat, 
                            dogbaseballbowtie, dogbaseballglassesbowtie, dogbaseball, dogbaseballglasses, dogbaseballglassesheart, dogbaseballglassespearl, 
                            dogbaseballglassesscarf, dogbaseballglassestie, dogbaseballheart, dogbaseballpearl, dogbaseballscarf, dogbaseballsunglasses, 
                            dogbaseballsunglassesbowtie, dogbaseballsunglassesheart, dogbaseballsunglassespearl, dogbaseballsunglassesscarf, 
                            dogbaseballsunglassestie, dogbaseballtie, dogbow, dogbowTie, dogbowbowtie, dogbowglasses, dogbowglassesbowtie, dogbowglassesheart,
                            dogbowglassespearl, dogbowglassesscarf, dogbowglassestie, dogbowheart, dogbowpearl, dogbowscarf, dogbowsunglasses,
                            dogbowsunglassesbowtie, dogbowsunglassesheart, dogbowsunglassespearl, dogbowsunglassesscarf, dogbowsunglassestie, dogbowtie,
                            dogflowerbowtie, dogflowerglasses, dogflowerglassesbowtie, dogflowerglassesheart, dogflowerglassespearl, dogflowerglassesscarf,
                            dogflowerheart, dogflowerpearl, dogflowerscarf, dogflowersunglassesbowtie, dogflowersunglassesheart, 
                            dogflowerglassestie, dogflower, dogflowersunglasses, dogflowersunglassespearl, dogflowersunglassesscarf, dogflowersunglassestie,
                            dogflowertie, dogglassesbowtie, dogglassesheart, dogglassesscarf, dogglassestie, doghatbowtie, doghatglassesbowtie, doghat,
                            doghatglassesheart, doghatglassesscarf, doghatglassestie, doghatheart, doghatscarf, doghatsunglasses, doghatsunglassesbowtie,
                            doghatsunglassesheart, doghatsunglassesnecklace, doghatsunglassesscarf, doghatsunglassestie, doghattie, dogheart, dogprettyhat,
                            dogprettyhatbowtie, dogprettyhatglasses, dogprettyhatglassesbowtie, dogprettyhatglassesheart, dogprettyhatglassespearl,
                            dogprettyhatglassesscarf, dogprettyhatglassestie, dogprettyhatheart, dogprettyhatpearl, dogprettyhatscarf, dogprettyhatsunglasses,
                            dogprettyhatsunglassesbowtie, dogprettyhatsunglassesheart, dogprettyhatsunglassespearl, dogprettyhatsunglassesscarf, dogprettyhatsunglassestie,
                            dogprettyhattie, dogscarf, dogsunglasses, dogsunglassesbowtie, dogsunglassesheart, dogsunglassespearl, dogsunglassesscarf,
                            dogsunglassestie, dogtie, dogtophat, dogtophatbowtie, dogtophatglasses, dogtophatglassesbowtie, dogtophatglassesheart,
                            dogtophatglassespearl, dogtophatglassesscarf, dogtophatglassestie, dogtophatheart, dogtophatpearl, dogtophatscarf, dogtophatsunglasses,
                            dogtophatsunglassesbowtie, dogtophatsunglassesheart, dogtophatsunglassespearl, dogtophatsunglassesscarf, dogtophatsunglassestie, dogtophattie);
                        }
                        if (necklacePressed == true && hatPressed == false && glassesPressed == false){
                            gpane.add(dogneck, 1, 1);
                            gpane.getChildren().removeAll(dog, dogglasses, dogneckhat, dogglassesneck, dogglassesneckhat, dogglasseshat, 
                            dogbaseballbowtie, dogbaseballglassesbowtie, dogbaseball, dogbaseballglasses, dogbaseballglassesheart, dogbaseballglassespearl, 
                            dogbaseballglassesscarf, dogbaseballglassestie, dogbaseballheart, dogbaseballpearl, dogbaseballscarf, dogbaseballsunglasses, 
                            dogbaseballsunglassesbowtie, dogbaseballsunglassesheart, dogbaseballsunglassespearl, dogbaseballsunglassesscarf, 
                            dogbaseballsunglassestie, dogbaseballtie, dogbow, dogbowTie, dogbowbowtie, dogbowglasses, dogbowglassesbowtie, dogbowglassesheart,
                            dogbowglassespearl, dogbowglassesscarf, dogbowglassestie, dogbowheart, dogbowpearl, dogbowscarf, dogbowsunglasses,
                            dogbowsunglassesbowtie, dogbowsunglassesheart, dogbowsunglassespearl, dogbowsunglassesscarf, dogbowsunglassestie, dogbowtie,
                            dogflowerbowtie, dogflowerglasses, dogflowerglassesbowtie, dogflowerglassesheart, dogflowerglassespearl, dogflowerglassesscarf,
                            dogflowerheart, dogflowerpearl, dogflowerscarf, dogflowersunglassesbowtie, dogflowersunglassesheart, 
                            dogflowerglassestie, dogflower, dogflowersunglasses, dogflowersunglassespearl, dogflowersunglassesscarf, dogflowersunglassestie,
                            dogflowertie, dogglassesbowtie, dogglassesheart, dogglassesscarf, dogglassestie, doghatbowtie, doghatglassesbowtie, doghat,
                            doghatglassesheart, doghatglassesscarf, doghatglassestie, doghatheart, doghatscarf, doghatsunglasses, doghatsunglassesbowtie,
                            doghatsunglassesheart, doghatsunglassesnecklace, doghatsunglassesscarf, doghatsunglassestie, doghattie, dogheart, dogprettyhat,
                            dogprettyhatbowtie, dogprettyhatglasses, dogprettyhatglassesbowtie, dogprettyhatglassesheart, dogprettyhatglassespearl,
                            dogprettyhatglassesscarf, dogprettyhatglassestie, dogprettyhatheart, dogprettyhatpearl, dogprettyhatscarf, dogprettyhatsunglasses,
                            dogprettyhatsunglassesbowtie, dogprettyhatsunglassesheart, dogprettyhatsunglassespearl, dogprettyhatsunglassesscarf, dogprettyhatsunglassestie,
                            dogprettyhattie, dogscarf, dogsunglasses, dogsunglassesbowtie, dogsunglassesheart, dogsunglassespearl, dogsunglassesscarf,
                            dogsunglassestie, dogtie, dogtophat, dogtophatbowtie, dogtophatglasses, dogtophatglassesbowtie, dogtophatglassesheart,
                            dogtophatglassespearl, dogtophatglassesscarf, dogtophatglassestie, dogtophatheart, dogtophatpearl, dogtophatscarf, dogtophatsunglasses,
                            dogtophatsunglassesbowtie, dogtophatsunglassesheart, dogtophatsunglassespearl, dogtophatsunglassesscarf, dogtophatsunglassestie, dogtophattie);
                        }
                        if (necklacePressed == true && hatPressed == false && glassesPressed == true){
                            gpane.add(dogglassesneck, 1, 1);
                            gpane.getChildren().removeAll(dog, dogglasses, dogneck, dogneckhat, dogglassesneckhat, dogglasseshat, 
                            dogbaseballbowtie, dogbaseballglassesbowtie, dogbaseball, dogbaseballglasses, dogbaseballglassesheart, dogbaseballglassespearl, 
                            dogbaseballglassesscarf, dogbaseballglassestie, dogbaseballheart, dogbaseballpearl, dogbaseballscarf, dogbaseballsunglasses, 
                            dogbaseballsunglassesbowtie, dogbaseballsunglassesheart, dogbaseballsunglassespearl, dogbaseballsunglassesscarf, 
                            dogbaseballsunglassestie, dogbaseballtie, dogbow, dogbowTie, dogbowbowtie, dogbowglasses, dogbowglassesbowtie, dogbowglassesheart,
                            dogbowglassespearl, dogbowglassesscarf, dogbowglassestie, dogbowheart, dogbowpearl, dogbowscarf, dogbowsunglasses,
                            dogbowsunglassesbowtie, dogbowsunglassesheart, dogbowsunglassespearl, dogbowsunglassesscarf, dogbowsunglassestie, dogbowtie,
                            dogflowerbowtie, dogflowerglasses, dogflowerglassesbowtie, dogflowerglassesheart, dogflowerglassespearl, dogflowerglassesscarf,
                            dogflowerheart, dogflowerpearl, dogflowerscarf, dogflowersunglassesbowtie, dogflowersunglassesheart, 
                            dogflowerglassestie, dogflower, dogflowersunglasses, dogflowersunglassespearl, dogflowersunglassesscarf, dogflowersunglassestie,
                            dogflowertie, dogglassesbowtie, dogglassesheart, dogglassesscarf, dogglassestie, doghatbowtie, doghatglassesbowtie, doghat,
                            doghatglassesheart, doghatglassesscarf, doghatglassestie, doghatheart, doghatscarf, doghatsunglasses, doghatsunglassesbowtie,
                            doghatsunglassesheart, doghatsunglassesnecklace, doghatsunglassesscarf, doghatsunglassestie, doghattie, dogheart, dogprettyhat,
                            dogprettyhatbowtie, dogprettyhatglasses, dogprettyhatglassesbowtie, dogprettyhatglassesheart, dogprettyhatglassespearl,
                            dogprettyhatglassesscarf, dogprettyhatglassestie, dogprettyhatheart, dogprettyhatpearl, dogprettyhatscarf, dogprettyhatsunglasses,
                            dogprettyhatsunglassesbowtie, dogprettyhatsunglassesheart, dogprettyhatsunglassespearl, dogprettyhatsunglassesscarf, dogprettyhatsunglassestie,
                            dogprettyhattie, dogscarf, dogsunglasses, dogsunglassesbowtie, dogsunglassesheart, dogsunglassespearl, dogsunglassesscarf,
                            dogsunglassestie, dogtie, dogtophat, dogtophatbowtie, dogtophatglasses, dogtophatglassesbowtie, dogtophatglassesheart,
                            dogtophatglassespearl, dogtophatglassesscarf, dogtophatglassestie, dogtophatheart, dogtophatpearl, dogtophatscarf, dogtophatsunglasses,
                            dogtophatsunglassesbowtie, dogtophatsunglassesheart, dogtophatsunglassespearl, dogtophatsunglassesscarf, dogtophatsunglassestie, dogtophattie);
                        }
                        if (glassesPressed == true && hatPressed == false && necklacePressed == false){
                            gpane.add(dogglasses, 1, 1);
                            gpane.getChildren().removeAll(dog, dogneck, dogneckhat, dogglassesneck, dogglassesneckhat, dogglasseshat, 
                            dogbaseballbowtie, dogbaseballglassesbowtie, dogbaseball, dogbaseballglasses, dogbaseballglassesheart, dogbaseballglassespearl, 
                            dogbaseballglassesscarf, dogbaseballglassestie, dogbaseballheart, dogbaseballpearl, dogbaseballscarf, dogbaseballsunglasses, 
                            dogbaseballsunglassesbowtie, dogbaseballsunglassesheart, dogbaseballsunglassespearl, dogbaseballsunglassesscarf, 
                            dogbaseballsunglassestie, dogbaseballtie, dogbow, dogbowTie, dogbowbowtie, dogbowglasses, dogbowglassesbowtie, dogbowglassesheart,
                            dogbowglassespearl, dogbowglassesscarf, dogbowglassestie, dogbowheart, dogbowpearl, dogbowscarf, dogbowsunglasses,
                            dogbowsunglassesbowtie, dogbowsunglassesheart, dogbowsunglassespearl, dogbowsunglassesscarf, dogbowsunglassestie, dogbowtie,
                            dogflowerbowtie, dogflowerglasses, dogflowerglassesbowtie, dogflowerglassesheart, dogflowerglassespearl, dogflowerglassesscarf,
                            dogflowerheart, dogflowerpearl, dogflowerscarf, dogflowersunglassesbowtie, dogflowersunglassesheart, 
                            dogflowerglassestie, dogflower, dogflowersunglasses, dogflowersunglassespearl, dogflowersunglassesscarf, dogflowersunglassestie,
                            dogflowertie, dogglassesbowtie, dogglassesheart, dogglassesscarf, dogglassestie, doghatbowtie, doghatglassesbowtie, doghat,
                            doghatglassesheart, doghatglassesscarf, doghatglassestie, doghatheart, doghatscarf, doghatsunglasses, doghatsunglassesbowtie,
                            doghatsunglassesheart, doghatsunglassesnecklace, doghatsunglassesscarf, doghatsunglassestie, doghattie, dogheart, dogprettyhat,
                            dogprettyhatbowtie, dogprettyhatglasses, dogprettyhatglassesbowtie, dogprettyhatglassesheart, dogprettyhatglassespearl,
                            dogprettyhatglassesscarf, dogprettyhatglassestie, dogprettyhatheart, dogprettyhatpearl, dogprettyhatscarf, dogprettyhatsunglasses,
                            dogprettyhatsunglassesbowtie, dogprettyhatsunglassesheart, dogprettyhatsunglassespearl, dogprettyhatsunglassesscarf, dogprettyhatsunglassestie,
                            dogprettyhattie, dogscarf, dogsunglasses, dogsunglassesbowtie, dogsunglassesheart, dogsunglassespearl, dogsunglassesscarf,
                            dogsunglassestie, dogtie, dogtophat, dogtophatbowtie, dogtophatglasses, dogtophatglassesbowtie, dogtophatglassesheart,
                            dogtophatglassespearl, dogtophatglassesscarf, dogtophatglassestie, dogtophatheart, dogtophatpearl, dogtophatscarf, dogtophatsunglasses,
                            dogtophatsunglassesbowtie, dogtophatsunglassesheart, dogtophatsunglassespearl, dogtophatsunglassesscarf, dogtophatsunglassestie, dogtophattie);
                        }


                        
                    }
                });
                
               Button necklacetwo = new Button("");
               necklacetwo.setGraphic(new ImageView(necklace2));
               necklacetwo.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                    necklacePressed = true;
                    System.out.println("Accepted");
                    cBox.getChildren().remove(necklacetwo);
                    gpane.getChildren().remove(dog);
                    if (hatPressed == true && glassesPressed == false && necklacePressed == false){
                        gpane.add(doghat, 1, 1);
                        gpane.getChildren().removeAll(dogglasses, dogneck, dogneckhat, dogglassesneck, dogglassesneckhat, dogglasseshat);
                    }
                    if (hatPressed == true && glassesPressed == true && necklacePressed == false){
                        gpane.add(dogglasseshat, 1, 1);
                        gpane.getChildren().removeAll(doghat, dogglasses, dogneck, dogneckhat, dogglassesneck, dogglassesneckhat);
                    }
                    if (hatPressed == true && glassesPressed == true && necklacePressed == true){
                        gpane.add(dogglassesneckhat, 1, 1);
                        gpane.getChildren().removeAll(doghat, dogglasses, dogneck, dogneckhat, dogglassesneck, dogglasseshat);
                    }
                    if (hatPressed == true && glassesPressed == false && necklacePressed == true){
                        gpane.add(dogneckhat, 1, 1);
                        gpane.getChildren().removeAll(doghat, dogglasses, dogneck, dogglassesneck, dogglassesneckhat, dogglasseshat);
                    }
                    if (necklacePressed == true && hatPressed == false && glassesPressed == false){
                        gpane.add(dogneck, 1, 1);
                        gpane.getChildren().removeAll(doghat, dogglasses, dogneckhat, dogglassesneck, dogglassesneckhat, dogglasseshat);
                    }
                    if (necklacePressed == true && hatPressed == false && glassesPressed == true){
                        gpane.add(dogglassesneck, 1, 1);
                        gpane.getChildren().removeAll(doghat, dogglasses, dogneck, dogneckhat, dogglassesneckhat, dogglasseshat);
                    }
                    if (glassesPressed == true && hatPressed == false && necklacePressed == false){
                        gpane.add(dogglasses, 1, 1);
                        gpane.getChildren().removeAll(doghat, dogneck, dogneckhat, dogglassesneck, dogglassesneckhat, dogglasseshat);
                    }

                }
            });
                Button glassesone = new Button("");
               glassesone.setGraphic(new ImageView(glasses));
               glassesone.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                    glassesPressed = true;
                    System.out.println("Accepted");
                    cBox.getChildren().remove(glassesone);
                    gpane.getChildren().remove(dog);
                    if (hatPressed == true && glassesPressed == false && necklacePressed == false){
                        gpane.add(doghat, 1, 1);
                        gpane.getChildren().removeAll(dogglasses, dogneck, dogneckhat, dogglassesneck, dogglassesneckhat, dogglasseshat);
                    }
                    if (hatPressed == true && glassesPressed == true && necklacePressed == false){
                        gpane.add(dogglasseshat, 1, 1);
                        gpane.getChildren().removeAll(doghat, dogglasses, dogneck, dogneckhat, dogglassesneck, dogglassesneckhat);
                    }
                    if (hatPressed == true && glassesPressed == true && necklacePressed == true){
                        gpane.add(dogglassesneckhat, 1, 1);
                        gpane.getChildren().removeAll(doghat, dogglasses, dogneck, dogneckhat, dogglassesneck, dogglasseshat);
                    }
                    if (hatPressed == true && glassesPressed == false && necklacePressed == true){
                        gpane.add(dogneckhat, 1, 1);
                        gpane.getChildren().removeAll(doghat, dogglasses, dogneck, dogglassesneck, dogglassesneckhat, dogglasseshat);
                    }
                    if (necklacePressed == true && hatPressed == false && glassesPressed == false){
                        gpane.add(dogneck, 1, 1);
                        gpane.getChildren().removeAll(doghat, dogglasses, dogneckhat, dogglassesneck, dogglassesneckhat, dogglasseshat);
                    }
                    if (necklacePressed == true && hatPressed == false && glassesPressed == true){
                        gpane.add(dogglassesneck, 1, 1);
                        gpane.getChildren().removeAll(doghat, dogglasses, dogneck, dogneckhat, dogglassesneckhat, dogglasseshat);
                    }
                    if (glassesPressed == true && hatPressed == false && necklacePressed == false){
                        gpane.add(dogglasses, 1, 1);
                        gpane.getChildren().removeAll(doghat, dogneck, dogneckhat, dogglassesneck, dogglassesneckhat, dogglasseshat);
                    }
                    
                    
                }
            });
            




            Button reset = new Button("");
            reset.setGraphic(new ImageView(resetone));
            reset.setStyle("-fx-background-color: transparent;");
            reset.setOnAction(new EventHandler<ActionEvent>() {
             @Override public void handle(ActionEvent e) {
                 glassesPressed = false;
                 necklacePressed = false;
                 hatPressed = false;
                 System.out.println("Accepted");
            
                 gpane.getChildren().removeAll(doghat, dogneck, dogglasses, dogglasseshat, dogglassesneck, dogglassesneckhat, dogneckhat);
                      gpane.add(dog, 1, 1);

                cBox.getChildren().removeAll(glassesone, hatthree, necklacetwo);
                cBox.getChildren().addAll(glassesone, hatthree, necklacetwo);
                

                } 
            });


            Button exit = new Button("");
               exit.setGraphic(new ImageView(exitone));
               exit.setStyle("-fx-background-color: transparent;");
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
               
                Circle circle = new Circle(); 
                circle.setCenterX(100.0f); 
                circle.setCenterY(135.0f); 
                circle.setRadius(35.0f); 
                circle.setFill(Color.BLUEVIOLET); 
                circle.setStrokeWidth(20);     
                 
                Path path = new Path();

                MoveTo moveTo = new MoveTo();
                moveTo.setX(100.0f);
                moveTo.setY(200.0f);

                CubicCurveTo cubicTo = new CubicCurveTo();
                cubicTo.setControlX1(200.0f);
                cubicTo.setControlY1(100.0f);
                cubicTo.setControlX2(300.0f);
                cubicTo.setControlY2(100.0f);
                cubicTo.setX(600.0f);
                cubicTo.setY(185.0f);

                path.getElements().add(moveTo);
                path.getElements().add(cubicTo);
                path.setOpacity(0.0);
                PathTransition pathTransition = new PathTransition();  
                pathTransition.setDuration(Duration.millis(1000)); 
                
                pathTransition.setNode(circle); 
                pathTransition.setPath(path);  
                
                pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT); 
                pathTransition.setCycleCount(2); 
                pathTransition.setAutoReverse(true); 
                // thingy
                Button play = new Button("Pass!"); 
                play.setStyle("-fx-font-size:15");
                

                play.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent e) {
                        playPressed = true;

                        if (playPressed == true){
                            pathTransition.play(); 
                            y-=10;
                            r4.setHeight(y);

                            playPressed = false;
                        }


                    }
                });
                Button exittwo = new Button("");
               exittwo.setGraphic(new ImageView(exitone));
               exittwo.setStyle("-fx-background-color: transparent;");
               exittwo.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                    System.out.println("Accepted");
                    bp.getChildren().removeAll(circle, path, exittwo);
                    gpane.getChildren().removeAll(play);


                
                }
            });

                // Group root = new Group(circle);
                // Scene scene = new Scene(root, 600, 300);   
                bp.getChildren().addAll(circle, path, exittwo);
                gpane.getChildren().addAll(play);
                bp.setTop(exittwo);
                
             } 
         
       });
      
   Image image4 = new Image(getClass().getResourceAsStream("images/showericon.png"));
       Button shower = new Button("");
       shower.setGraphic(new ImageView(image4));
       shower.setOnAction(new EventHandler<ActionEvent>() {
           @Override public void handle(ActionEvent e) {
            System.out.println("Accepted");
            Image showers = new Image(getClass().getResourceAsStream("images/showerzz.png"));
            Button shower = new Button("");
            shower.setGraphic(new ImageView(showers));
            shower.setStyle("-fx-background-color: transparent;");
            gpane.add(shower,0,0);
            shower.setAlignment(Pos.TOP_CENTER);
            shower.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e){
                    gpane.getChildren().remove(shower);
                    if (y<300 && y>=1){
                        y+=20;
                    r4.setHeight(y);

                    }

                
            }
        });
            
            
           }
       });
   Image image5 = new Image(getClass().getResourceAsStream("images/deathicon.png"));  
       Button death = new Button("");
       death.setGraphic(new ImageView(image5));
       death.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Image gift = new Image("images/gift.png");
                Button present = new Button("");

                present.setGraphic(new ImageView(gift));
                present.setStyle("-fx-background-color: transparent;");
                gpane.add(present, 1, 2);

                present.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        gpane.getChildren().removeAll(present);
                        Rectangle rect = new Rectangle(207, 75);
                        rect.setFill(Color.WHITE);
                        gpane.add(rect, 1, 2);

                        Label lookup = new Label("L00K UP!");
                        lookup.setFont(Font.font("Verdana", FontWeight.BOLD, 40));
                        // lookup.setStyle("-fx-font-size:40");
                        // lookup.setStyle("-fx-font-weight:BOLD");
                        // lookup.setStyle("-fx-font-font:Verdana");
                        lookup.setTextFill(Color.RED);

                        gpane.add(lookup, 1, 2);
                        PauseTransition visiblePause = new PauseTransition(
                        Duration.seconds(2)
                        );
                        visiblePause.setOnFinished(
                        event -> lookup.setVisible(false)
                        );
                        visiblePause.play();
                        PauseTransition vPause = new PauseTransition(
                        Duration.seconds(2)
                        );
                        
                        vPause.setOnFinished(new EventHandler<ActionEvent>() {
                            @Override public void handle(ActionEvent e) {
                        rect.setVisible(false);
                        ImageView anvil = new ImageView();
                        anvil.setImage(new Image("images/anvil.png"));
                        anvil.setX(-anvil.getImage().getWidth() / 10);
                        anvil.setY(1-anvil.getImage().getHeight());
                    
                        Path path = new Path();

                        MoveTo moveTo = new MoveTo();
                        moveTo.setX(600.0f);
                        moveTo.setY(0.0f);

                        CubicCurveTo cubicTo = new CubicCurveTo();
                        cubicTo.setControlX1(600.0f);
                        cubicTo.setControlY1(50.0f);
                        cubicTo.setControlX2(600.0f);
                        cubicTo.setControlY2(100.0f);
                        cubicTo.setX(600.0f);
                        cubicTo.setY(175.0f);

                        path.getElements().add(moveTo);
                        path.getElements().add(cubicTo);
                        path.setOpacity(0.0);
                        // road.getElements().addAll(path);
                        
                        

                        PathTransition anim = new PathTransition();
                        anim.setNode(anvil);
                        anim.setPath(path);
                        anim.setOrientation(OrientationType.NONE);
                        anim.setInterpolator(Interpolator.LINEAR);
                        anim.setDuration(new Duration(1000));
                        anim.setCycleCount(1);

                        // Group root = new Group();
                        bp.getChildren().addAll(path, anvil);
                        bp.setTranslateX(1);
                        bp.setTranslateY(1);
                        
                                        Animation.Status status = anim.getStatus();
                                            anim.play();
                        PauseTransition yes = new PauseTransition(
                        Duration.seconds(4) 
                        );
                        yes.setOnFinished(
                
                        event -> {
                            
                            bp.getChildren().remove(anvil);
                       
                        });
                        yes.play();
                        
                                            
                                   
             } 
             
            
         
       });
                        vPause.play();
                        
                        PauseTransition no = new PauseTransition(
                            Duration.seconds(4) 
                        );
                        no.setOnFinished(
                
                        event -> {
                            gpane.add(deaddog, 1, 1);
                            gpane.getChildren().removeAll(dog, dogglasses, doghat, dogglasseshat, dogglassesneck, dogglassesneckhat, dogneckhat, dogneck);
                       
                        });
                        no.play();
                        
            PauseTransition pause = new PauseTransition(
                Duration.seconds(5) 
            );
            pause.setOnFinished(
                
                event -> {
                    
                Rectangle blackrect = new Rectangle(2000, 2000);
                blackrect.setFill(Color.BLACK);
                sPane.getChildren().add(blackrect);

                GridPane dgrid = new GridPane();
                sPane.getChildren().add(dgrid);
                dgrid.setAlignment(Pos.CENTER);

                Label deathmsg = new Label("HAHAH GET IT PACKAGE PET!");
                deathmsg.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                deathmsg.setTextFill(Color.RED);
                dgrid.add(deathmsg, 1, 1);
                Label deathmsgt = new Label("surprise! you died. sorry :(");
                deathmsgt.setFont(Font.font("Verdana", FontWeight.BOLD, 50));
                deathmsgt.setTextFill(Color.RED);
                dgrid.add(deathmsgt, 1, 2);
                Image gift = new Image("images/gift.png");
                Label present = new Label("");
                present.setGraphic(new ImageView(gift));
                present.setStyle("-fx-background-color: transparent;");
                dgrid.add(present, 1, 4);

                Button deadbt = new Button("Press to replay!");
                dgrid.add(deadbt, 1, 3);
                deadbt.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent e) {
                    gpane.add(dog, 1, 1);
                    gpane.getChildren().removeAll(deaddog, present);
                    sPane.getChildren().remove(dgrid);
                    sPane.getChildren().remove(blackrect);
                    
                    x = 300;
                    y = 300;
                    r1.setHeight(x);
                    r4.setHeight(y);
                }
                });
            });
            pause.play();
                        
             } 
         
       });
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