package com.hujt.spring.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


/**
 * 
 * @author Administrator
 * bean的后置处理器实现BeanPostProcessor，并提供两个方法的实现
 * bean：bean实例本身
 * beanName：Spring IOC容器配置的Bean的名字
 * 返回值：实际返回给用户那个bea，可以在两个方法中修改bean
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
