package com.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Employee;



@Repository
public class DaoImpl 
{
	@Autowired
	private SessionFactory sf;
	Session session;

	@Transactional
	public List<Employee> getEmployee()
	{
	
		session=sf.openSession();
	Criteria cr	= session.createCriteria(Employee.class);
	List<Employee> elist =(List<Employee>)cr.list();
	return elist;
	}
	
	
	

}
