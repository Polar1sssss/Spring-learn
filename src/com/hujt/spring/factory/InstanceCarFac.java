package com.hujt.spring.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Administrator
 * 实例工厂方法：即先需要创建工厂本身，再调用工厂实例的方法来返回Bean的实例
 */
public class InstanceCarFac {
	private Map<String, Car> cars = null;
	
	public InstanceCarFac(){
		cars = new HashMap<String, Car>();
		cars.put("audi", new Car("audi", 300000));
		cars.put("ford", new Car("ford", 310000));
	}
	
	public Car getCar(String brand){
		return cars.get(brand);
	}
}
