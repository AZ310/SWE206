package com.example;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class viewTeamDetails extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewTeam.fxml"));
        fxmlLoader.load();
        Parent root = fxmlLoader.getRoot();
        // primaryStage.setTitle("View Team Details");
        // primaryStage.setScene(new javafx.scene.Scene(root));
        // primaryStage.show();

        Button viewTeamDetails = (Button) root.lookup("#viewTeamDetails");
        viewTeamDetails.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    System.out.println("CLICKED");
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewTeamPopUp.fxml"));
                    fxmlLoader.load();
                    Parent root = fxmlLoader.getRoot();
                    Stage stage = new Stage();

                    stage.setTitle("View Team Details");
                    stage.setScene(new Scene(root));
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Button viewTeamDetails1 = (Button) root.lookup("#viewTeamDetails1");
        viewTeamDetails1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewTeamPopUp.fxml"));
                    fxmlLoader.load();
                    Parent root = fxmlLoader.getRoot();
                    Stage stage = new Stage();

                    stage.setTitle("View Team Details");
                    stage.setScene(new Scene(root));
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Button viewTeamDetails2 = (Button) root.lookup("#viewTeamDetails2");
        viewTeamDetails2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewTeamPopUp.fxml"));
                    fxmlLoader.load();
                    Parent root = fxmlLoader.getRoot();
                    Stage stage = new Stage();

                    stage.setTitle("View Team Details");
                    stage.setScene(new Scene(root));
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Button viewTeamDetails3 = (Button) root.lookup("#viewTeamDetails3");
        viewTeamDetails3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewTeamPopUp.fxml"));
                    fxmlLoader.load();
                    Parent root = fxmlLoader.getRoot();
                    Stage stage = new Stage();

                    stage.setTitle("View Team Details");
                    stage.setScene(new Scene(root));
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Button viewTeamDetails4 = (Button) root.lookup("#viewTeamDetails4");
        viewTeamDetails4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewTeamPopUp.fxml"));
                    fxmlLoader.load();
                    Parent root = fxmlLoader.getRoot();
                    Stage stage = new Stage();

                    stage.setTitle("View Team Details");
                    stage.setScene(new Scene(root));
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Button projectName = (Button) root.lookup("#projectName");
        projectName.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewProjectPopUp.fxml"));
                    fxmlLoader.load();
                    Parent root = fxmlLoader.getRoot();
                    Stage stage = new Stage();
                    stage.setTitle("View Project Details");
                    stage.setScene(new Scene(root));
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        
        Button projectName1 = (Button) root.lookup("#projectName1");
        projectName1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewProjectPopUp.fxml"));
                    fxmlLoader.load();
                    Parent root = fxmlLoader.getRoot();
                    Stage stage = new Stage();
                    stage.setTitle("View Project Details");
                    stage.setScene(new Scene(root));
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Button projectName2 = (Button) root.lookup("#projectName2");
        projectName2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewProjectPopUp.fxml"));
                    fxmlLoader.load();
                    Parent root = fxmlLoader.getRoot();
                    Stage stage = new Stage();
                    stage.setTitle("View Project Details");
                    stage.setScene(new Scene(root));
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Button projectName3 = (Button) root.lookup("#projectName3");
        projectName3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewProjectPopUp.fxml"));
                    fxmlLoader.load();
                    Parent root = fxmlLoader.getRoot();
                    Stage stage = new Stage();
                    stage.setTitle("View Project Details");
                    stage.setScene(new Scene(root));
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Button projectName4 = (Button) root.lookup("#projectName4");
        projectName4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewProjectPopUp.fxml"));
                    fxmlLoader.load();
                    Parent root = fxmlLoader.getRoot();
                    Stage stage = new Stage();
                    stage.setTitle("View Project Details");
                    stage.setScene(new Scene(root));
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Button backButton = (Button) root.lookup("#backButton");
        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewTeam.fxml"));
                    fxmlLoader.load();
                    Parent root = fxmlLoader.getRoot();
                    Stage stage = new Stage();
                    stage.setTitle("View Team");
                    stage.setScene(new Scene(root));
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }
    

    

    public static void main(String[] args) {
        launch(args);
    }
    
    public void handleViewTeamDetailsButtonClick(Team t) {
        ArrayList<Member> members = t.getMembers();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> workHours = new ArrayList<>();
        ArrayList<Integer> IDs = new ArrayList<>();

        for (int i = 0; i < members.size(); i++){
            names.add(members.get(i).getName());
            IDs.add(members.get(i).getID());
            workHours.add(members.get(i).getWorkHours().get(0));
        }

    }

    }