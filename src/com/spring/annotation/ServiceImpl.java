package com.spring.annotation;

import javax.annotation.Resource;

public class ServiceImpl implements IService{

	@Resource(name="dao")
	private IDao dao;
	
	@Override
	public void printStuInfo() {
		System.out.println(dao.getStuInfo());
	}
}
