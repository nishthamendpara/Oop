import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class Pr33 extends Application {

    public void start(Stage stage) {

        HBox root = new HBox(30);
        root.setAlignment(Pos.BOTTOM_CENTER);

        VBox projects = createBar("Projects — 20%", 20, Color.RED);
        VBox quizzes = createBar("Quizzes — 10%", 10, Color.BLUE);
        VBox midterm = createBar("Midterm Exams — 30%", 30, Color.GREEN);
        VBox finals = createBar("Final Exam — 40%", 40, Color.ORANGE);

        root.getChildren().addAll(projects, quizzes, midterm, finals);

        Scene scene = new Scene(root, 500, 300);
        stage.setTitle("Grade Distribution");
        stage.setScene(scene);
        stage.show();
    }

    VBox createBar(String label, int percentage, Color color) {
        double height = percentage * 3;

        Rectangle rect = new Rectangle(50, height);
        rect.setFill(color);

        Text text = new Text(label);

        VBox box = new VBox(10);
        box.setAlignment(Pos.BOTTOM_CENTER);
        box.getChildren().addAll(rect, text);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
          }
