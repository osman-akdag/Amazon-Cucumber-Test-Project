package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ElementHelper;

import java.time.Duration;


public class HomePage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    //Locators

    private final By acceptCookiesLocator = By.id("sp-cc-accept");
    private final By searchBoxLocator = By.id("twotabsearchtextbox");
    private final By searchButtonLocator = By.id("nav-search-submit-button");
    private final By cartLocator = By.id("nav-cart");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public void userIsOnHomePage() {

    }

    public void clickAcceptCookies() {
        elementHelper.click(acceptCookiesLocator);
    }


    public void clickTheSearchField() {
        elementHelper.click(searchBoxLocator);
    }

    public void enterProductName() {
        elementHelper.sendKey(searchBoxLocator, "iphone");
    }

    public void clickTheSearchButton() {
        elementHelper.click(searchButtonLocator);
    }

    public void goToTheCart() {
        elementHelper.click(cartLocator);
    }
}
