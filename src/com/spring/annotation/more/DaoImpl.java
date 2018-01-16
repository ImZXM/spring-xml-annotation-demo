package com.spring.annotation.more;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

@Repository(value="dao")
public class DaoImpl implements IDao{
	
	@Resource
	private Student student;
	
	// �õ�ѧ������Ϣ
	@Override
	public String getStuInfo() {
		return "id:"+student.getId() + " name:" + student.getName();
	}
	//�ɲ�дset��get���������ֶ�ע�룬���Ǵ�set����ע��
}
