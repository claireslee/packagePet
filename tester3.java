import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class tester3 extends Application{
    double num1 = 0;
    double num2 = 0;
    double answer = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox numPane = new HBox();
        numPane.setSpacing(10);
        numPane.setAlignment(Pos.CENTER);


        Label label1 = new Label("Number 1:");
        TextField tf1 = new TextField();

        Label label2 = new Label("Number 2:");
        TextField tf2 = new TextField();

        Label labelResult = new Label("Result :");
        TextField tfResult = new TextField();

        numPane.getChildren().addAll(label1, tf1,label2, tf2, labelResult, tfResult);

		
		Button add = new Button("Add");
		Button subtract = new Button("subtract");
		Button multiply = new Button("Multiply");
		Button divide = new Button("Divide");
		

        add.setOnAction(e -> {answer = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText());
            tfResult.setText(answer + "");
        });

        subtract.setOnAction(e -> {answer = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
            tfResult.setText(answer + "");
        });
        
        multiply.setOnAction(e -> {answer = Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText());
            tfResult.setText(answer + "");
        });
        
        divide.setOnAction(e -> {answer = Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText());
            tfResult.setText(answer + "");
        });


        HBox operatorsPane = new HBox();
        operatorsPane.setSpacing(10);
        operatorsPane.setAlignment(Pos.CENTER);
        operatorsPane.getChildren().addAll(add, subtract, multiply, divide);

        BorderPane borderPane = new BorderPane(numPane);
        BorderPane.setMargin(numPane, new Insets(10, 10, 10, 10));

        borderPane.setBottom(operatorsPane);
        BorderPane.setMargin(operatorsPane, new Insets(10, 10, 10, 10));
        primaryStage.setScene(new Scene(borderPane, borderPane.getPrefWidth(),borderPane.getPrefWidth()));
        primaryStage.setTitle("Calculator - Ex15_4");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
	}
}