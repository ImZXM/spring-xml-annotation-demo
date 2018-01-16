package com.spring.annotation.more;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service(value="service")
public class ServiceImpl implements IService{

	@Resource(name="dao")
	private IDao dao;
	
	@Override
	public void printStuInfo() {
		System.out.println(dao.getStuInfo());
	}
}
