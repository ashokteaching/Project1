package com.test.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void login() {
		System.out.println("login");
	}

	@Test
	public void logout() {
		System.out.println("logout");
	}

	
	@Test
	public void search() {
		Assert.assertEquals("search", "search","strings did not match");
		System.out.println("search functionality");
	}

}
