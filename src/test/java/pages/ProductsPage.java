package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ElementHelper;

import java.time.Duration;

public class ProductsPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    //Locators

    private final By amazonFilterLocator = By.cssSelector(".s-navigation-icon-text > .a-size-base");
    private final By appleFilterLocator = By.cssSelector("[aria-label='Apple'] .a-size-base");
    private final By firstProductLocator = By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//div[@class='a-section aok-relative s-image-square-aspect']");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public void filterForShippedByAmazon() {
        elementHelper.click(amazonFilterLocator);
    }

    public void filterForApple() {
        elementHelper.click(appleFilterLocator);
    }

    public void clickTheFirstProduct() {
        elementHelper.click(firstProductLocator);
    }
}
