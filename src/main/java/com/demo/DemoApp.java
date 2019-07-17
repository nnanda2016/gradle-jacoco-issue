package com.demo;

/**
 * TODO: Add a description
 * 
 * @author Niranjan Nanda
 */
public class DemoApp {
	private final DemoService service;
	
	/**
	 * 
	 */
	public DemoApp(final DemoService service) {
		this.service = service;
	}
	
	public void runApp() {
		System.out.println("DemoApp.runApp is called...");
		this.service.doSomething();
	}
}
