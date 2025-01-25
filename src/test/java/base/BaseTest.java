package base;

import driver.DriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void setUp() {
        DriverManager.getDriver().manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
