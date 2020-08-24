package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MultipleWindowsPage;

public class MultipleWindowsTests extends TestBase{

	MultipleWindowsPage multiWindowsObject;
	
	@Test
	public void multipleWindowsTests() throws InterruptedException
	{
		multiWindowsObject = new MultipleWindowsPage(driver);
		multiWindowsObject.OpenMultipleWindowsPage();
		try {
			
			multiWindowsObject.windowHandle();
			
		} 
		
		catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
}
