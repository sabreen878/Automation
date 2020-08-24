package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPasswordPage extends PageBase{

	public ForgetPasswordPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(linkText = "Forgot Password")
	WebElement forgetPasswordLink;
	
	@FindBy(id = "email")
	WebElement emailTXT;
	
	@FindBy(id = "form_submit")
	WebElement retreivePassword;
	
	@FindBy(id = "content")
	public WebElement forgetPasswordMessage;
	
	public void OpenForgetPasswordPage()
	{
		clickButton(forgetPasswordLink);
	}
	
	public void SetForgetPasswordEmail(String email)
	{
		setTextElementText(emailTXT, email);
		clickButton(retreivePassword);
	}
}
