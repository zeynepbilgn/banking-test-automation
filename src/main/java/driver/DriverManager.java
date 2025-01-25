package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;

public class DriverManager {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static String browser;

    static {
        try {
            Properties properties = new Properties();
            properties.load(DriverManager.class.getClassLoader().getResourceAsStream("config.properties"));

            browser = properties.getProperty("browser", "chrome").toLowerCase();
        } catch (Exception e) {
            e.printStackTrace();
            browser = "chrome";
        }
    }

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            WebDriver newDriver;
            switch (browser) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    newDriver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    newDriver = new EdgeDriver();
                    break;
                case "chrome":
                default:
                    WebDriverManager.chromedriver().setup();
                    newDriver = new ChromeDriver();
                    break;
            }

            newDriver.manage().window().maximize();
            driver.set(newDriver);
        }
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
