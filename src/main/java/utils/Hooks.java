package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Hooks {
    WebDriver driver;
    Properties properties;
    @Before
    public void before() {
        properties = ConfigReader.initialize_Properties();
        String browser = properties.getProperty("browser");
        driver = DriverFactory.initialize_Driver(browser);
    }

    @After
    public void after() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
