package Assignment.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.api.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageElements.Homepage;
import pageElements.InstituteForOceanManagement;
import pageElements.UniversityDepartment;

public class testAutomation extends base{

	@Test
	public void testOne() throws IOException, InterruptedException {
		
		initializeBrowser();
		driver.get(prop.getProperty("url"));
		//driver.manage().window().maximize();
		Thread.sleep(10000);
		Homepage hp = new Homepage(driver);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		//long start_time = System.currentTimeMillis();
		executor.executeScript("arguments[0].click();", hp.getDepartmentLink());
		UniversityDepartment ud = new UniversityDepartment(driver);
		Actions action = new Actions(driver);
		action.moveToElement(ud.getCivilEngineeringLink()).build().perform();
		Thread.sleep(10000);
		
		//Screen s = new Screen();
		
		
		String actualTitleForOceanManagement = driver.getTitle();
		//System.out.println(actualTitleForOceanManagement);
		String expectedTitleForOceanManagement = "Institute For Ocean Management - Anna University offers M.Tech in Coastal Management. ENVIS Center for Coastal Zone Management and Coastal Shelterbelts";
		Assert.assertEquals(actualTitleForOceanManagement, expectedTitleForOceanManagement);
		InstituteForOceanManagement ifom = new InstituteForOceanManagement(driver);
		action.moveToElement(ifom.getResearchTheamsLink()).build().perform();
		Thread.sleep(10000);
		String actualTitleForCPMAH = driver.getTitle();
		//System.out.println(actualTitleForCPMAH);
		String expectedTitleForCPMAH = ":: IOM - Institute For Ocean Management - Anna University ::";
		Assert.assertEquals(actualTitleForCPMAH, expectedTitleForCPMAH);
		driver.quit();
		
	}
	
	
}
