package com.hujt.spring.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author hujt
 */
public class Main {
	public static void main(String[] args){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
		
		Car c1 = (Car)ctx.getBean("car1");
		System.out.println(c1);
		
		Car c2 = (Car)ctx.getBean("car2");
		System.out.println(c2);
	}
}
