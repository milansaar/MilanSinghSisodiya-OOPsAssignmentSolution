package com.greatlearning.gradedassessment1;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		return "Welcome to HR department";
	}
	public String doActivity() {
		return "Team lunch.";
	}
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance.";
	}
	public String getWorkDeadline() {
		return "Complete by EOD.";
	}
}
