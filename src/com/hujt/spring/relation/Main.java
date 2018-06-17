package com.hujt.spring.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hujt.spring.autowire.Address;
import com.hujt.spring.autowire.Car;
import com.hujt.spring.autowire.Person;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
		
		/*Address a1 = (Address) ctx.getBean("address");
		System.out.println(a1);
		
		Address a2 = (Address) ctx.getBean("address2");
		System.out.println(a2);
		
		Person p1 = (Person) ctx.getBean("person");
		System.out.println(p1);*/
		
		Car c1 = (Car)ctx.getBean("car"); 
		Car c2 = (Car)ctx.getBean("car"); 
		System.out.println(c1 == c2);
	}
}
