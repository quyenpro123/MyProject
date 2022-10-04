module quyen.demo1 {
  requires javafx.controls;
  requires javafx.fxml;

  opens quyen.demo1 to javafx.fxml;
  exports quyen.demo1;
}