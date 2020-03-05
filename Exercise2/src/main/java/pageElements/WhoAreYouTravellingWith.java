package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhoAreYouTravellingWith {

	WebDriver driver;

	public WhoAreYouTravellingWith(WebDriver driver) {
		this.driver = driver;
	}

	By wonderingSolo = By.xpath("//*[@class=\"entry-point solo-ep\"]");

	public WebElement getWonderingSolo() {
		return driver.findElement(wonderingSolo);
	}

}
