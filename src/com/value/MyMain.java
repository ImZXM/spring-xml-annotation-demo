package com.value;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springxml.IService;

public class MyMain {
	public static void main(String[] args) {
		//��ȡ�����ļ�
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//���bean  
		IService service = (IService)context.getBean("service");
		service.printStuInfo();
	}
}
