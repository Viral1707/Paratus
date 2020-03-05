package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DurationForCity {

	WebDriver driver;

	public DurationForCity(WebDriver driver) {
		this.driver = driver;
	}

	By nextSideBtn = By.xpath("//*[@id=\"js_city_step_next\"]");
	
	
	
	

	
	public WebElement getNextSideBtn() {
		return driver.findElement(nextSideBtn);
	}

}
