package com.demo;

import org.testng.annotations.Test;

/**
 * TODO: Add a description
 * 
 * @author Niranjan Nanda
 */
@Test(groups = "appTests")
public class DemoAppTest {
	private final DemoDao demoDao = new DemoDao();
	private final DemoService service = new DemoService(demoDao);
	private final DemoApp demoApp = new DemoApp(service);
	
	@Test
	public void runApp_all_good() {
		demoApp.runApp();
	}
}
