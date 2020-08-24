package pages;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleWindowsPage extends PageBase{

	public MultipleWindowsPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(linkText = "Multiple Windows")
	WebElement multipleWindowsLink;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/a")
	WebElement newWIndowClickHereLink;
	

	
	public void OpenMultipleWindowsPage()
	{

		clickButton(multipleWindowsLink);
		
	}
	
	
	
	public void windowHandle() throws InterruptedException
	{
		clickButton(newWIndowClickHereLink);
		Thread.sleep(2000);
		
		String CurrentWindowID = driver.getWindowHandle();

		//Store window handle for the current window
		
		for(String windowID : driver.getWindowHandles())
		{
			String title = driver.switchTo().window(windowID).getTitle();
			
			if(title.equals("New Window"))
			{
				assertEquals("New Window", driver.getTitle());
				
				//Write any code to handle the Internet page
				driver.close();
				break;
			}
			
		}
		
		driver.switchTo().window(CurrentWindowID);
	
	}
	

}
