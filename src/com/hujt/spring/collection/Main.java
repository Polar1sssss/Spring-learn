package com.hujt.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Administrator
 * ¼¯ºÏ
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person p = (Person) ctx.getBean("person2");
		System.out.println(p);
		
		NewPerson np = (NewPerson)ctx.getBean("newperson");
		System.out.println(np);
	}
}
