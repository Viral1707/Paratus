package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelToPage {

	WebDriver driver;

	public TravelToPage(WebDriver driver) {
		this.driver = driver;
	}

	By nextBtn = By.xpath("//*[@class=\"button s-size p-color as-next js-next-alreadybooked\"]");
	
	public WebElement getNextBtn() {
		return driver.findElement(nextBtn);
	}

}
