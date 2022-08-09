package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmessage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\chromedriver.exe");

		WebDriver driv =new ChromeDriver();
		driv.manage().window().maximize();
		driv.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driv.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/input")).sendKeys("admin@admin.com");
		driv.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/input")).sendKeys("123456");
		driv.findElement(By.xpath("/html/body/div/div/div[2]/form/div[3]/input")).click();
		Thread.sleep(2000);
		driv.findElement(By.xpath("//a[@title='Categories']")).click();
		Thread.sleep(2000);

		driv.findElement(By.xpath("//*//*[@id=\"right-panel\"]/div/div/table/tbody/tr[2]/td[2]/a[1]")).click();
		Thread.sleep(2000);
		Alert altr =driv.switchTo().alert();
		Thread.sleep(2000);
		Thread.sleep(2000);

		
		System.out.println(altr.getText());
		altr.dismiss();
		Thread.sleep(2000);
		driv.close();
	}

}
