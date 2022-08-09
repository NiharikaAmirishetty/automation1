package seleniumBasics;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.SendKeys;

public class Dynamicwebtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	

		driver.get(" https://digitechinc.in/demos/1swishzz_staging/admin");
		//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")).sendKeys("123456");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[3]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/aside[1]/nav[1]/ul[1]/li[5]/a[1]")).click();
		//html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]
		int rows=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr")).size();
		System.out.println(rows);
		int colms= driver.findElements(By.xpath("html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td")).size();
		System.out.println(colms);
	String table="html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[";
		for (int i = 1; i <=rows; i++) {
			for (int j = 1; j <= colms; j++) {
System.out.print(driver.findElement(By.xpath(table + i +"]/td["+j+"]")).getText()+" ");
			}
System.out.println();
		}
		for (int i = 1; i < rows; i++) {
			System.out.println(driver.findElement(By.xpath(table+i+ "]/td[1]")).getText());
			
		}
		for (int i = 1; i < colms; i++) {
			System.out.println(driver.findElement(By.xpath(table+ "1]/td[" +i+"]")).getText());
		}
	}

}



