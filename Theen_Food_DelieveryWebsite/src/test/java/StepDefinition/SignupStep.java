package StepDefinition;

import Base.BaseClass;
import Pages.SignUpPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupStep extends BaseClass{
	
	SignUpPage signUpPage;
	
	@Before
	public void BeforeScenario() {
		setupSuite();
		signUpPage = new SignUpPage(driver);	
	}
	
	@Given("user is on the Home page and clicks SignUp button")
	public void the_user_is_on_the_home_page() {
		driver.get("https://food-delivery-application-ma.vercel.app/");
		signUpPage.ClickSignInBtn();
	}

	@When("user clicks on Click here and enters {string} {string} and confirms {string}")
	public void the_user_enters_and_confirms(String Yourname, String Youremail, String password) {
		signUpPage.EnterUserDetails(Yourname, Youremail, password);
	}

	@Then("user clicks on the Create Account button")
	public void the_user_clicks_on_the_create_account_button() {
		signUpPage.CreateAccountButton();
	}

}
