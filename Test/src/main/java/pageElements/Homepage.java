package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	//By departmentsLink = By.linkText("http://www.annauniv.edu/department/index.php");
	//By departmentsLink = By.xpath("//a[contains(text(),'Departments')]");
	
	
	
	
	By departmentsLink = By.cssSelector("[href='http://www.annauniv.edu/department/index.php']");
	
		
		
		
	//By departmentsLink = By.xpath("//*[@id=\"965\"]/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td[5]");
	
	
	
	public WebElement getDepartmentLink() {
		return driver.findElement(departmentsLink);
	}

}
