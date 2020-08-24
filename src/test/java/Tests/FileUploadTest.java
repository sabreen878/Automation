package Tests;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FileUploadPage;

public class FileUploadTest extends TestBase{

	FileUploadPage fileUploadObject;
	
	@Test
	public void UploadImage()
	{
		fileUploadObject = new FileUploadPage(driver);
		fileUploadObject.OpenUploadFileLink();
		Assert.assertTrue(fileUploadObject.uploadedMessage.getText().contains("File Uploaded!"));
	}
	
	
//	@Test 
//	public void UploadImage1() throws AWTException, InterruptedException
//	{
//		fileUploadObject = new FileUploadPage(driver);
//		fileUploadObject.UploadFileWithAnotherWay();
//		
//		Assert.assertTrue(fileUploadObject.uploadedMessage.getText().contains("File Uploaded!"));
//		
//	}
}
