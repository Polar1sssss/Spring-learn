package com.hujt.spring.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hujt.spring.annotation.TestObject;

/**
 * 
 * @author Administrator
 * UserRepositoryImpl及它的接口类都可以用userRepository来标识，需要在注解的时候指定对应的名字
 */

@Repository
public class UserJdbcRepositoryImpl implements UserRepository{
	
	@Autowired(required=false)
	
	public void save(){
		System.out.println("UserRepository Save...");
		System.out.println("saaaa");
	}
}
