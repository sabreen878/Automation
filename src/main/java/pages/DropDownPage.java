package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class DropDownPage extends PageBase{

	public DropDownPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(linkText = "Dropdown")
	WebElement dropDownLink;
	
	@FindBy(id = "dropdown")
	public WebElement dropdownBox;
	
	public void OpenDropDownPage()
	{
		clickButton(dropDownLink);
	}
}
