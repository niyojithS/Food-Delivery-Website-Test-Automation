package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPayPage {
	 WebDriver driver;
	    WebDriverWait wait;

		public CartPayPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        PageFactory.initElements(driver, this);
	    }
		
		@FindBy(xpath = "//div[@class='cart-icon-and-total']")
		WebElement Addtocart;
		
		@FindBy(xpath = "//input[@placeholder='promo code']")
		WebElement PromoCode;
		
		@FindBy(xpath = "//button[text()='Submit']")
		WebElement submit;
		
		@FindBy(xpath = "//button[@class='proceed-to-checkout-button']")
		WebElement proceedtocheckout;
		
		@FindBy(xpath = "//button[@class='add-new-address-button']")
		WebElement Addnewaddress;
		
		@FindBy(name = "firstName")
		WebElement Firstname;
		
		@FindBy(name = "lastName")
		WebElement Lastname;
		
		@FindBy(name = "phone")
		WebElement Phone;
		
		@FindBy(name = "street")
		WebElement Street;
		
		@FindBy(name = "streetNumber")
		WebElement Streetnumber;
		
		@FindBy(name = "buildingNumber")
		WebElement Buildingnumber;
		
		@FindBy(name = "city")
		WebElement City;
		
		@FindBy(xpath = "(//div[@class='payment-option '])[1]")
		WebElement Paymentmethod;
		
		@FindBy(xpath = "//button[@class='place-order-button']")
		WebElement Placeorder;
		
		@FindBy(xpath = "//span[@class='my-orders-text']")
		WebElement Myorder;
		
		public void AddToCart() {
			Addtocart.click();	
		}
		
		public void Promocode(String promocode) {
			PromoCode.click();
			PromoCode.sendKeys(promocode);
			submit.click();
			proceedtocheckout.click();
		}

		public void GiveAdress(String firstname, String lastname, String phone, String street, String streetnumber,
				String buildingnumber, String city) {
			Addnewaddress.click();	
			Firstname.click();
			Firstname.sendKeys(firstname);
			Lastname.click();
			Lastname.sendKeys(lastname);
			Phone.click();
			Phone.sendKeys(phone);
			Street.click();
			Street.sendKeys(street);
			Streetnumber.click();
			Streetnumber.sendKeys(streetnumber);
			Buildingnumber.click();
			Buildingnumber.sendKeys(buildingnumber);
			City.click();
			City.sendKeys(city);
			
		}
		
		public void PaymentMethodClickplaceorder() {
			Paymentmethod.click();	
			Placeorder.click();
		}
		
		public void MyorderPage() {
			Myorder.click();	
		}

}
