package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ElementHelper;

import java.time.Duration;

public class ProductPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    //Locators

    private final By addToCartButtonLocator = By.id("add-to-cart-button");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public void addToTheCart() {
        elementHelper.click(addToCartButtonLocator);
    }

}
