package application;

import java.io.Serializable;
import java.util.ArrayList;

public class Project implements Serializable{
	private String projectName;
	private ArrayList<Log> logs;
	
	public Project(String projectName) {
		this.projectName = projectName;
		logs = new ArrayList<Log>();
	}
	
	public String getName() {
		return this.projectName;
	}
	
	public ArrayList<Log> getLogs() {
		return this.logs;
	}
	public void addLog(Log log) {
		logs.add(log);
	}
}
