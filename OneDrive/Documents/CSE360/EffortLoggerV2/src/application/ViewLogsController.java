package application;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ViewLogsController extends Controller{
	
	private ArrayList<Project> userProjects;
	private ArrayList<Log> userLogs;
	private StringBuilder fieldContent = new StringBuilder("");
	@FXML
	private TextArea viewLogsField;
	
	@FXML
	public void showLogs() {
		viewLogsField.setText("");
		userProjects = Main.currentUser.getProjects();
		for(int i = 0; i < userProjects.size(); i++) {
			fieldContent.append(userProjects.get(i).getName() + "\n");
			userLogs = userProjects.get(i).getLogs();
			for(int j = 0; j < userLogs.size(); j++) {
				fieldContent.append(userLogs.get(j).toString() + "\n");
			}
		}
		viewLogsField.setText(fieldContent.toString());
	}
}
