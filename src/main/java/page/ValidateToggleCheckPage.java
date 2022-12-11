package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidateToggleCheckPage {

	WebDriver driver;

	public  void validateToggleCheck(WebDriver driver) {
		this.driver = driver;
	
	}

	@FindBy(how = How.XPATH,using = "//input[@name='allbox']")
	WebElement toggleAllElement;
	
	@FindBy(how = How.XPATH, using = "//input[@name='todo[3]']")
	WebElement singleCheckBox;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	List<WebElement> allCheckboxes;
	
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	WebElement removeButton;

	public void clickToggleAllElement() {

		toggleAllElement.click();
		
		for(int i=0 ; i < allCheckboxes.size() ; i++ ) {	
			System.out.println(i + " checkbox" + allCheckboxes.get(i).getText());
			Assert.assertTrue(allCheckboxes.get(i).isSelected());
		}
	}

	public void clicksingleCkeckBox() {
		singleCheckBox.click();
	}
	
	public void clickRemoveButton() {
		if(allCheckboxes !=null
				&& allCheckboxes.size()>1) { 
			int initialSize = allCheckboxes.size();
			//System.out.println("initialSize size of checkboxes on page : " + allCheckboxes.size());
			//System.out.println("Deleting " + (allCheckboxes.size()-1) + " th index checkbox");
			allCheckboxes.get(allCheckboxes.size()-2).click();
			removeButton.click();
			//System.out.println("After delete allCheckboxes size : " + allCheckboxes.size());
			Assert.assertTrue(allCheckboxes.size()== (initialSize-1));
			
		}else {
			Assert.assertTrue(allCheckboxes.size()==1);
		}
	}
	
	public void removeAll() {
		 clickToggleAllElement();
		 removeButton.click();
		 Assert.assertTrue("Size of checkBox is 1", allCheckboxes.size()==1);
		 
		
	}
}
