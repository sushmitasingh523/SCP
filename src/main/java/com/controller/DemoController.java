package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.daoimpl.DaoImpl;
import com.model.Employee;

@Controller
public class DemoController 
{
	@Autowired
	DaoImpl empdao;
	int pageid =0;
/*
	 @RequestMapping(value="/",method=RequestMethod.GET)
		public String mi(Model model) 
		{
		System.out.println("in method");
		// model.addAttribute("empdis", new Employee());
			return "listemployee";
		}
	 */
	 
		@RequestMapping(value="/")
		 public String edit(Model mo)
			{
    	System.out.println("controller on success page ");
  	 List<Employee> emp =empdao.getEmployee();
  		   System.out.println("list-------------"+emp);
  		   mo.addAttribute("empdis", emp);
  		   return "Success";
 	 
 		  }
	
	
	
}
