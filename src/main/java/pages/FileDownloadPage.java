package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileDownloadPage extends PageBase{

	public FileDownloadPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "File Download")
	WebElement fileDoenloadLink;
	
	@FindBy(linkText = "text.txt")
	WebElement fileText;
	
	
	public void OpenFileDownloadPage()
	{
		clickButton(fileDoenloadLink);
		clickButton(fileText);
	}
}
