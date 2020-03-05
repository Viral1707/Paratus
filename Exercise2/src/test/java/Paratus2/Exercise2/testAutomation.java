package Paratus2.Exercise2;

import java.io.IOException;


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
		
		initializeBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		LandingPage lp = new LandingPage(driver);
		lp.getDepartmentLink().click();
	
		Thread.sleep(3000);
		
		PlaceAndDate pad = new PlaceAndDate(driver);
		/*
		pad.getPlaceToTravel().sendKeys("Houston");
		pad.getPlaceToTravel().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		pad.getPlaceToTravel().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		pad.getStartDate().click();
		Thread.sleep(5000);
		
		
		pad.getCurrentDate().click();
		
		pad.getStartDate().click();
		Thread.sleep(5000);
		
		
		pad.getEndDate().click();
		pad.getCurrentDate().click();
		*/
		
		Thread.sleep(20000);
		
		pad.getStartPlanningBtn().click();
		
		
		DurationForCity dfy = new DurationForCity(driver);
		dfy.getNextSideBtn().click();
		Thread.sleep(3000);
		HowWeCanHelp hwch = new HowWeCanHelp(driver);
		hwch.getOptionThird().click();
		Thread.sleep(3000);
		TravelToPage ttp = new TravelToPage(driver);
		ttp.getNextBtn().click();
		Thread.sleep(3000);
		TravelBackPage tbp = new TravelBackPage(driver);
		tbp.getNextBtn().click();
		Thread.sleep(3000);
		Accomodation acco = new Accomodation(driver);
		acco.getNextBtn().click();
		Thread.sleep(3000);
		WhoAreYouTravellingWith who = new WhoAreYouTravellingWith(driver);
		who.getWonderingSolo().click();
		Thread.sleep(3000);
		AgeGroup ageGroup = new AgeGroup(driver);
		ageGroup.getNextBtn().click();
		Thread.sleep(10000);
		EditableView editView = new EditableView(driver);
		editView.getEditableViewLbl().click();
		
		Thread.sleep(10000);
		driver.quit();
		
		
	}
	
	
}
