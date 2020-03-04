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
		
		FileInputStream fis = new FileInputStream("C:\\Vir@l's Data\\Interviews\\Test\\src\\main\\java\\Assignment\\Test\\data.properties");
		prop = new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Vir@l's Data\\\\Study\\\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
