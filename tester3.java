import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
 
public class tester3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane bp = new BorderPane();
        Pane pane = new Pane();
        
        Rectangle rect = new Rectangle(50,100,50,100);
        pane.getChildren().add(rect);
              
        HBox box = new HBox();
        Button food = new Button("food");
        Button clothes = new Button("clothes");
        Button ball = new Button("ball");
        Button shower = new Button("shower");
        Button death = new Button("death");

        box.getChildren().add(food);
        box.getChildren().add(clothes);
        box.getChildren().add(ball);
        box.getChildren().add(shower);
        box.getChildren().add(death);
        
        box.setSpacing(20); 
        box.setAlignment(Pos.CENTER);
 
        // food.setOnAction(e -> {
        //     rect.setX(rect.getX() - 15);
        // });
       
        // clothes.setOnAction(e -> {
        //     rect.setX(rect.getX() + 15);
        // });
       
        // ball.setOnAction(e -> {
        //     rect.setY(rect.getY() - 15);
        // });
       
        // shower.setOnAction(e -> {
        //     rect.setY(rect.getY() + 15);
        // });

        // death.setOnAction(e -> {
        //     death.setY(rect.getY() + 15);
        // });
 
        bp.setCenter(pane);
        bp.setBottom(box);       
        
        Scene scene = new Scene(bp);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bar");
        primaryStage.show();
    }
}