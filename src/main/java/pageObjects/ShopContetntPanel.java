package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopContetntPanel {

    public WebDriver driver;
    By continueShoppingBtn = By.cssSelector(".btn.btn-secondary");
    By checkoutBtn = By.linkText("\uE876PROCEED TO CHECKOUT");

    public ShopContetntPanel(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getContinueShoppingBtn(){
        return driver.findElement(continueShoppingBtn);
    }
    public WebElement getcheckoutBtn(){
        return driver.findElement(checkoutBtn);
    }
}
