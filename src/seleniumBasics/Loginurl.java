package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginurl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//name locator

		//		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		//		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		//		Thread.sleep(2000);
		//		driver.findElement(By.name("password")).sendKeys("123456");
		//		Thread.sleep(2000);
		//		driver.findElement(By.name("submit")).click();
		//		Thread.sleep(2000);
		//		driver.close();

		//class locator

		//		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		//	driver.findElement(By.className("form-control")).sendKeys("admin@admin.com");
		//		Thread.sleep(2000);
		//	
		//		driver.findElement(By.className("btn btn-primary pull-right")).click();
		//		Thread.sleep(2000);
		//		driver.close();

		//	css selector

		//		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		//		driver.findElement(By.cssSelector("body > div > div > div.middle > form > div:nth-child(1) > input")).sendKeys("admin@admin.com");
		//		Thread.sleep(2000);
		//		driver.findElement(By.cssSelector("body > div > div > div.middle > form > div:nth-child(2) > input")).sendKeys("123456");
		//		Thread.sleep(2000);
		//		driver.findElement(By.cssSelector("body > div > div > div.middle > form > div:nth-child(3) > input")).click();
		//		Thread.sleep(2000);
		//		driver.close();

		// xpath locator

		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/input")).sendKeys("admin@admin.com");
				Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/input")).sendKeys("123456");
			Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[3]/input")).click();
				Thread.sleep(2000);
		driver.close();
		
		
	}
}


