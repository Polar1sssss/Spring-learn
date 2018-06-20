package com.hujt.spring.factorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hujt.spring.factory.Car;

/**
 * 
 * @author hujt
 */
public class Main {
	public static void main(String[] args){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factorybean.xml");	
		Car c1 = (Car)ctx.getBean("car");
		System.out.println(c1);
	}
}
