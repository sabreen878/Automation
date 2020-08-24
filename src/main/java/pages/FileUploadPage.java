package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends PageBase{

	public FileUploadPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "File Upload")
	WebElement fileUploadLink;
	
	@FindBy(id = "file-upload")
	WebElement uploadFile;
	
	String imageName = "02.jpg";
	String imgPath = System.getProperty("user.dir")+"\\uploads\\"+ imageName;
	
	@FindBy(id = "file-submit")
	WebElement UploadBTN;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/h3")
	public WebElement uploadedMessage;
	
	
	
	public void OpenUploadFileLink()
	{
		
	clickButton(fileUploadLink);	
	WebElement fileUploader = uploadFile;
	fileUploader.sendKeys(imgPath);
	clickButton(UploadBTN);
	
	}
	
	public void UploadFileWithAnotherWay() throws AWTException, InterruptedException
	{
		clickButton(fileUploadLink);
		//clickButton(uploadFile);
		//CTRL + C COPY IMAGEPATH
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(imgPath);
		System.out.println(imgPath);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, null);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
		
		//CTRL + V PAST IMAGE
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		clickButton(UploadBTN);
	}
}
