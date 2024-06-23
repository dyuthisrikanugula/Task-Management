package com.example.demo;

public class Customers {

	private String taskname;
	private String id;
	
	@Override
	public String toString() {
		return "Customers [taskname=" + taskname + ", id=" + id + "]";
		
	}
	public String getTaskname() {
		return taskname;
	}
	
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	
	public String getId() {
		return id;
	}
	public Customers(String id, String taskname) {
		this.taskname = taskname;
		this.id = id;
	}
	public void setId(String id) {
		this.id = id;
	}
		
}
