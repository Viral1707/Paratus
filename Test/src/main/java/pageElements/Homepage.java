package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By departmentsLink = By.xpath("//a[text()='Departments']");
	
	
	public WebElement getDepartmentLink() {
		return driver.findElement(departmentsLink);
	}

}
