package pages;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.HelperMethod;

public class LoginPage {

    @FindBy(css = "input[placeholder=\"Username\"]")
    private WebElement usernameField;

    @FindBy(css = "input[placeholder=\"Password\"]")
    private WebElement passwordField;

    @FindBy(css = "div[tabindex=\"0\"]")
    private WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public void openLoginPage() {
        DriverManager.getDriver().get("https://catchylabs-webclient.testinium.com");
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        HelperMethod.clickElement(DriverManager.getDriver(), loginButton, 10);
    }
}
