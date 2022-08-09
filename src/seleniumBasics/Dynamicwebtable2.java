package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  Dynamicwebtable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");						
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
	//	/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr[1]/td[2]
	int rows=	driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr")).size();
		System.out.println(rows);
		int colm=	driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr[1]/td")).size();
		System.out.println(colm);
	String	table="/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr[";
	for (int i = 1; i <= rows; i++) {
		for (int j = 1; j <=colm; j++) {
			System.out.print(driver.findElement(By.xpath(table+i+"]/td["+j+"]")).getText()+"   ");
			
			
		}
		System.out.println();
		
	}
	}
	
	

}
