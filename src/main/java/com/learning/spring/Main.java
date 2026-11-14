package com.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.spring.model.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new AnnotationConfigApplicationContext("com.learning.spring");

		Employee e1 = ioc.getBean("employee",Employee.class);

		System.out.println(e1);

	}

}
