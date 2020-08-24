package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Form Authentication")
	WebElement loginLink;
	
	@FindBy(id = "username")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(className = "radius")
	WebElement loginBTN;
	
	@FindBy(id = "flash-messages")
	public WebElement loginMessage;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/a")
	WebElement logoutLink;
	
	public void clickLoginLink()
	{
		clickButton(loginLink);
	}
	
	public void setLoginCredencials(String username, String password)
	{
		setTextElementText(userName, username);
		setTextElementText(Password, password);
		clickButton(loginBTN);
	}
	
	public void clickLogoutLink()
	{
		clickButton(logoutLink);
	}
	
}
