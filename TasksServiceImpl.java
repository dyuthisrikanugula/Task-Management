package com.example.demo;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TasksServiceImpl implements TasksService{

	List<Tasks> list;
	
	public TasksServiceImpl() {
		list = new ArrayList<>();
	}
	
	@Override
	public List<Tasks> getcompletedtasks() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void addcompletedtasks(Customers tasks) {
		// TODO Auto-generated method stub
		Tasks tsk = new Tasks();
		tsk.setId(tasks.getId());
		tsk.setTaskname(tasks.getTaskname());
		list.add(tsk);
		
		
	}

}
