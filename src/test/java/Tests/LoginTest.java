package Tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JSONDataReader;
import data.JSONDataReader1;
import pages.LoginPage;

public class LoginTest extends TestBase{
	
	LoginPage loginObject;
	
	@Test(priority = 1)
	private void UserLoginSuccessfully() throws FileNotFoundException, IOException, ParseException, InterruptedException
	
	{

		JSONDataReader jsonReader = new JSONDataReader();
		jsonReader.jsonReader();
		
		loginObject=new LoginPage(driver);
		loginObject.clickLoginLink();
		loginObject.setLoginCredencials(jsonReader.username, jsonReader.password);
		Assert.assertTrue(loginObject.loginMessage.getText().contains("You logged into a secure area!"));
		Thread.sleep(3000);

	}

	
	@Test(dependsOnMethods = {"UserLoginSuccessfully"})
	public void UserCanLogoutSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.clickLogoutLink();
		
		Assert.assertTrue(loginObject.loginMessage.getText().contains("You logged out of the secure area!"));
		Thread.sleep(3000);
	}
	
	
	@Test(dependsOnMethods = {"UserCanLogoutSuccessfully"})
	public void UserLoginFauilure() throws FileNotFoundException, IOException, ParseException, InterruptedException
	{
		JSONDataReader1 jsonReader1 = new JSONDataReader1();
		jsonReader1.jsonReader1();
		
		loginObject=new LoginPage(driver);
		loginObject.setLoginCredencials(jsonReader1.username, jsonReader1.password);
		Assert.assertTrue(loginObject.loginMessage.getText().contains("Your password is invalid!"));

	}
}
