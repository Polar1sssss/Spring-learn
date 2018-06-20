package com.hujt.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hujt.spring.annotation.controller.UserController;
import com.hujt.spring.annotation.repository.UserRepository;
import com.hujt.spring.annotation.service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
		//TestObject to = (TestObject)ctx.getBean("testObject");
		//System.out.println(to);
		
		//UserService us = (UserService)ctx.getBean("userService");
		//System.out.println(us);
		
		UserController uc = (UserController)ctx.getBean("userController");
		System.out.println(uc);
		uc.execute();
		
		//UserRepository up = (UserRepository)ctx.getBean("userRepository");
		//System.out.println(up);
	}
}
