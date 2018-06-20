package com.hujt.spring.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Administrator
 * 直接调用某一类的静态方法
 */
public class StaticCarFac {
	private static Map<String, Car> cars = new HashMap<String, Car>();
	
	static{
		cars.put("audi", new Car("audi", 300000));
		cars.put("ford", new Car("ford", 310000));
	}
	
	public static Car getCar(String name){
		return cars.get(name);
	}
}
