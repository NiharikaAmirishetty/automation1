package seleniumBasics;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoadModule {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\chromedriver.exe");
//		new ChromeDriver();
		

		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
//		System.setProperty("webdriver.edge.driver", 
//				"C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\Jars\\msedgedriver.exe");
//		new EdgeDriver();
	}

}
