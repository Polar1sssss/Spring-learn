package com.hujt.spring.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.hujt.spring.annotation.TestObject;

/**
 * 
 * @author Administrator
 * UserRepositoryImpl��UserJdbcRepositoryImpl�����඼��UserRepository��ʵ���࣬
 * ���Զ�װ��ʱ��Ҫ@Qualifierָ��װ���ĸ���
 */

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	public void save(){
		System.out.println("UserRepository Save...");
		System.out.println("saaaa");
	}
}
