package com.springxml;

public class ServiceImpl implements IService{

	private IDao dao;
	@Override
	public void printStuInfo() {
		System.out.println(dao.getStuInfo());
	}
	
	//daoµÄset¡¢get·½·¨
	public IDao getDao() {
		return dao;
	}
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
