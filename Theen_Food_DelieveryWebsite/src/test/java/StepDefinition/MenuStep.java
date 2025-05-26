package StepDefinition;

import Base.BaseClass;
import Pages.MenuPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.List;

import org.junit.Assert;

public class MenuStep extends BaseClass {

    MenuPage menuPage;

    @Before
    public void setUpScenario() {
        setupSuite();
        menuPage = new MenuPage(driver);
    }

    @Given("User clicks the menu to view the available items")
    public void user_clicks_the_menu_to_view_the_available_items() throws InterruptedException {
        menuPage.clickMenuButton();
    }


    @When("User selects {string}, clicks {string}, and adds it to the cart")
    public void user_selects_and_adds_the_following_food_items_to_the_cart(String menuItem, String foodItems) throws InterruptedException {
        menuPage.selectMenuItemAndAddFoodToCart(menuItem, foodItems);
    }

}

