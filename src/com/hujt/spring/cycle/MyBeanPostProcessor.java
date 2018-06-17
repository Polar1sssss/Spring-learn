package com.hujt.spring.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


/**
 * 
 * @author Administrator
 * bean�ĺ��ô�����ʵ��BeanPostProcessor�����ṩ����������ʵ��
 * bean��beanʵ������
 * beanName��Spring IOC�������õ�Bean������
 * ����ֵ��ʵ�ʷ��ظ��û��Ǹ�bea�������������������޸�bean
 */
public class MyBeanPostProcessor implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		
		System.out.println("postProcessBeforeInitialization...:" + bean + "," + beanName);
		/*if("car".equals(beanNae)){
			//....
		}*/
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessAfterInitialization..." + bean + "," + beanName);
		Car car = new Car();
		car.setBrand("fffffffffffffffff");
		return car;
	}

	
}	
