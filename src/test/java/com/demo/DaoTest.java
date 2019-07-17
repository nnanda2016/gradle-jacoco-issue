package com.demo;

import org.testng.annotations.Test;

/**
 * TODO: Add a description
 * 
 * @author Niranjan Nanda
 */
@Test(groups = "daoTests")
public class DaoTest {
	
	private final DemoDao demoDao = new DemoDao();
	
	@Test
	public void accessDb_all_good() {
		demoDao.accessDb();
	}
}
