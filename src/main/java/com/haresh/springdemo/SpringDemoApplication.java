package com.haresh.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.haresh.model.Employee;

public class SpringDemoApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		String msg = (String) context.getBean("hello");
		System.out.println(msg);
		
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

	}

}
