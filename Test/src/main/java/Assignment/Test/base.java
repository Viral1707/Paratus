package Assignment.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	WebDriver driver;
	Properties prop;
	
	public WebDriver initializeBrowser() throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Viral\\Automation\\Core_RestAssuredAutomation\\Test\\src\\main\\java\\Assignment\\Test\\data.properties");
		prop = new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		return driver;
	}

}
