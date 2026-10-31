package com.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring.model.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee e1 = ioc.getBean("emp1", Employee.class);
		Employee e2 = ioc.getBean("emp1", Employee.class);
		Employee e3 = ioc.getBean("emp1", Employee.class);
		Employee e4 = ioc.getBean("emp1", Employee.class);

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);


	}

}
