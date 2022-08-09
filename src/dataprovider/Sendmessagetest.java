package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sendmessagetest {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	

		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");						
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();

	}
	@DataProvider
	public void gettestdata() {


	}
	@Test
	public void testcase(String Selectcategory ,String Coursename,String Courseurl,String Message) {
		driver.findElement(By.xpath("//span[contains(text(),'Send Message students')]")).click();
		Select drop=new Select(driver.findElement(By.xpath("//select[@name='course_id']")));
		drop.selectByVisibleText(Selectcategory);
		driver.findElement(By.xpath("//input[@name='course_name']")).sendKeys(Coursename);
		driver.findElement(By.xpath("//input[@name='course_slug']")).sendKeys(Coursename);
		driver.findElement(By.xpath("//textarea[@name='course_desc_withoutCity']']")).sendKeys(Message);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
		@AfterMethod
		public void teardown() {
			driver.close();
		}
	}
