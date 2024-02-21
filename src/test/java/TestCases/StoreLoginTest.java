package TestCases;

import pageObjects.TestStoreLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class StoreLoginTest {
    @Test
    public void login()  {

        System.setProperty("webdriver.gecko.driver", "C:/Testy_automatyczne/WebDrivers/geckodriver.exe");;
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");

        TestStoreLoginPage logPage = new TestStoreLoginPage(driver);
        logPage.getEmail().sendKeys("test@test.com");
        logPage.getPassword().sendKeys("test123");
        logPage.getLoginBtn().click();

        }
    }

