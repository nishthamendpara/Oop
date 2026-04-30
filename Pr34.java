import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.geometry.Insets;

import java.io.*;
import java.util.Optional;

public class Pr32 extends Application {

    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        Label l1 = new Label("Roll No:");
        Label l2 = new Label("Name:");
        Label l3 = new Label("Age:");
        Label l4 = new Label("Email:");

        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        TextField tf4 = new TextField();

        Button btn = new Button("Submit");

        grid.add(l1, 0, 0); grid.add(tf1, 1, 0);
        grid.add(l2, 0, 1); grid.add(tf2, 1, 1);
        grid.add(l3, 0, 2); grid.add(tf3, 1, 2);
        grid.add(l4, 0, 3); grid.add(tf4, 1, 3);
        grid.add(btn, 1, 4);

        btn.setOnAction(e -> {
            try {
                int roll = Integer.parseInt(tf1.getText());
                String name = tf2.getText();
                int age = Integer.parseInt(tf3.getText());
                String email = tf4.getText();

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid Email");
                }

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Success");
                alert.setHeaderText("Registration Successful");
                alert.setContentText("Roll No: " + roll + "\nName: " + name + "\nAge: " + age + "\nEmail: " + email);

                Optional<ButtonType> result = alert.showAndWait();

                if (result.isPresent() && result.get() == ButtonType.OK) {
                    FileChooser fc = new FileChooser();
                    fc.setTitle("Save Data");
                    File file = fc.showSaveDialog(stage);

                    if (file != null) {
                        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                        bw.write("Roll No: " + roll + "\n");
                        bw.write("Name: " + name + "\n");
                        bw.write("Age: " + age + "\n");
                        bw.write("Email: " + email + "\n");
                        bw.close();
                    }
                }

            } catch (NumberFormatException ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setContentText("Roll No and Age must be integers");
                error.show();
            } catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setContentText(ex.getMessage());
                error.show();
            }
        });

        Scene scene = new Scene(grid, 350, 250);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
