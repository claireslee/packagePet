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

		Scene scene = new Scene(new Group());
		primaryStage.setTitle("Package Pet");

		HBox hBox1 = new HBox(10);
		HBox hBox2 = new HBox(10);

		VBox vBox = new VBox();
		VBox vBox2 = new VBox();

		hBox1.setAlignment(Pos.CENTER);
		hBox2.setAlignment(Pos.CENTER);

		vBox.setPadding(new Insets(2, 5, 0, 0));
		vBox2.setPadding(new Insets(10, 15, 0, 0));


	// buttons as images
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
        food.setGraphic(new ImageView(image2));
        food.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("Accepted");
            }
		});

	Image image3 = new Image(getClass().getResourceAsStream("images/ballicon.jpg"));
		Button ball = new Button("");
        food.setGraphic(new ImageView(image3));
        food.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("Accepted");
            }
		});
		
	Image image4 = new Image(getClass().getResourceAsStream("images/showericon.png"));
		Button shower = new Button("");
        food.setGraphic(new ImageView(image4));
        food.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("Accepted");
            }
		});

	Image image5 = new Image(getClass().getResourceAsStream("images/deathicon.png"));	
		Button death = new Button("");
        food.setGraphic(new ImageView(image5));
        food.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("Accepted");
            }
		});

		hBox1.getChildren().addAll(food);
		hBox1.getChildren().addAll(clothes);
		hBox1.getChildren().addAll(ball);
		hBox1.getChildren().addAll(shower);
		hBox1.getChildren().addAll(death);

		vBox.getChildren().addAll(hBox1, hBox2);
		vBox.getChildren().addAll(food);
		vBox2.getChildren().addAll(clothes);

		((Group)scene.getRoot()).getChildren().add(vBox);

		primaryStage.setScene(scene); 
		primaryStage.show(); 

        bp.setBottom(vBox2); 
	}

	public static void main(String[] args) {
		launch(args);
	}

// 	// Button Functions
// 	private void food() {
// 		return 0;
// 	}

// 	private void shower() {
// 		return 0;
// 	}

// 	private void death() {
// 		return 0;
// 	}

// 	private void clothes() {
// 		return 0;
// 	}

// 	private void ball() {
// 		return 0;
// 	}

}