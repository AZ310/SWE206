package com.example;

import static com.example.App.scene;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T2 extends login implements Initializable {
    @FXML
    private Button nineToTen;
    @FXML
    private Button tenToEleven;
    @FXML
    private Button elevenToTwelve;
    @FXML
    private Button twelveToOne;
    @FXML
    private Button oneToTwo;
    @FXML
    private Button twoToThree;
    @FXML
    private Button threeToFour;
    @FXML
    private Button fourToFive;
    @FXML
    private Button fiveToSix;
    @FXML
    private Button cancel;
    @FXML
    private Button reserve;
    @FXML
    private Button previous;
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private GridPane timetable;
    @FXML
    private Region selectedCell;
    private FileWriter file;
    @FXML
    private Button today;
    @FXML
    private Button tommorow;
    @FXML
    private AnchorPane ap;
    @FXML
    private Button addNewMachine;
    @FXML
    private Scene scene;
    @FXML
    private Button m1;
    @FXML
    private Button m2;
    @FXML
    private Button m3;
    @FXML
    private Button m4;
    @FXML
    private Button m5;
    @FXML
    private Stage stage;
    @FXML
    private Button load;
    private String machineName;
    private int[] gridPaneCells; // An array to hold the value of which cell is filled with a specific machine
                                 // when a cell is filled the value becomes a 1
    private String[] machinesUsed = new String[5]; // An array to hold the value of which machine is used
    int row;
    int rowCount = 5; // number of rows
    int columnCount = 10; // number of columns
    
    int[][] gridPaneCellsArray = new int[rowCount][columnCount];

@FXML
public void handleAddNewMachine(ActionEvent e) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MachinePopUp.fxml"));
    Parent root = (Parent) fxmlLoader.load();
    MachinePopUp machinePopUp = fxmlLoader.getController();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.showAndWait();

    String machineName = machinePopUp.getMachineName();
    System.out.println(machineName);

    Label label = new Label(machineName);
    label.setAlignment(Pos.CENTER); // Set alignment of the label to center
    label.setStyle("-fx-font-weight: bold; -fx-font-size: 14; -fx-text-fill: red;");

    RowConstraints rowConstraints = new RowConstraints();
    rowConstraints.setPrefHeight(30); // Set the desired height for the row
    timetable.getRowConstraints().add(rowConstraints); // Add the row constraints to the timetable
 
    int count = 0;
    int rowCount = timetable.getRowCount();
    while (count < machinesUsed.length && machinesUsed[count] != null) {
        count++;
    }
    if (count < machinesUsed.length) {
        timetable.add(label, 0, count); // Add the label to the timetable at column 0, row count

        // Center the label within the cell
        GridPane.setHalignment(label, HPos.LEFT);
        GridPane.setValignment(label, VPos.BASELINE);

        machinesUsed[count] = machineName;
        System.out.println(Arrays.toString(machinesUsed));
    } else {
        // Handle the case when the machinesUsed array is full
        arrayError(new IndexOutOfBoundsException("Machines array is full."));
    }
        System.out.println(Arrays.toString(machinesUsed));
}
@FXML
public void handleMachineButton(ActionEvent event) {
    Button button = (Button) event.getSource();
    System.out.println("Machine Button: " + button.getText() + ", Row: " + row);
    
    if (button == m1) {
        row = 0;
    } else if (button == m2) {
        row = 1;
    } else if (button == m3) {
        row = 2;
    } else if (button == m4) {
        row = 3;
    } else if (button == m5) {
        row = 4;
    }
}
    
    @FXML
    private void arrayError(IndexOutOfBoundsException ex){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setContentText("You have excedded the number of machines allowed!");
        alert.showAndWait();
    }

    

    @FXML
    public void handleNineToTen(ActionEvent e) throws FileNotFoundException {
        System.out.println(row);
        gridPaneCellsArray[row][1] = 1;
        String color = "#bd0b0b"; // Specify your desired color using CSS color notation
        fillCell(timetable, new Region(), 1, row, color);

    }

      @FXML
    public void handleTenToEleven(ActionEvent e) throws FileNotFoundException {
        System.out.println(row);
        System.out.println(Arrays.deepToString(gridPaneCellsArray));
        gridPaneCellsArray[row][2] = 1;
        String color = "#bd0b0b"; // Specify your desired color using CSS color notation
        fillCell(timetable, new Region(), 2, row, color);

    }
      @FXML
    public void handleElevenToTweleve(ActionEvent e) throws FileNotFoundException {
        System.out.println(row);
        gridPaneCellsArray[row][3] = 1;
        String color = "#bd0b0b"; // Specify your desired color using CSS color notation
        fillCell(timetable, new Region(), 3, row, color);

    }
      @FXML
    public void handleTweleveToOne(ActionEvent e) throws FileNotFoundException {
        System.out.println(row);
        gridPaneCellsArray[row][4] = 1;
        String color = "#bd0b0b"; // Specify your desired color using CSS color notation
        fillCell(timetable, new Region(), 4, row, color);

    }
      @FXML
    public void handleOneToTwo(ActionEvent e) throws FileNotFoundException {
        System.out.println(row);
        gridPaneCellsArray[row][5] = 1;
        String color = "#bd0b0b"; // Specify your desired color using CSS color notation
        fillCell(timetable, new Region(), 5, row, color);

    }
      @FXML
    public void handleTwoToThree(ActionEvent e) throws FileNotFoundException {
        System.out.println(row);
        gridPaneCellsArray[row][6] = 1;
        String color = "#bd0b0b"; // Specify your desired color using CSS color notation
        fillCell(timetable, new Region(), 6, row, color);
    }
      @FXML
    public void handleThreeToFour(ActionEvent e) throws FileNotFoundException {
        System.out.println(row);
        gridPaneCellsArray[row][7] = 1;
        String color = "#bd0b0b"; // Specify your desired color using CSS color notation
        fillCell(timetable, new Region(), 7, row, color);
    }
      @FXML
    public void handleFourToFive(ActionEvent e) throws FileNotFoundException {
        System.out.println(row);
        gridPaneCellsArray[row][8] = 1;
        String color = "#bd0b0b"; // Specify your desired color using CSS color notation
        fillCell(timetable, new Region(), 8, row, color);

    }
      @FXML
    public void handleFiveToSix(ActionEvent e) throws FileNotFoundException {
        System.out.println(row);
        gridPaneCellsArray[row][9] = 1;
        String color = "#bd0b0b"; // Specify your desired color using CSS color notation
        fillCell(timetable, new Region(), 9, row, color);

    }
    @FXML
    public void handleToday(ActionEvent event) throws IOException {
        writeArrayToFile("Tommorow.txt");
        switchScene("TimeTableAdmin.fxml");
    }

    public void writeArrayToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (int i = 0; i < gridPaneCellsArray.length; i++) {
                for (int j = 0; j < gridPaneCellsArray[i].length; j++) {
                    writer.write(gridPaneCellsArray[i][j] + " ");
                }
                writer.write(System.lineSeparator());
            }
            System.out.println("Array contents have been written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing array contents to the file: " + e.getMessage());
        }
    }

    @FXML
    public void handleLoad(ActionEvent event) throws FileNotFoundException {
        File file = new File("Tommorow.txt");
        Scanner scanner = new Scanner(file);
        int row = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            for (int i = 0; i < numbers.length; i++) {
                gridPaneCellsArray[row][i] = Integer.parseInt(numbers[i]);
            }
            row++;
        }
        scanner.close();
        System.out.println(Arrays.deepToString(gridPaneCellsArray));
        if (hasOne(gridPaneCellsArray)) {
            // Fill every cell that has a 1 with a red color
            for (int i = 0; i < gridPaneCellsArray.length; i++) {
                for (int j = 0; j < gridPaneCellsArray[i].length; j++) {
                    if (gridPaneCellsArray[i][j] == 1) {
                        String color = "#bd0b0b";
                        fillCell(timetable, new Region(), j, i, color);
                    }
                }
            }
        }
    }
    @FXML
    private void handleBack(ActionEvent event) {
        switchScene("HomePage.fxml");
    }

    public boolean hasOne(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                if (element == 1) {
                    return true; // Found a one, return true
                }
            }
        }
        return false; // No one found
    }

    @FXML
    public static void fillCell(GridPane gridPane, Node node, int columnIndex, int rowIndex, String color) { // a method to full a cell of the gridPane
        GridPane.setConstraints(node, columnIndex, rowIndex);
        gridPane.getChildren().add(node);

        if (node instanceof Region) {
            Region region = (Region) node;
            region.setStyle("-fx-background-color: " + color + ";");
        }
    }
    private void previous(ActionEvent event) throws IOException {
        switchScene("Test.fxml"); //set the scene to the home page
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

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        if(status.equals("admin")){
        m1.setOnAction(this::handleMachineButton);
        m2.setOnAction(this::handleMachineButton);
        m3.setOnAction(this::handleMachineButton);
        m4.setOnAction(this::handleMachineButton);
        m5.setOnAction(this::handleMachineButton);
        previous.setOnAction(event -> {
            try {
                previous(event);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        nineToTen.setOnAction(event -> {
            try {
                handleNineToTen(event);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        tenToEleven.setOnAction(event -> {
            try {
                handleTenToEleven(event);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        elevenToTwelve.setOnAction(event -> {
            try {
                handleElevenToTweleve(event);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        twelveToOne.setOnAction(event -> {
            try {
                handleTweleveToOne(event);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        oneToTwo.setOnAction(event -> {
            try {
                handleOneToTwo(event);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        twoToThree.setOnAction(event -> {
            try {
                handleTwoToThree(event);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        threeToFour.setOnAction(event -> {
            try {
                handleThreeToFour(event);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        fourToFive.setOnAction(event -> {
            try {
                handleFourToFive(event);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        fiveToSix.setOnAction(event -> {
            try {
                handleFiveToSix(event);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        addNewMachine.setOnAction(event -> {
            try {
                handleAddNewMachine(event);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        }else{ 
            addNewMachine.setDisable(true);
            fiveToSix.setDisable(true);
            nineToTen  .setDisable(true);
            tenToEleven.setDisable(true);
            elevenToTwelve.setDisable(true);
            twelveToOne.setDisable(true);
            oneToTwo.setDisable(true);
            twoToThree.setDisable(true);
            threeToFour.setDisable(true);
            fourToFive.setDisable(true);
            m1.setDisable(true);
            m2.setDisable(true);
            m3.setDisable(true);
            m4.setDisable(true);
            m5.setDisable(true);
        }
        
        today.setOnAction(event -> {
            try {
                handleToday(event);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        load.setOnAction(event -> {
            try {
                handleLoad(event);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        previous.setOnAction(event -> {
            try {
                handleBack(event);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
    }
}