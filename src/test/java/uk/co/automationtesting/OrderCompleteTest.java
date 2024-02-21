package uk.co.automationtesting;

import base.BasePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;

public class OrderCompleteTest extends BasePage {
    public OrderCompleteTest() throws IOException {
    }

    @BeforeTest
    public void setup() throws IOException, InterruptedException {
        driver  = getDriver();
        driver.get(getUrl());
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver = null;
    }

    @Test(description = "Create and complete order and confirm")
    public void endToEndTest() throws InterruptedException, IOException {
        HomePage home = new HomePage(driver);
        home.getCookie().click();
        home.getToggle().click();
        home.getTestStoreLink().click();

        ShopHomePage shopHome = new ShopHomePage(driver);
        shopHome.getProdOne().click();

        ShopProductPage shopProduct = new ShopProductPage(driver);
        Select option = new Select(shopProduct.getSizeOption());
        option.selectByVisibleText("M");
        shopProduct.getQuantIncrease().click();
        shopProduct.getAddToCartBtn().click();

        Thread.sleep(5000);

        ShopContetntPanel scp = new ShopContetntPanel(driver);
        scp.getcheckoutBtn().click();

        ShoppingCart cart = new ShoppingCart(driver);
        cart.getPromoCode().click();
        cart.getPromoTextCode().sendKeys("20OFF");
        cart.getSubmitPromoCode().click();
        cart.getProceedToCheckout().click();

        // creating an object of the order personal information page
        OrderFormPersInfo pInfo = new OrderFormPersInfo(driver);
        pInfo.getGenderMr().click();
        pInfo.getFirstNameField().sendKeys("John");
        pInfo.getLastnameField().sendKeys("Smith");
        pInfo.getEmailField().sendKeys("johnsmith@test.com");
        pInfo.getTermsConditionsCheckbox().click();
        pInfo.getContinueBtn().click();

        // creating an object of the order delivery info page
        OrderFormDelivery orderDelivery = new OrderFormDelivery(driver);
        orderDelivery.getAddressField().sendKeys("123 Main Street");
        orderDelivery.getCityField().sendKeys("Houston");
        Select state = new Select(orderDelivery.getStateDropdown());
        state.selectByVisibleText("Texas");
        orderDelivery.getPostcodeField().sendKeys("77021");
        orderDelivery.getContinueBtn().click();

        // creating an object of the shipping method page
        OrderFormShippingMethod shipMethod = new OrderFormShippingMethod(driver);
        shipMethod.getDeliveryMsgTextbox().sendKeys("If I am not in, please leave my delivery on my porch.");
        shipMethod.getContinueBtn().click();

        // creating an object of the payment options page
        OrderFormPayment orderPay = new OrderFormPayment(driver);
        orderPay.getPayByCheckRadioBtn().click();
        orderPay.getTermsConditionsCheckbox().click();
        orderPay.getOrderBtn().click();


    }


}
