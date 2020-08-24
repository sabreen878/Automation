package Tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DragAndDropPage;

public class DragAndDropTest extends TestBase{
	
	DragAndDropPage DragAndDropObj;
	
	@Test
	public void DragAndDropTests()
	{
		
		DragAndDropObj = new DragAndDropPage(driver);
		DragAndDropObj.OpenDragAndDropLink();
		Actions builder = new Actions(driver);
		builder.dragAndDrop(DragAndDropObj.draged, DragAndDropObj.dropped).perform();
		Assert.assertTrue(DragAndDropObj.dragAndDropMessage.getText().contains("Drag and Drop"));
	}

}
