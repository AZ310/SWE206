package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomePage extends login {

    @FXML
    private Button viewTeams;

    @FXML
    private Button viewTimeTable;
    @FXML
    private Button newTeam;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back;

    @FXML
    private void handleTeamsButtonClick(ActionEvent event) {
        //change the file
        switchScene("ViewTeam.fxml");
    }

    @FXML
    private void handleTableButtonClick(ActionEvent event) {
        //Change the file
        switchScene("TimeTable.fxml");
    }
    @FXML
    private void handleNewButtonClick(ActionEvent event) {
        switchScene("AddTeam.fxml");
    }

    private void handleBack(ActionEvent event) {
        switchScene("login.fxml");
    }


    @FXML
    void initialize() {
    
       
        viewTimeTable.setOnAction(event -> {
            switchScene("TimeTableAdmin.fxml");
        });
        newTeam.setOnAction(event -> {
            switchScene("AddTeam.fxml");
        });
        viewTeams.setOnAction(event -> {
            switchScene("ViewTeam.fxml");
        });
        back.setOnAction(event -> {
            switchScene("login.fxml");
        });
    }

    private void switchScene(String fxmlFile) {
        try {
            // Load the FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();

            // Create a new scene with the loaded FXML file
            Scene scene = new Scene(root);

            // Get the primary stage reference and set the new scene
            Stage primaryStage = App.getPrimaryStage();
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}