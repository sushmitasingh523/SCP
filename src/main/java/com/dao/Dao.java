package com.dao;

import java.util.List;

import com.model.Employee;

public interface Dao
{

	
		 //public List<Employee> getAllEmployee();
		List<Employee> getEmployee(int pageid,int total);
		public int getSize();
	

	
}
