package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DaoImpl implements IDao{
	
	@Autowired
	@Qualifier("student")
	private Student student;
	
	// �õ�ѧ������Ϣ
	@Override
	public String getStuInfo() {
		return "id:"+student.getId() + " name:" + student.getName();
	}
	//�ɲ�дset��get���������ֶ�ע�룬���Ǵ�set����ע��
}
