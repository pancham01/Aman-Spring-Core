package com.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring.model.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee e1 = ioc.getBean("emp1", Employee.class);

		System.out.println(e1);


	}

}
