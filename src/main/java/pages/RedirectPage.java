package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedirectPage extends PageBase{

	public RedirectPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Redirect Link")
	WebElement redirectLink;

	@FindBy(id = "redirect")
	WebElement hereRedirect;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/ul/li[1]/a")
	WebElement statusCode200;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/h3")
	public WebElement statusCodesParagraph ;
	
	public void OpenRedirectLinkPage() throws InterruptedException
	{
		clickButton(redirectLink);
		Thread.sleep(2000);
		clickButton(hereRedirect);
		Thread.sleep(2000);
		clickButton(statusCode200);
		Thread.sleep(2000);

	}

}
