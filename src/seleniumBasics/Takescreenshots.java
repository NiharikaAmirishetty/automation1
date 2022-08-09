package seleniumBasics;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshots {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		takeScreenshot("googlehomepage");

	}
public static void takeScreenshot(String filename) throws IOException {
	
	File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(file, new File("C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\screenshot\\"+ filename+".png" ));
	//FileUtils.copyFile(file, new File("\\C:\\Users\\amahe\\Desktop\\ammu\\"+ filename+".jpg" ));
	FileUtils.copyFile(file, new File("\\C:\\Users\\amahe\\Desktop\\ammu\\"+ filename+".pdf" ));
}

}



