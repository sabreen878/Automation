package Tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import data.JSONDataReader;
import junit.framework.Assert;
import pages.AlertPage;

public final class AlertTests extends TestBase{

	AlertPage AlertObject;
	String AlertText;

	
	
//	@Test
//	public void JSAlertTest()
//	{
//		AlertObject = new AlertPage(driver);
//		AlertObject.OpenJavaScriptAlerts();
//		Alert alert=  driver.switchTo().alert();
//		AlertText = alert.getText();
//		Assert.assertEquals("I am a JS Alert", AlertText);
//		alert.accept();
//	}
	
	
//	@Test
//	public void JSConfirmAlertTest()
//	{
//		AlertObject = new AlertPage(driver);
//		AlertObject.OpenJavaScriptConfirmAlert();
//		Alert alert=  driver.switchTo().alert();
//		AlertText = alert.getText();
//		Assert.assertEquals("I am a JS Confirm", AlertText);
//		//alert.accept();
//		alert.dismiss();
//	}
	
	
	@Test
	public void JSPromptAlertTest() throws InterruptedException, FileNotFoundException, IOException, ParseException
	{
		JSONDataReader jsonReadertext = new JSONDataReader();
		jsonReadertext.jsonReadertext();
		
		AlertObject = new AlertPage(driver);
		AlertObject.OpenJavaScriptPromptAlert();
		Alert alert=  driver.switchTo().alert();
		alert.sendKeys(jsonReadertext.text);
		AlertText = alert.getText();
		Assert.assertEquals("I am a JS prompt", AlertText);
		Thread.sleep(3000);
		//alert.accept();
		alert.dismiss();
	}
}
