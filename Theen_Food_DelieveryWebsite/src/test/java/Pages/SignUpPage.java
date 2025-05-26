package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	WebDriver driver;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='sign-in-button']")
	WebElement signinbtn;
	
	@FindBy(xpath="//span[text()='Click here']")
	WebElement clickhere;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement yourname;
	
	@FindBy(name = "email")
	WebElement youremail;
	
	@FindBy(name = "password")
	WebElement yourpassword;

	@FindBy(xpath="//button[@type='submit']")
	WebElement createaccount;

	public void ClickSignInBtn() {
		signinbtn.click();
	}
    
    public void EnterUserDetails(String Yourname, String Youremail, String password) {
    	clickhere.click();
    	yourname.sendKeys(Yourname);
    	youremail.sendKeys(Youremail);
    	yourpassword.sendKeys(password);
    }
    public void CreateAccountButton() {
    	createaccount.click();
    }
}