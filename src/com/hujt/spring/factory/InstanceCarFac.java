package com.hujt.spring.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Administrator
 * ʵ������������������Ҫ�������������ٵ��ù���ʵ���ķ���������Bean��ʵ��
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
