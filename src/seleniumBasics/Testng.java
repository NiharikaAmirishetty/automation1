package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
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

	@Test(invocationCount=3,groups="LOGIN",dependsOnMethods="test1")
	public void test2() throws InterruptedException {
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[]/input")).sendKeys("admin@admin.com");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/input")).sendKeys("123456");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[3]/input")).click();
		Thread.sleep(2000);
		System.out.println("logged in sucessfully");

	}
	@Test(groups="LOGIN",dependsOnMethods="test2")
	public void test3invaliduser() throws InterruptedException {
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[]/input")).sendKeys("admin@admin1.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/input")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[3]/input")).click();
		Thread.sleep(2000);
		System.out.println("logged in sucessfully");

	}
	@Test(groups="LOGIN",dependsOnMethods="test2")
	public void test4invalidpass() throws InterruptedException {
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/input")).sendKeys("admin@admin.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/input")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[3]/input")).click();
		Thread.sleep(2000);
		System.out.println("logged in sucessfully");
	}


	@AfterMethod
	public void teardown() {
		System.out.println("after method annotation");
		driver.close();
	}


}
