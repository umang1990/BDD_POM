package stepDefs;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ItemDetailPage;
import pages.SearchResultPage;
import pages.ShoppingCart_checkOut;

public class OrderStepDef extends TestBase{
	
	
	HomePage homePage;
	SearchResultPage resultPage; 
	ItemDetailPage detailsPage;
	ShoppingCart_checkOut sopingCart;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		initialize();
	}
	@When("User search an item {string}")
	public void user_search_an_item(String item) {
	   homePage = new HomePage();
	   resultPage = homePage.searchItem(item);
		
	}
	
	
	@Given("Item must be displayed")
	public void item_must_be_displayed() {
	    resultPage = new SearchResultPage();
		boolean isdisp = resultPage.isItemDisplayed();
	    Assert.assertTrue(isdisp);
	    resultPage.selectItem();
	}
	@When("User Add Item to Cart")
	public void user_add_item_to_cart() {
	   detailsPage= new ItemDetailPage();
	   detailsPage.addItemtoCart();
	}
	@Then("Item must be listed in cart")
	public void item_must_be_listed_in_cart() {
	    sopingCart = new ShoppingCart_checkOut();
	    sopingCart.checkoutbutton();
	}
	
	
	
}
