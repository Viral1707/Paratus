package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditableView {

	WebDriver driver;

	public EditableView(WebDriver driver) {
		this.driver = driver;
	}

	By editableViewLbl = By.xpath("//*[@id=\"screen-wrapper\"]/div[3]/div/div[2]/ul/li[2]");

	public WebElement getEditableViewLbl() {
		return driver.findElement(editableViewLbl);
	}

}
