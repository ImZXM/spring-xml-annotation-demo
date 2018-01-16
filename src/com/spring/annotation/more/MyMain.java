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
		//从xml配置文件得到上下文
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("appContextAnnotatMore.xml");
		//IService service = (IService)context.getBean("service");
		//从java类得到上下文
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyContext.class);
		IService service = (IService) context.getBean("service");
		service.printStuInfo();
	}
}
