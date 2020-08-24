package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxesPage extends PageBase{

	public CheckBoxesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Checkboxes")
	WebElement checkBoxLink;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/form/input[1]")
	public WebElement checkBox1;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/form/input[2]")
	public WebElement checkBox2;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/h3")
	public WebElement checkBoxMessage;
	
	public void clickOnCheckBox() throws InterruptedException
	{
		clickButton(checkBoxLink);
		clickButton(checkBox1);
		Thread.sleep(2000);
		clickButton(checkBox2);
	}
	
}
