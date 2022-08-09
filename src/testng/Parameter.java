package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Parameter {
	WebDriver driver;
	@BeforeMethod
	@Parameters
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		System.out.println("before method annotation");

	}

	@Test(groups="URL")
	public void test1() {
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		boolean valid =driver.findElement(By.xpath("//li[contains(text(),'12')]")).isDisplayed();
		System.out.println(valid);
		System.out.println("url launch sucessfully");
	}

	@AfterMethod
	public void teardown() {
		
	}

}
