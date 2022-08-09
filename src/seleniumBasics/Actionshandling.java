package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionshandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();

		Actions atn = new Actions(driver);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);
		WebElement  drag= driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);
		atn.clickAndHold(drag).moveToElement(drop).release().build().perform();
		Thread.sleep(2000);
//		atn.dragAndDrop(drag, drop).build().perform();
//		Thread.sleep(2000);
//		atn.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")) ,driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
//		driver.close();

	}

}
