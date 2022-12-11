package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ValidateToggleCheckPage;
import util.BrowserFactory;

public class ValidateToggleCheckTest {

	WebDriver driver;

	@Test
	public void ClickAllCheckBoxes() {
		driver = BrowserFactory.init();
		ValidateToggleCheckPage validateToggleCheckPage = PageFactory.initElements(driver, ValidateToggleCheckPage.class);
		validateToggleCheckPage.clickToggleAllElement();
		BrowserFactory.tearDown();
	}
	
	@Test
	public void clickRemoveSingleCheckBox() {
		 driver= BrowserFactory.init();
		 ValidateToggleCheckPage validateToggleCheckPage = PageFactory.initElements(driver, ValidateToggleCheckPage.class);
		 validateToggleCheckPage.clickRemoveButton();
		 BrowserFactory.tearDown();
		 
	}
	@Test
	public void removeAllButton() {
		driver = BrowserFactory.init();
		ValidateToggleCheckPage validateToggleCheckPage = PageFactory.initElements(driver, ValidateToggleCheckPage.class);
       validateToggleCheckPage.removeAll();;
		BrowserFactory.tearDown();
		
	}
	
	
	
}
