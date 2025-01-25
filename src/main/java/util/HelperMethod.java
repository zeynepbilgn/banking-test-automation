package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelperMethod {

    public static void waitForElementToBeVisible(WebDriver driver, WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void clickElement(WebDriver driver, WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public static void sendKeys(String key, WebDriver driver, WebElement element, int timeout) {
        waitForElementToBeVisible(driver, element, timeout);
        element.sendKeys(key);
    }

    public static String extractAmount(String actualText) {
        String[] lines = actualText.split("Amount:");
        if (lines.length > 1) {
            return lines[1].trim();
        } else {
            throw new IllegalArgumentException("Amount bilgisi bulunamadı.");
        }
    }
}
