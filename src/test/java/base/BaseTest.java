package base;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigLoader;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod

    public void setUp() {
        driver = DriverFactory.createDriver();
        driver.get(ConfigLoader.getConfig().url());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
