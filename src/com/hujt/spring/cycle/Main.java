package com.hujt.spring.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author hujt
 * Bean的生命周期
 */
public class Main {
	public static void main(String[] args){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cycle.xml");
		Car c1 = (Car)ctx.getBean("car");
		System.out.println(c1);
		ctx.close();
	}
}
