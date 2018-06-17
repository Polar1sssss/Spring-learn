package com.hujt.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Administrator
 * Bean���Զ�װ��
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");
		Person p = (Person)ctx.getBean("person");
		System.out.println(p);
	}
}
