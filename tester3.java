import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
 
public class Ex15_3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        BorderPane pp = new BorderPane();
        Pane pane = new Pane();
        Rectangle rect = new Rectangle(50,100,50,100);
        pane.getChildren().add(rect);
 
        Image image1 = new Image(getClass().getResourceAsStream("images/foodicon.png"));
        Image image2 = new Image(getClass().getResourceAsStream("images/clothesicon.png"));
        Image image3 = new Image(getClass().getResourceAsStream("images/ballicon.jpg"));
        Image image4 = new Image(getClass().getResourceAsStream("images/showericon.png"));
        Image image5 = new Image(getClass().getResourceAsStream("images/deathicon.png"));   
        
        HBox box = new HBox();
        Button death = new Button("left");
 
        Button clothes = new Button("right");
 
        Button shower = new Button("up");
 
        Button food = new Button("down");
        Button ball = new Button("down");

        box.getChildren().add(death);
        box.getChildren().add(clothes);
        box.getChildren().add(shower);
        box.getChildren().add(food);
        box.getChildren().add(ball);
        box.setSpacing(20); 
        box.setAlignment(Pos.CENTER);
 
        left.setOnAction(e->{
            rect.setX(rect.getX() - 15);
        });
       
        right.setOnAction(e->{
            rect.setX(rect.getX() + 15);
        });
       
        
        up.setOnAction(e->{
            rect.setY(rect.getY() - 15);
        });
       
        down.setOnAction(e->{
            rect.setY(rect.getY() + 15);
 
        });
 
        pp.setCenter(pane);
        pp.setBottom(box);
        
        Scene scene = new Scene(pp);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 15_3");
        primaryStage.show();
    }
}
