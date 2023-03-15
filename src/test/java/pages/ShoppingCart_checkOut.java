package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ShoppingCart_checkOut extends TestBase {
		
	@FindBy(css ="div.cart ul")
	WebElement cartItem;
	
	@FindBy(id ="billing-coupon")
	WebElement couponChk;
	
	@FindBy(id ="coupon")
	WebElement couponTxt;
	
	@FindBy(xpath="//button[contains(text(),'Apply')]")
	WebElement applyBtn ;
	
	@FindBy(xpath="//button[contains(text(),'Check')]")
	WebElement chkoutBtn ;
	
	@FindBy(xpath="//button[contains(text(),'Empty')]")
	WebElement emptyBtn ;
	
	public ShoppingCart_checkOut()
	{
		PageFactory.initElements(driver,this);
	}
	public void checkoutbutton()
	{
		if(cartItem.isDisplayed())
		{
			chkoutBtn.click();
		}
		
	}
}


