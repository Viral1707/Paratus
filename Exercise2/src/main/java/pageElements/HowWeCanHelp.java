package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HowWeCanHelp {

	WebDriver driver;

	public HowWeCanHelp(WebDriver driver) {
		this.driver = driver;
	}

	By optionThird = By.xpath("//*[@class=\"profile select-profile-3 \"]");
	
	public WebElement getOptionThird() {
		return driver.findElement(optionThird);
	}

}
