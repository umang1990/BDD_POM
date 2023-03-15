package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
public class SearchResultPage extends TestBase {
	
	@FindBy(css= "ul li.preview")
	WebElement item;
	
	public SearchResultPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void selectItem()
	{
		item.click();
	}
	public boolean isItemDisplayed()
	{
		return item.isDisplayed();
	}
}
