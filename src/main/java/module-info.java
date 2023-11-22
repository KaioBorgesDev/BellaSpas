module com.example.bellaspa {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.bellaspa to javafx.fxml;
    exports com.example.bellaspa;
}