package com.example.demo;

import java.util.List;

public interface CustomerService {

	public List<Customers> gettasks();
	
	public Customers addtasks(Customers tasks);
	
	public Customers gettask(String taskId);
	
	public Customers deletetask(String taskId);
}
