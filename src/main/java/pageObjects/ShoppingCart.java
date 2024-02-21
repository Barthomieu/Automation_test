package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart  {
    public WebDriver driver;
    By promoCode = By.linkText("Have a promo code?");
    By promoTextBox = By.cssSelector("input[name='discount_name']");
    By submitPromoCode = By.cssSelector("form[method='post']  span");
    By proceedToCheckout = By.linkText("PROCEED TO CHECKOUT");
    By deleteItemOne = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
    By deleteItemTwo = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
    By totalAmount  = By.cssSelector(".cart-total .value");

    public ShoppingCart( WebDriver driver){
        this.driver = driver;
    }

    public WebElement getPromoCode(){return driver.findElement(promoCode);}
    public WebElement getPromoTextCode(){return driver.findElement(promoTextBox);}
    public WebElement getSubmitPromoCode(){return driver.findElement(submitPromoCode);}
    public WebElement getProceedToCheckout(){return driver.findElement(proceedToCheckout);}
    public WebElement getDeleteItemOne(){return driver.findElement(deleteItemOne);}
    public WebElement getDeleteItemTwo(){return driver.findElement(deleteItemTwo);}
    public WebElement getTotalAmount(){return driver.findElement(totalAmount);}

}
