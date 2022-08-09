package seleniumBasics;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.gecko.driver", 
						"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\geckodriver.exe");
				WebDriver driver =new FirefoxDriver();
				driver.manage().window().maximize();
				
//				driver.get("https://www.google.com");
				
//				driver.findElement(By.linkText("Gmail")).click();
//				driver.findElement(By.partialLinkText("Gma")).click();
				
				driver.get("https://opensource-demo.orangehrmlive.com");
				System.out.println(driver.getTitle());
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				//Thread.sleep(2000);				
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				//Thread.sleep(2000);
				driver.findElement(By.id("btnLogin")).click();
				String exptittle="HRM";
				String acttittle=driver.getTitle();
				System.out.println(driver.getTitle());			
				System.out.println(exptittle);
				if (acttittle.contains(exptittle)) {
					System.out.println("login sucessfully with valid data");
				} else {
					System.out.println("login failed with valid data");
				}
				
				//Thread.sleep(2000);

				driver.close();

		
		
	}

}
