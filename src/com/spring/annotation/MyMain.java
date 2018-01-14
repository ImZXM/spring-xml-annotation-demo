package com.spring.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @author ZhangXuemeng
 *
 */
public class MyMain {
	public static void main(String[] args) {
		//读取配置文件
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("appContextAnnotat.xml");
		//获得bean  
		IService service = (IService)context.getBean("service");
		service.printStuInfo();
	}
}
