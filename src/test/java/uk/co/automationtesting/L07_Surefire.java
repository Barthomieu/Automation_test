package uk.co.automationtesting;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class L07_Surefire {
    WebDriver driver;

    @Test
    public void testng(){

        Assert.assertEquals("demo", "demo");
    }

}
