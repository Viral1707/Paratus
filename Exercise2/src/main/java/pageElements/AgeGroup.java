package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgeGroup {

	WebDriver driver;

	public AgeGroup(WebDriver driver) {
		this.driver = driver;
	}

	By nextBtn = By.xpath("//*[@id=\"js_city_step_next\"]");

	public WebElement getNextBtn() {
		return driver.findElement(nextBtn);
	}

}
