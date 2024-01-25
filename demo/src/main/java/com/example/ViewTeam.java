package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ViewTeam {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button viewTeamDetails;

    @FXML
    private Button viewTeamDetails1;

    @FXML
    private Button viewTeamDetails2;

    @FXML
    private Button viewTeamDetails3;

    @FXML
    private Button viewTeamDetails4;

    @FXML
    private Button backButton;
    
    @FXML
    private Button projectName;

    @FXML
    private Button projectName1;

    @FXML
    private Button projectName2;

    @FXML
    private Button projectName3;

    @FXML
    private Button projectName4;

    @FXML
    private SplitPane splitpane;

    @FXML
    private Button back;

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
        back.setOnAction(event -> {
            switchScene("HomePage.fxml");
        });
    }

}
