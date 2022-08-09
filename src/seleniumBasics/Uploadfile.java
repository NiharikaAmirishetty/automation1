package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		
		driver.get("https://html.com/input-type-file/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\amahe\\Downloads\\download.jpg");
		Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[3]/article[1]/div[1]/div[3]/form[1]/input[2]")).click();

	}

}
