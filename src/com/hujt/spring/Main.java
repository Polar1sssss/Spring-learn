package com.hujt.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args){
		//ApplicationContext是IOC容器
		//ClassPathXmlApplicationContext是ApplicationContext的一个实现类
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//HelloWorld hw = (HelloWorld) ctx.getBean("helloworld");
		//hw.say();
		
		Car car = (Car)ctx.getBean("car");
		Car car2 = (Car)ctx.getBean("car2");
		System.out.println("car" + car);
		System.out.println("car2" + car2);
		
		Person p = (Person) ctx.getBean("person");
		System.out.println(p);
		
	}
}	
