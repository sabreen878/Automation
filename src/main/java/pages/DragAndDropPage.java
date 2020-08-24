package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends PageBase{

	public DragAndDropPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Drag and Drop")
	WebElement dragAndDropLink;
	
	@FindBy(id = "column-a")
	public WebElement draged;
	
	@FindBy(id = "column-b")
	public WebElement dropped;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/h3")
	public WebElement dragAndDropMessage;
	
	public void OpenDragAndDropLink()
	{
	clickButton(dragAndDropLink);	
	}
}
