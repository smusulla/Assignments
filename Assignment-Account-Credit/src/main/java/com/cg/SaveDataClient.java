package com.cg;


import com.cg.entity.Employee;
import com.cg.entity.Person;
import com.cg.entity.Student;
import com.cg.util.JPAUtil;

import jakarta.persistence.EntityManager;

public class SaveDataClient {

	public static void main(String[] args) {
		EntityManager entityManager=JPAUtil.getEntityManagerFactory().createEntityManager();
		Person person=new Person();
		person.setId(101);
		person.setGender("Male");
		person.setName("Siva");
		
		Employee emp=new Employee();
		emp.setBonus(200);
		emp.setEmail("abc@gmail.com");
		emp.setGender("Male");
		emp.setId(1001);
		
		Student s1=new Student();
		s1.setFee(10000);
		s1.setSchoolName("Z.P.P.H");
		s1.setSectionName("A");
		
		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.persist(emp);
		entityManager.persist(s1);
		entityManager.getTransaction().commit();
		entityManager.close();
		JPAUtil.shutdown();
		
	}

}
