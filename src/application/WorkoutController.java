package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class WorkoutController {
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	private ChoiceBox<String> workoutSelector;
	private String[] workouts = {"Workout 1","Workout 2"};
	
	private String[] exs = new String[5];
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		workoutSelector.getItems().addAll(workouts);
		workoutSelector.setItems((ObservableList<String>)Arrays.asList(workouts));
	}

	//navigation functions in FXML file
	public void backToWorkouts(ActionEvent event) throws IOException {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("WorkoutPage.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
