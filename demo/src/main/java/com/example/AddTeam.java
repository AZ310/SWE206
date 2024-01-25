package com.example;

import java.util.Arrays;
import java.io.IOException;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddTeam {

    @FXML
    private TextField teamName;
    @FXML
    private TextField projectName;
    @FXML
    private TextField members;
    @FXML
    private TextField machine;
    @FXML
    private Button Enter;
    @FXML
    private Button back;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private void handleEnterButtonClick() {
        // Assuming members is a TextField
        Random random = new Random();
        String membersText = members.getText();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Member> members1 = new ArrayList<>();

        // Split the string based on commas
        String[] membersArray = membersText.split(",");

        // Add each trimmed substring to the list
        for (int i = 0; i < membersArray.length; i++) {
            list.add(membersArray[i].trim());
            Member member = new Member(membersArray[i], random.nextInt(10000)+ 10000);
            members1.add(member);
        }

        Team team = new Team(teamName.getText());
        for (int j = 0; j < members1.size(); j++){
            members1.get(j).addToTeam(team, random.nextInt( 5));
            if (!team.getMembers().contains(members1.get(j))) {
                team.addMember(members1.get(j));
            }
        }
        team.setLeader(team.getMembers().get(random.nextInt(team.getMembers().size())));

        Project project = new Project(projectName.getText());
        Machine machine1 = new Machine(machine.getText());
        team.setProject(project);
        team.setMachine(machine1);

        System.out.println(team);

        //VERY IMPORTANT!! Remember to add the team into a Team list, maybe a public static variable,
        // or upload this into a file containing list of teams

        switchScene("homePage.fxml");
    }
    @FXML
    void initialize() {
        back.setOnAction(event -> {
            switchScene("homePage.fxml");
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
