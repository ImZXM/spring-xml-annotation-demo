package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DaoImpl implements IDao{
	
	@Autowired
	@Qualifier("student")
	private Student student;
	
	// 得到学生的信息
	@Override
	public String getStuInfo() {
		return "id:"+student.getId() + " name:" + student.getName();
	}
	//可不写set、get，因其用字段注入，不是从set方法注入
}
