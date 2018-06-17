package com.hujt.spring;

public class HelloWorld {
	private String name;
	public void setName(String name){
		this.name = name;
	}
	public void say(){
		System.out.println("hello " + this.name );
	}
	public HelloWorld(){
		System.out.println("123");
	}
}
