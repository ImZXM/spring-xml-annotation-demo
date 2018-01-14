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
		//��ȡ�����ļ�
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("appContextAnnotat.xml");
		//���bean  
		IService service = (IService)context.getBean("service");
		service.printStuInfo();
	}
}
