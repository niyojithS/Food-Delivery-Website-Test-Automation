package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {

    WebDriver driver;
    WebDriverWait wait;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[text()='Menu']")
    WebElement menuButton;
    
    @FindBy(xpath = "//div[@class='cart-icon-and-total']")
    WebElement cartPage;

    @FindBy(css = ".menu-list-item")
    List<WebElement> menuItems;

    @FindBy(css = ".food-item-name")
    List<WebElement> foodItems;

    @FindBy(css = ".add-to-cart")
    List<WebElement> addToCartButtons;


    public void clickMenuButton() {
        wait.until(ExpectedConditions.elementToBeClickable(menuButton)).click();
    }
    

    public void selectMenuItemAndAddFoodToCart(String menuItemName, String foodItemName) {
        clickMenuButton();

        wait.until(ExpectedConditions.visibilityOfAllElements(menuItems));

        WebElement selectedMenuItem = menuItems.stream()
            .filter(item -> item.getText().trim().equalsIgnoreCase(menuItemName))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Menu item '" + menuItemName + "' not found"));


        wait.until(ExpectedConditions.elementToBeClickable(selectedMenuItem)).click();

        wait.until(ExpectedConditions.visibilityOfAllElements(foodItems));
        wait.until(ExpectedConditions.visibilityOfAllElements(addToCartButtons));

        boolean isItemFound = false;

        for (int i = 0; i < foodItems.size(); i++) {
            if (foodItems.get(i).getText().trim().equalsIgnoreCase(foodItemName)) {
                isItemFound = true;
                WebElement addToCartBtn = addToCartButtons.get(i);
                wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
                break;
            }
        }

        if (!isItemFound) {
            throw new RuntimeException("Food item '" + foodItemName + "' not found under menu '" + menuItemName + "'");
        }
    }

}
