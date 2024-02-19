package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class DietPageController {
	@FXML
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//navigation functions in FXML file
	public void launchWorkouts(ActionEvent event) throws IOException {
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
	
	public void launchFriends(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("FriendsPage.fxml"));
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
