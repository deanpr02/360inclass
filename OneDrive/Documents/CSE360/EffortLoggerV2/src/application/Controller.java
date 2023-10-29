package application;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.Node;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class Controller {
	private Scene scene;
	private Stage stage;
	//private Login login = new Login();
	
	@FXML
	private Label userLabel;
	//@FXML
	//private PasswordField passwordField;
	

	
	public void toEffortConsole(ActionEvent event) throws IOException
	{
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EffortConsolePage.fxml"));
		//login.setName(usernameField.getText());
		//login.setPassword(passwordField.getText());
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(fxmlLoader.load(), 600, 400);
		stage.setTitle("Effort Console");
		
		//DisplayViewController control = fxmlLoader.getController();
		//control.setLogin(login);
		stage.setScene(scene);
		stage.show();
		
		
	}
	
	public void toDefectConsole(ActionEvent event) throws IOException
	{
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DefectConsolePage.fxml"));
		//login.setName(usernameField.getText());
		//login.setPassword(passwordField.getText());
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(fxmlLoader.load(), 600, 400);
		stage.setTitle("Defect Console");
		
		//DisplayViewController control = fxmlLoader.getController();
		//control.setLogin(login);
		stage.setScene(scene);
		stage.show();
		
		
	}
	
	public void toViewLogs(ActionEvent event) throws IOException
	{
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewLogsPage.fxml"));
		//login.setName(usernameField.getText());
		//login.setPassword(passwordField.getText());
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(fxmlLoader.load(), 600, 400);
		stage.setTitle("View Logs");
		
		//DisplayViewController control = fxmlLoader.getController();
		//control.setLogin(login);
		stage.setScene(scene);
		stage.show();
		
		
	}

}