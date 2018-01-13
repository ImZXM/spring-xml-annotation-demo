package com.springxml;

public class DaoImpl implements IDao{
	private Student student;
	
	// 得到学生的信息
	@Override
	public String getStuInfo() {
		return "id:"+student.getId() + " name:" + student.getName();
	}
	
	//student的get、set方法
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
