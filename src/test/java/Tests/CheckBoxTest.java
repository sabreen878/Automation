package Tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.CheckBoxesPage;

public class CheckBoxTest extends TestBase{

	CheckBoxesPage checkBoxObj;
	
	@Test
	public void checkTest() throws InterruptedException
	{
		checkBoxObj= new CheckBoxesPage(driver);
		checkBoxObj.clickOnCheckBox();
		Assert.assertTrue(checkBoxObj.checkBoxMessage.getText().contains("Checkboxes"));
		Assert.assertFalse(checkBoxObj.checkBox2.isSelected());
		Assert.assertTrue(checkBoxObj.checkBox1.isSelected());
	}
}
