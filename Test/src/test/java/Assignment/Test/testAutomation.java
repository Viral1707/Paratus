package Assignment.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageElements.Homepage;
import pageElements.InstituteForOceanManagement;
import pageElements.UniversityDepartment;

public class testAutomation extends base{

	@Test
	public void testOne() throws IOException, InterruptedException, FindFailed {
		
		initializeBrowser(); // Browser Initializer
		driver.get(prop.getProperty("url"));
		//driver.manage().window().maximize();
		Thread.sleep(10000);
		Homepage hp = new Homepage(driver); // Homepage object creation
		JavascriptExecutor executor = (JavascriptExecutor)driver; // Used javasript executed to click on department link
		//long start_time = System.currentTimeMillis();
		executor.executeScript("arguments[0].click();", hp.getDepartmentLink());
		UniversityDepartment ud = new UniversityDepartment(driver); // University Department object creation
		Actions action = new Actions(driver);					// Actions class to perform hoverover
		action.moveToElement(ud.getCivilEngineeringLink()).build().perform();
		Thread.sleep(10000);
		/*
		// Sikuli is implemented to click on the dropdown tab for which element is being tough to find - but facing challenges with sikuly as well for this
		Screen screen = new Screen();
		Pattern linkIOM = new Pattern("E:\\Screenshots" + "CoastalPollutionMonitoringAndHazards.PNG");
		Pattern linkResearchTheamsCPMH = new Pattern("E:\\Screenshots" + "InstituteforOceanManagement");

		screen.click(linkIOM);
		*/
		String actualTitleForOceanManagement = driver.getTitle();
		//System.out.println(actualTitleForOceanManagement);
		String expectedTitleForOceanManagement = "Institute For Ocean Management - Anna University offers M.Tech in Coastal Management. ENVIS Center for Coastal Zone Management and Coastal Shelterbelts";
		Assert.assertEquals(actualTitleForOceanManagement, expectedTitleForOceanManagement); //Verification of title for page after clicking Institute for Ocean Management
		InstituteForOceanManagement ifom = new InstituteForOceanManagement(driver);
		action.moveToElement(ifom.getResearchTheamsLink()).build().perform();
		Thread.sleep(10000);

		//screen.click(linkResearchTheamsCPMH);
		String actualTitleForCPMAH = driver.getTitle();
		//System.out.println(actualTitleForCPMAH);
		String expectedTitleForCPMAH = ":: IOM - Institute For Ocean Management - Anna University ::";
		Assert.assertEquals(actualTitleForCPMAH, expectedTitleForCPMAH); //Verification of title for page after clicking Costal Pollution Monitoring and Hazards
		driver.quit();
		
	}
	
	
}
