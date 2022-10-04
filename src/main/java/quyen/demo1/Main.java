package quyen.demo1;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    stage.setTitle("My APP");
    Button button = new Button("Hello");
    StackPane layout = new StackPane(button);
    Scene scene = new Scene(layout, 800.0, 200.0);
    stage.setScene(scene);
    stage.show();
  }
}
