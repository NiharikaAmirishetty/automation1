package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\chromedriver.exe");

		WebDriver driv =new ChromeDriver();
		driv.manage().window().maximize();
		driv.get("https://www.irctc.co.in/nget/train");
		Thread.sleep(2000);
		driv.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
		Thread.sleep(2000);
		driv.findElement(By.xpath("//a[contains(text(),'BUSES')]")).click();
		Thread.sleep(2000);
		driv.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		Thread.sleep(2000);
		driv.findElement(By.xpath("//a[contains(text(),'HOTELS')]")).click();
		Thread.sleep(2000);
		Set<String> wind =driv.getWindowHandles();
		Iterator<String> it =wind.iterator();
		String parent=it.next();
		//	System.out.println(it.hasNext());
		//String buses=it.next();
		//	System.out.println(it.hasNext());
		//	String flghts=it.next();
		System.out.println(it.hasNext());
		String hotels=it.next();
		System.out.println(it.hasNext());
		driv.switchTo().window(parent);
		driv.switchTo().window(hotels);
		driv.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]")).click();






		Thread.sleep(2000);

		driv.quit();





	}

}
