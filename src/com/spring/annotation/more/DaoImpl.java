package com.spring.annotation.more;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

@Repository(value="dao")
public class DaoImpl implements IDao{
	
	@Resource
	private Student student;
	
	// 得到学生的信息
	@Override
	public String getStuInfo() {
		return "id:"+student.getId() + " name:" + student.getName();
	}
	//可不写set、get，因其用字段注入，不是从set方法注入
}
