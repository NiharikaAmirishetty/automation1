package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BasicsTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suit annotations");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test annotations");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class annotations");

	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method annotations");
	}
		
	@Test
	public void test1() {
		System.out.println("test case 1 sucessfull");
	}
	@Test
	public void test2() {
		System.out.println("test case 2 sucessfull");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method annotations");
	}


	@AfterClass
	public void afterClass() {
		System.out.println("after class annotations");
	}


	@AfterTest
	public void afterTest() {
		System.out.println("after test annotations");
	}


	@AfterSuite
	public void afterSuite() {
		System.out.println("after suit annotations");
	}

}
