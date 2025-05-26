package StepDefinition;

import Base.BaseClass;
import Pages.CartPayPage;
import Pages.MenuPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPayStep extends BaseClass{
	
	CartPayPage cartpaypage;

    @Before
    public void setUpScenario() {
        setupSuite();
        cartpaypage = new CartPayPage(driver);
    }
	
	
	@Given("the user has added items to the cart")
	public void the_user_has_added_items_to_the_cart() {
		cartpaypage.AddToCart();
	}

	@When("the user applies promo code {string}")
	public void the_user_applies_promo_code(String promocode) {
		cartpaypage.Promocode(promocode);
	}

	@When("the user enters the address with first name {string}, last name {string}, phone {string}, street {string}, street number {string}, building number {string}, city {string}")
	public void the_user_enters_the_address_with_first_name_last_name_phone_street_street_number_building_number_city(String firstname, String lastname, String phone, String street, String streetnumber, String buildingnumber, String city) {
		cartpaypage.GiveAdress(firstname, lastname, phone, street, streetnumber, buildingnumber, city);
	}

	@When("the user selects the payment method and places the order")
	public void the_user_selects_the_payment_method_and_places_the_order() {
		cartpaypage.PaymentMethodClickplaceorder();
	}

	@Then("the order placed successfully message displayed and Track your order")
	public void the_order_placed_successfully_message_displayed_and_Track_your_order() {
		cartpaypage.MyorderPage();
	}

}
