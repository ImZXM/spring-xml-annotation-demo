package com.springxml;

public class DaoImpl implements IDao{
	private Student student;
	
	// �õ�ѧ������Ϣ
	@Override
	public String getStuInfo() {
		return "id:"+student.getId() + " name:" + student.getName();
	}
	
	//student��get��set����
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
