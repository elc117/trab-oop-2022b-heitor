module com.example.trabalhobio {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.trabalhobio to javafx.fxml;
    exports com.example.trabalhobio;
}