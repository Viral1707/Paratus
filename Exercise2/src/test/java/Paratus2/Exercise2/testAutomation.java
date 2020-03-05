package Paratus2.Exercise2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageElements.Accomodation;
import pageElements.AgeGroup;
import pageElements.DurationForCity;
import pageElements.EditableView;
import pageElements.HowWeCanHelp;
import pageElements.LandingPage;
import pageElements.PlaceAndDate;
import pageElements.TravelBackPage;
import pageElements.TravelToPage;
import pageElements.WhoAreYouTravellingWith;

public class testAutomation extends base{

	@Test
	public void testOne() throws IOException, InterruptedException {
		
		initializeBrowser();																		// Initialization of Browser
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		LandingPage lp = new LandingPage(driver);													// Landing page object creation
		lp.getPlanYourNextVacLink().click();
	
		Thread.sleep(3000);
		
		//Comment start
		
		PlaceAndDate pad = new PlaceAndDate(driver); 												// Object for the page on which place and dates are required to
																									// enter

		pad.getPlaceToTravel().sendKeys(prop.getProperty("destination")); // Enter the place
		pad.getPlaceToSelect().click();

		pad.getStartDate().click(); 																// Enter the Start Date
		Thread.sleep(3000);

		pad.getStartDateSel().click();

		pad.getEndDate().click(); 																	// Enter the End Date

		pad.getEndDateSel().click();
		
		
		//Comment stop
		
		
		
		
		Thread.sleep(20000);
		pad.getStartPlanningBtn().click();															// Click on Start Planning Button
		
		
		DurationForCity dfy = new DurationForCity(driver);											// Trip Duration Customization Page
		dfy.getNextSideBtn().click();
		
		HowWeCanHelp hwch = new HowWeCanHelp(driver);												// How Can We Help You Page
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(hwch.getOptionThird()));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"profile select-profile-3 \"]")));
		Thread.sleep(3000);
		hwch.getOptionThird().click();

		TravelToPage ttp = new TravelToPage(driver);												// Travel to trip details page
		//wait.until(ExpectedConditions.elementToBeClickable(ttp.getNextBtn()));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"button s-size p-color as-next js-next-alreadybooked\"]")));
		Thread.sleep(3000);
		ttp.getNextBtn().click();
		
		TravelBackPage tbp = new TravelBackPage(driver);											// Travel back trip details page
		//wait.until(ExpectedConditions.elementToBeClickable(tbp.getNextBtn()));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"button s-size p-color as-next js-next-alreadybooked\"]")));
		Thread.sleep(3000);
		tbp.getNextBtn().click();
		
		Accomodation acco = new Accomodation(driver);												// Accomodation details page
		//wait.until(ExpectedConditions.elementToBeClickable(acco.getNextBtn()));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"button s-size p-color as-next js-next-alreadybooked\"]")));
		Thread.sleep(3000);
		acco.getNextBtn().click();

		WhoAreYouTravellingWith who = new WhoAreYouTravellingWith(driver);							// Who are you travelling with
		//wait.until(ExpectedConditions.elementToBeClickable(who.getWonderingSolo()));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"entry-point solo-ep\"]")));
		Thread.sleep(3000);
		who.getWonderingSolo().click();
		 Thread.sleep(3000);
		
		AgeGroup ageGroup = new AgeGroup(driver);													// Age group details
		//wait.until(ExpectedConditions.elementToBeClickable(ageGroup.getNextBtn()));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"js_city_step_next\"]")));
		Thread.sleep(3000);
		ageGroup.getNextBtn().click();
		Thread.sleep(10000);
		
		EditableView editView = new EditableView(driver);											//Trip Summary page
		editView.getEditableViewLbl().click();
		Thread.sleep(10000);
		driver.quit(); //Commit purpose
		
	}
	
	
}
