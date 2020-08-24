package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RedirectPage;

public class RedirectTests extends TestBase{

	RedirectPage redirectObject;
	
	
	@Test
	public void RedirectTest() throws InterruptedException
	{
		redirectObject = new RedirectPage(driver);
		redirectObject.OpenRedirectLinkPage();
		Assert.assertTrue(redirectObject.statusCodesParagraph.getText().contains("Status Codes"));
		
	}
}
