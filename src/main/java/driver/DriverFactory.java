package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigLoader;

public class DriverFactory {

    public static WebDriver createDriver() {

        WebDriver driver;
        String browser = ConfigLoader.getConfig().browser();
        System.out.println(browser);

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else {
            throw new RuntimeException("Browser not supported: " + browser);
        }

        driver.manage().window().maximize();
        return driver;
    }
}
