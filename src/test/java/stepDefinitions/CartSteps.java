package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.ProductsPage;
import utils.DriverFactory;

public class CartSteps {
    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    ProductsPage productsPage = new ProductsPage(driver);
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);

    @Given("User is on homePage")
    public void userIsOnHomePage() {
        homePage.userIsOnHomePage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        homePage.clickAcceptCookies();
    }

    @And("Click the search field")
    public void clickTheSearchField() {
        homePage.clickTheSearchField();
    }

    @And("Enter product name")
    public void enterProductName() {
        homePage.enterProductName();
    }

    @And("Click the search button")
    public void clickTheSearchButton() {
        homePage.clickTheSearchButton();
    }

    @And("Filter for shipped by Amazon")
    public void filterForShippedByAmazon() {
        productsPage.filterForShippedByAmazon();
    }

    @And("Filter for Apple")
    public void filterForApple() {
        productsPage.filterForApple();
    }

    @And("Click the first product")
    public void clickTheFirstProduct() {
        productsPage.clickTheFirstProduct();
    }

    @And("Add to the cart")
    public void addToTheCart() {
        productPage.addToTheCart();
    }

    @And("Go to the cart")
    public void goToTheCart() {
        homePage.goToTheCart();
    }

    @Then("Check if the product is in the cart")
    public void checkIfTheProductIsInTheCart() {
        cartPage.checkIfTheProductIsInTheCart();
    }
}
