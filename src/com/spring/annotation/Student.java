package com.spring.annotation;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value(value="10")
	private int id;
	@Value(value="lisi")
	private String name;
	
	public Student() {
		super();
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	//set¡¢get·½·¨
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
