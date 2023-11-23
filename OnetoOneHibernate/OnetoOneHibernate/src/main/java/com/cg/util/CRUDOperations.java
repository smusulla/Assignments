package com.cg.util;

import com.cg.entity.Employee;

import com.cg.entity.EmployeeDetail;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;


public class CRUDOperations {

	public void insertEntity() {
		EntityManager entitymanager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		entitytransaction.begin();
		
		Employee emp=new Employee();
		emp.setName("siva");
	
		EmployeeDetail empd=new EmployeeDetail();
		
		empd.setAge(27);
		emp.setEmployeedetails(empd);
		System.out.println(emp);
		
		entitymanager.persist(emp);
		entitytransaction.commit();
		entitymanager.close();
	}

	public void findEntity() {
		EntityManager entitymanager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		entitytransaction.begin();
		Employee empobj = entitymanager.find(Employee.class, 2);
		System.out.println(empobj);
		entitytransaction.commit();
		entitymanager.close();
	}

	public void updateEntity() {

    	EntityManager entitymanager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		entitytransaction.begin();
		Employee empobj = entitymanager.find(Employee.class, 2);
		System.out.println(empobj);
		empobj.setName("rohan");
		entitytransaction.commit();
	entitymanager.close();

}

	public void removeEntity() {
		EntityManager entitymanager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		entitytransaction.begin();
		Employee empObj = entitymanager.find(Employee.class, 2);
		entitymanager.remove(empObj);
		entitytransaction.commit();
		entitymanager.close();
	}

}
