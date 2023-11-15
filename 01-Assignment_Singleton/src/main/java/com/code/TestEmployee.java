package com.code;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestEmployee {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Account a=(Account)context.getBean("accountbean");
		System.out.println(a);
		Customer cu=(Customer)context.getBean("cus");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to update");
		int r=sc.nextInt();
		cu.setId(r);
		a.setCus(cu);
		System.out.println(a);
		
		
	}

}
