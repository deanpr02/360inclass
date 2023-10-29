package application;

import java.io.Serializable;

public class Log implements Serializable{
	private String projectName;
	private String lifeCycleStep;
	private String effortCategory;
	private String planType;
	private String startTime;
	private String endTime;
	
	public Log(String projectName, String lifeCycleStep, String effortCategory, String planType, String startTime, String endTime) {
		this.projectName = projectName;
		this.lifeCycleStep = lifeCycleStep;
		this.effortCategory = effortCategory;
		this.planType = planType;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public String getProjectName() {
		return this.projectName;
	}
	public String getLifeCycleStep() {
		return this.lifeCycleStep;
	}
	public String getEffortCategory() {
		return this.effortCategory;
	}
	public String getPlanType() {
		return this.planType;
	}
	public String getStartTime() {
		return this.startTime;
	}
	public String getEndTime() {
		return this.endTime;
	}
	
	public String toString() {
		return "Start time: " + this.startTime + " End time: " + this.endTime + " Project: " + this.projectName + " LifeCycle: " + this.lifeCycleStep + " EffortCategory: " + this.effortCategory + " Plan: " + this.planType; 
	}
}
