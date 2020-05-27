import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class Bar extends Application {
	private TextField tfNumber1 = new TextField();
	private TextField tfNumber2 = new TextField();
    private TextField tfResult = new TextField();
    
	private Button btFood = new Button("Food");
	private Button btShower = new Button("Shower");
	private Button btDeath = new Button("Death");
    private Button btClothes = new Button("Clothes");
    private Button btBall = new Button("Ball");

	@Override 
	public void start(Stage primaryStage) {
		HBox hBox1 = new HBox(5);
		HBox hBox2 = new HBox(5);
		VBox vBox = new VBox(15);
		hBox1.getChildren().addAll(btFood, btShower, btDeath, btClothes, btBall);
		vBox.getChildren().addAll(hBox1, hBox2);

		hBox1.setAlignment(Pos.CENTER);
		hBox2.setAlignment(Pos.CENTER);
		tfNumber1.setPrefColumnCount(4);
		tfNumber2.setPrefColumnCount(4);
		tfResult.setPrefColumnCount(4);
		tfResult.setEditable(false);
		vBox.setPadding(new Insets(2, 5, 0, 0));

		// Process events
		// btFood.setOnAction(e -> food());
		// btShower.setOnAction(e -> shower());
		// btDeath.setOnAction(e -> death());
		// btClothes.setOnAction(e -> clothes());
		// btBall.setOnAction(e -> ball());

		// Create a scene and place it in the stage
		Scene scene = new Scene(vBox);
		primaryStage.setTitle("Package Pet");
		primaryStage.setScene(scene); 
		primaryStage.show(); 
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


