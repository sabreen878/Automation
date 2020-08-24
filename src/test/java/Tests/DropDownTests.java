package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DropDownPage;

public class DropDownTests extends TestBase{

	DropDownPage dropDownObject;
	
	@Test
	public void dropDownSelectionByVisibleText() throws InterruptedException
	{
		dropDownObject = new DropDownPage(driver);
		dropDownObject.OpenDropDownPage();
		
		WebElement options = driver.findElement(By.id("dropdown"));
		Select selectOptions = new Select(options);
		//Check if it is multi-select or not
		Assert.assertFalse(selectOptions.isMultiple());
		//Return the number of options in the dropdown menu
		Assert.assertEquals(3, selectOptions.getOptions().size());
		selectOptions.selectByVisibleText("Option 2");
		
		Thread.sleep(3000);
	}
	
	@Test(dependsOnMethods = {"dropDownSelectionByVisibleText"})
	public void dropDownSelectionByValue()
	{
		dropDownObject = new DropDownPage(driver);
		
		WebElement options = driver.findElement(By.id("dropdown"));
		Select selectOptions = new Select(options);
		//Check if it is multi-select or not
		Assert.assertFalse(selectOptions.isMultiple());
		//Return the number of options in the dropdown menu
		Assert.assertEquals(3, selectOptions.getOptions().size());		
		selectOptions.selectByValue("1");
		
	}
}
