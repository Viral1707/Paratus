package Assignment.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import pageElements.Homepage;

public class testAutomation extends base{

	@Test
	public void testOne() throws IOException, InterruptedException {
		
		initializeBrowser();
		driver.get(prop.getProperty("url"));
		//driver.manage().window().maximize();
		Thread.sleep(10000);
		Homepage hp = new Homepage(driver);
		hp.getDepartmentLink().click();
		
		Thread.sleep(10000);
		
		driver.quit();
		
	}
	
	
}
