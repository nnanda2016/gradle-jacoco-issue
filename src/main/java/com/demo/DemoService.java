package com.demo;

/**
 * TODO: Add a description
 * 
 * @author Niranjan Nanda
 */
public class DemoService {
	private final DemoDao dao;
	
	/**
	 * 
	 */
	public DemoService(final DemoDao dao) {
		this.dao = dao;
	}
	
	public void doSomething() {
		System.out.println("DemoService.doSomething is called...");
		dao.accessDb();
	}
}
