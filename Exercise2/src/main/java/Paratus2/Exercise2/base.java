package Paratus2.Exercise2;

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
		
		FileInputStream fis = new FileInputStream("E:\\ParatusExercise\\Paratus\\Exercise2\\src\\main\\java\\Paratus2\\Exercise2\\data.properties");
		prop = new Properties();
		prop.load(fis);
		
		// Office - E:\ParatusExercise\Paratus\Exercise2\src\main\java\Paratus2\Exercise2\data.properties
		// Home - C:\\Vir@l's Data\\Paratus_Test\\Exercise2\\src\\main\\java\\Paratus2\\Exercise2\\data.properties
		
		
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		// Office - D:\\Automation\\chromedriver\\chromedriver.exe
		// Home - C:\\\\Vir@l's Data\\\\Study\\\\ChromeDriver\\chromedriver.exe
				
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
