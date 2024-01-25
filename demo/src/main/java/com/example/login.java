package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class login {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button admin;
    @FXML
    private Button member;
    @FXML
    private Button exit;

    protected static String status;
    
    @FXML
    public void exitProject(ActionEvent event) {
    Platform.exit();
    }

    @FXML
    public void adminLogin(ActionEvent event) {
        status = "admin";
        switchScene("HomePage.fxml");
    }

    @FXML
    public void memberLogin(ActionEvent event) {
        status = "member";
        switchScene("HomePage.fxml");
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

    @FXML
    void initialize() {
        status = "";
        exit.setOnAction(event -> {
            Platform.exit();
        });
        member.setOnAction(event -> {
            status = "member";
            switchScene("HomePage.fxml");
        });
        admin.setOnAction(event -> {
            status = "admin";
            switchScene("HomePage.fxml");
        });
    }

}
