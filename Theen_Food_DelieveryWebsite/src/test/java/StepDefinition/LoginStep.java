package StepDefinition;

import org.junit.Test;

import com.aventstack.extentreports.Status;

import Base.BaseClass;
import Pages.LoginPage;
import Pages.SignUpPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass{
	
	LoginPage loginPage;
	
	@Before
	public void BeforeScenario() {
		setupSuite();
		loginPage = new LoginPage(driver);	
	}
	
	@Test
	public void loginTest() {
		test = extent.createTest("Login Test");
		test.log(Status.INFO, "Navigating to login page");

		driver.get("https://your-login-url.com");

		// Your steps...

		test.log(Status.PASS, "Login test passed");
	}

	
	@Given("user clicks on signin button")
	public void user_clicks_on_signin_button() {
		driver.get("https://food-delivery-application-ma.vercel.app/");
		loginPage.ClickLoginBtn();
		//loginPage.ClickLoginBtn();
		//loginPage.Logout();
	}

	@When("user enters {string}, and confirms {string}")
	public void user_enters_and_confirms(String email, String password) {
		loginPage.LoginUserDetails(email, password);
	}

	@When("user clicks on Login Button")
	public void user_clicks_on_login_button() {
		loginPage.Login();
	}
}
