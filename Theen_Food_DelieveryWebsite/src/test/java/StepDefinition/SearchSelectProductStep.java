package StepDefinition;

import Base.BaseClass;
import Pages.LoginPage;
import Pages.SearchSelectProduct;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSelectProductStep extends BaseClass {
	
SearchSelectProduct searchproduct;
	
	@Before
	public void BeforeScenario() {
		setupSuite();
		searchproduct = new SearchSelectProduct(driver);	
	}

@Given("User searches for {string}, clicks {string} and adds the item to the cart")
public void user_searches_for_food_item_and_adds_to_cart(String searchItem, String productName) throws InterruptedException {
    searchproduct.SearchProduct(searchItem, productName);
}

@Then("item should be visible in the cart")
public void the_item_should_be_visible_in_the_car() {
	searchproduct.AddtoCartPage();
}

}
