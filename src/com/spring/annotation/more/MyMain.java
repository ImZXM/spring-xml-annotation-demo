package com.spring.annotation.more;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
/**
 * 
 * @author ZhangXuemeng
 *
 */
public class MyMain {
	public static void main(String[] args) {
		//��xml�����ļ��õ�������
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("appContextAnnotatMore.xml");
		//IService service = (IService)context.getBean("service");
		//��java��õ�������
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyContext.class);
		IService service = (IService) context.getBean("service");
		service.printStuInfo();
	}
}
