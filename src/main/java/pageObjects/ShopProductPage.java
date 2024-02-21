package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopProductPage {

	public WebDriver driver;
	
	By sizeOption = By.cssSelector("[data-product-attribute='1']");
	By colourWhite = By.cssSelector(".product-variants .input-container:nth-of-type(1) [type]");
	By getColourBlack = By.cssSelector("li:nth-of-type(2) > label > input[name='group[2]']");
	By quantityIncrease = By.cssSelector(".touchspin-up");
	By quantityDecrease = By.cssSelector(".touchspin-down");
	By addToCartBtn = By.cssSelector(".add-to-cart.btn.btn-primary");
	By homepageLink = By.xpath("//span[.='Home']");
	
	public ShopProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getColourWhite() {
		return driver.findElement(colourWhite);
	}

	public WebElement getSizeOption() {
		return driver.findElement(sizeOption);
	}
	
	public WebElement getQuantIncrease() {
		return driver.findElement(quantityIncrease);
	}

	public WebElement getQuantDecrease() {
		return driver.findElement(quantityDecrease);
	}
	
	public WebElement getAddToCartBtn() {
		return driver.findElement(addToCartBtn);
	}
	
	public WebElement getHomepageLink() {
		return driver.findElement(homepageLink);
	}
	
}
