package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

	List<Customers> list;
	
	public CustomerServiceImpl() {
		list=new ArrayList<>();
	}
	
	@Override
	public List<Customers> gettasks() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Customers addtasks(Customers tasks) {
		// TODO Auto-generated method stub
		list.add(tasks);
		return tasks;
	}

	@Override
	public Customers gettask(String taskId) {
		// TODO Auto-generated method stub
		Customers c = null;
		for(Customers course:list) {
			if(course.getId()!=null) {
				if(course.getId().equals(taskId)) {
					c=course;
					break;
				}
			}
		}
		return c;
	}

	@Override
	public Customers deletetask(String taskId) {
		// TODO Auto-generated method stub
		Customers c = null;
		for (Customers course:list) {
			if(course.getId()!=null) {
				if(course.getId().equals(taskId)) {
					c=course;
					list.remove(c);
					break;
				}
			}
		}
		return c;
	}

}
