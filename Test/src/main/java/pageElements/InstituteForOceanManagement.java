package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InstituteForOceanManagement {
	
	
	//*[text()=' Faculty of Civil Engineering ']
	
WebDriver driver;
	
	public InstituteForOceanManagement(WebDriver driver) {
		this.driver = driver;
	}
	
	
By researchTheamsLink = By.xpath("//*[text()='Research Themes']");
	
	
	public WebElement getResearchTheamsLink() {
		return driver.findElement(researchTheamsLink);
	}

}
