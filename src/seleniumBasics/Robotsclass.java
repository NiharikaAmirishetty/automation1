package seleniumBasics;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Robotsclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
		Robot rt=new Robot();
	 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
	 rt.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(2000);
	 rt.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(2000);
	 rt.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(2000);
	 rt.keyPress(KeyEvent.VK_ENTER);
	 Thread.sleep(2000);
	 driver.close();
	 
	}

}
