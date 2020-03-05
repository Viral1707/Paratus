package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UniversityDepartment {
	
	
	//*[text()=' Faculty of Civil Engineering ']
	
WebDriver driver;
	
	public UniversityDepartment(WebDriver driver) {
		this.driver = driver;
	}
	
	
By civilEngineeringLink = By.xpath("//*[text()=' Faculty of Civil Engineering ']");
	
	
	public WebElement getCivilEngineeringLink() {
		return driver.findElement(civilEngineeringLink);
	}

}
