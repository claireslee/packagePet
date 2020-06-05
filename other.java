import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage; 

public class other extends Application {
    @Override
    public void start(Stage s) throws Exception { 
        // set title for the stage 
        s.setTitle("creating buttons"); 
  
        // create a image 
        Image i = new Image("gfg.png"); 
  
        // create a image View 
        ImageView iw = new ImageView(i); 
  
        // create a button 
        Button b = new Button("", iw); 
  
        // create a stack pane 
        TilePane r = new TilePane(); 
  
        // create a label 
        Label l = new Label("button not selected"); 
  
        // action event 
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
                l.setText("button selected    "); 
            } 
        }; 
  
        // when button is pressed 
        b.setOnAction(event); 
  
        // add button 
        r.getChildren().add(b); 
        r.getChildren().add(l); 
  
        // create a scene 
        Scene sc = new Scene(r, 200, 200); 
  
        // set the scene 
        s.setScene(sc); 
        s.show(); 
    } 
  
    public static void main(String args[]) 
    { 
        // launch the application 
        launch(args); 
    } 
}


// package practiceCodes_Chapter15;

// import javafx.scene.layout.Pane;
// import javafx.scene.paint.Color;
// import javafx.scene.shape.Rectangle;
// import javafx.application.Application;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.layout.BorderPane;
// import javafx.scene.layout.HBox;
// import javafx.stage.Stage;
 
// public class Ex15_3 extends Application {
//     @Override
//     public void start(Stage primaryStage) {
//         BorderPane bp = new BorderPane();
//         Pane pane = new Pane();
//         Rectangle rect = new Rectangle(50,100,50,100);
//         pane.getChildren().add(rect);
              
//         HBox box = new HBox();
//         Button left = new Button("left");
//         Button right = new Button("right");
//         Button up = new Button("up");
//         Button down = new Button("down");

//         box.getChildren().add(left);
//         box.getChildren().add(right);
//         box.getChildren().add(up);
//         box.getChildren().add(down);
        
//         box.setSpacing(20); 
//         box.setAlignment(Pos.CENTER);
 
//         left.setOnAction(e -> {
//             rect.setX(rect.getX() - 15);
//         });
       
//         right.setOnAction(e -> {
//             rect.setX(rect.getX() + 15);
//         });
       
//         up.setOnAction(e -> {
//             rect.setY(rect.getY() - 15);
//         });
       
//         down.setOnAction(e -> {
//             rect.setY(rect.getY() + 15);
//         });
 
//         bp.setCenter(pane);
//         bp.setBottom(box);       
        
//         Scene scene = new Scene(bp);
//         primaryStage.setScene(scene);
//         primaryStage.setTitle("Rectangle - Ex15_3");
//         primaryStage.show();
//     }
// }