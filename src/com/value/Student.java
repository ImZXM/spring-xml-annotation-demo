package com.value;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	

	private int id;
	
	@Value(value="zhansan")
	private String name;
	//set¡¢get·½·¨
	public int getId() {
		return id;
	}
	@Value(value="20")
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
