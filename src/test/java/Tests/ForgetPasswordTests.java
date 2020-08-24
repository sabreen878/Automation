package Tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JSONDataReader;
import pages.ForgetPasswordPage;

public class ForgetPasswordTests extends TestBase{

	ForgetPasswordPage forgetPasswordObject;
	
	@Test
	public void forgetPasswordTest() throws FileNotFoundException, IOException, ParseException, InterruptedException
	{
		forgetPasswordObject = new ForgetPasswordPage(driver);
		JSONDataReader jsonReader = new JSONDataReader();
		jsonReader.jsonReader();
		forgetPasswordObject.OpenForgetPasswordPage();
		forgetPasswordObject.SetForgetPasswordEmail(jsonReader.email);
		Assert.assertTrue(forgetPasswordObject.forgetPasswordMessage.getText().contains("Your e-mail's been sent!"));
		Thread.sleep(3000);

	}
}
