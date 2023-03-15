package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

//All the available element in homepage are located here
public class HomePage extends TestBase{
	
	//using PageFactory annotation method to find webelement
	@FindBy(name="searchbar")
	WebElement searchBox;
	
	@FindBy(id = "button-search")
	WebElement srchBtn;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	@FindBy(id="signup")
	WebElement signupBtn;
	
	@FindBy(id="cart")
	WebElement viewCartBtn;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public SearchResultPage searchItem(String item)
	{
		searchBox.sendKeys(item);
		srchBtn.click();
		return new SearchResultPage();
		
	}
	
}
