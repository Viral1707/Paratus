package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//By departmentsLink = By.linkText("http://www.annauniv.edu/department/index.php");
	//By departmentsLink = By.xpath("//a[contains(text(),'Departments')]");
	
	
	
	
	By planYourNextVacationBtn = By.id("plan-my-trip");
	
		
		
		
	//By departmentsLink = By.xpath("//*[@id=\"965\"]/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td[5]");
	
	
	
	public WebElement getPlanYourNextVacLink() {
		return driver.findElement(planYourNextVacationBtn);
	}

}
