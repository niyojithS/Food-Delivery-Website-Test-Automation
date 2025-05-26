package Pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchSelectProduct {
WebDriver driver;
WebDriverWait wait;
	
	public SearchSelectProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	}
	
	@FindBy(css = "input[placeholder='BBQ, Rolls, Pasta']")
	WebElement Searchbox;
	
	@FindBy(xpath = "//b[@class='add-to-cart']")
	WebElement AddtoCart;
	
	@FindBy(css = ".food-item-name")
	List<WebElement> FoodList;
	
	@FindBy(xpath = "//div[@class='cart-icon-and-total']")
	WebElement CartPage;
	
	public void SearchProduct(String SearchItem, String ProductItem) throws InterruptedException {
		Thread.sleep(2000);
		       Searchbox.sendKeys(SearchItem);
		      WebElement FoodName = FoodList.stream().filter
		    		  (Productitem -> Productitem.getText().equalsIgnoreCase(ProductItem)).findFirst().orElse(null);
		      Thread.sleep(2000);
		      for (int i = 0; i < FoodList.size(); i++) {
		            if (FoodList.get(i).getText().equalsIgnoreCase(ProductItem)) {
		            	Thread.sleep(2000);
		                AddtoCart.click();
		                break;
		            }
		        } 
		    }
public void AddtoCartPage() {
	CartPage.click();
}
}
