package com.spring.annotation.more;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.spring.annotation.more")
@Configuration
public class MyContext {
	
/*	@Bean
	public Student student() {
		return new Student();
	}
	
	@Bean
	public IDao dao() {
		return new DaoImpl();
	}
	
	@Bean
	public IService service(){
		return new ServiceImpl();
	}*/
}
