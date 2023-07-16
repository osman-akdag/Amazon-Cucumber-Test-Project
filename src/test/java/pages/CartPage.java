package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.ElementHelper;

import java.time.Duration;

public class CartPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    //Locators

    private final By addedProductLocator = By.cssSelector(".a-spacing-base.a-unordered-list > li:nth-of-type(2)");


    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkIfTheProductIsInTheCart() {
        Assert.assertTrue(elementHelper.isDisplayed(addedProductLocator));
    }
}
