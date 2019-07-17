package com.demo;

import org.testng.annotations.Test;

/**
 * TODO: Add a description
 * 
 * @author Niranjan Nanda
 */
@Test(groups = "serviceTests")
public class ServiceTest {
	private final DemoDao demoDao = new DemoDao();
	private final DemoService service = new DemoService(demoDao);
	
	@Test
	public void doSomething() {
		service.doSomething();
	}
}
