package com.hujt.spring.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.hujt.spring.annotation.TestObject;

/**
 * 
 * @author Administrator
 * UserRepositoryImpl和UserJdbcRepositoryImpl两个类都是UserRepository的实现类，
 * 在自动装配时需要@Qualifier指定装配哪个类
 */

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	public void save(){
		System.out.println("UserRepository Save...");
		System.out.println("saaaa");
	}
}
