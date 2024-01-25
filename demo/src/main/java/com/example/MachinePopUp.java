package com.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MachinePopUp {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirm;

    @FXML
    private TextField textfield;

    private String machineName;



    @FXML
    void initialize() {
        confirm.setOnAction(event -> {
            machineName = textfield.getText().toString();
            closePopUp();
        });
    }

     public String getMachineName() {
        return machineName;
    }

    private void closePopUp() {
        Stage stage = (Stage) confirm.getScene().getWindow();
        stage.close();
    }

}
