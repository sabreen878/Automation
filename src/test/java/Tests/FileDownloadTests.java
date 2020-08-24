package Tests;

import org.testng.annotations.Test;

import pages.FileDownloadPage;

public class FileDownloadTests extends TestBase
{

	FileDownloadPage fileDownloadObject;
	
	@Test
	public void downloadFileTest()
	{
		fileDownloadObject = new FileDownloadPage(driver);
		fileDownloadObject.OpenFileDownloadPage();
	}
}
