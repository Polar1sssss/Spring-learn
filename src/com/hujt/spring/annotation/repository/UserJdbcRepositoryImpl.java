package com.hujt.spring.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hujt.spring.annotation.TestObject;

/**
 * 
 * @author Administrator
 * UserRepositoryImpl�����Ľӿ��඼������userRepository����ʶ����Ҫ��ע���ʱ��ָ����Ӧ������
 */

@Repository
public class UserJdbcRepositoryImpl implements UserRepository{
	
	@Autowired(required=false)
	
	public void save(){
		System.out.println("UserRepository Save...");
		System.out.println("saaaa");
	}
}
