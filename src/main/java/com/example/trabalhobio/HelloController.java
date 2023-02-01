package com.example.trabalhobio;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
/*import javafx.scene.control.Button;
import javafx.scene.control.Label;*/
import javafx.scene.control.TextField;
import javafx.scene.control.*;

import static com.example.trabalhobio.SerVivoSQL.insertIntoServivo;


public class HelloController {
    @FXML
    TextField reinoText;
    @FXML
    TextField filoText;
    @FXML
    TextField classeText;
    @FXML
    TextField ordemText;
    @FXML
    TextField familiaText;
    @FXML
    TextField generoText;
    @FXML
    TextField especieText;

    @FXML
    void doAdd() {
        SerVivo serVivo = new SerVivo(reinoText.getText(),
                filoText.getText(),
                classeText.getText(),
                ordemText.getText(),
                familiaText.getText(),
                generoText.getText(),
                especieText.getText());
        System.out.println(serVivo);
        insertIntoServivo(serVivo);
    }
}