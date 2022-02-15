package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass2 {
	
	

	@Test
	public void testF() {
		System.out.println("test F TestClass2 ");	
	}

	@Test
	public void testH() {
		System.out.println("test H TestClass2");	
	}
		
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method TestClass2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class TestClass2");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test TestClass2");
	}


}
