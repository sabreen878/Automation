package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class AlertPage extends PageBase{

	public AlertPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(linkText = "JavaScript Alerts")
	WebElement Alerts;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/ul/li[1]/button")
	WebElement JSAlert;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/ul/li[2]/button")
	WebElement JSConfirmAlert;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/ul/li[3]/button")
	WebElement JSPromptAlert;
	
	
	public void OpenJavaScriptAlerts()
	{
		clickButton(Alerts);
		clickButton(JSAlert);
		
	}
	
	
	public void OpenJavaScriptConfirmAlert()
	{
		clickButton(Alerts);
		clickButton(JSConfirmAlert);
		
	}

	public void OpenJavaScriptPromptAlert()
	{
		clickButton(Alerts);
		clickButton(JSPromptAlert);
		
	}
	
}
