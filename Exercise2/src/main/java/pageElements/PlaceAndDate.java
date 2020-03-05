package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlaceAndDate {

	WebDriver driver;

	public PlaceAndDate(WebDriver driver) {
		this.driver = driver;
	}

	By placeToTravel = By.xpath("//input[@placeholder=\"Where do you want to go?\"]");
	By startDate = By.xpath("//input[@placeholder=\"Start Date\"]");
	By endDate = By.xpath("//input[@placeholder=\"End Date\"]");
	By currentDate = By.cssSelector(".ui-state-default.ui-state-active");
	By startPlanningBtn = By.cssSelector(".button.p-color.full-width.start-planning");
	
	
	

	public WebElement getPlaceToTravel() {
		return driver.findElement(placeToTravel);
	}

	public WebElement getCurrentDate() {
		return driver.findElement(currentDate);
	}
	
	public WebElement getStartDate() {
		return driver.findElement(startDate);
	}

	public WebElement getEndDate() {
		return driver.findElement(endDate);
	}
	
	public WebElement getStartPlanningBtn() {
		return driver.findElement(startPlanningBtn);
	}

}
