package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='sign-in-button']")
	WebElement SignupBtn;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Pass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Loginbtn;
	
	public void ClickLoginBtn() {
		SignupBtn.click();
	}
	public void LoginUserDetails(String email, String password) {
		Email.sendKeys(email);
		Pass.sendKeys(password);
	}
	
	public void Login() {
		Loginbtn.click();
	}
}
