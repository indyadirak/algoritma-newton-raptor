module com.example.ndyy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ndyy to javafx.fxml;
    exports com.example.ndyy;
}