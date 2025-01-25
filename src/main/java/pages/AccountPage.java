package pages;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.HelperMethod;

public class AccountPage {

    @FindBy(css = "#root div.css-175oi2r.r-1i3z66q.r-tuq35u")
    private WebElement accountOverviewHeader;

    @FindBy(css = "#root div.r-13awgt0 > div[class*='r-1777fci']:nth-of-type(2)")
    private WebElement openMoneyTransfer;

    @FindBy(xpath = "//div[contains(text(), 'My account')]")
    private WebElement myAccount;

    @FindBy(xpath = "//div[contains(text(), 'Transactions')]")
    private WebElement transactions;

    @FindBy(xpath = "//div[contains(text(), 'Transfer money')]")
    private WebElement transferMoney;

    @FindBy(xpath = "//div[contains(text(), 'Add money')]")
    private WebElement addMoney;

    public AccountPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public boolean isAccountOverviewPageDisplayed() {
        try {
            HelperMethod.waitForElementToBeVisible(DriverManager.getDriver(), accountOverviewHeader, 10);
            return accountOverviewHeader.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isAccountDetailPageDisplayed() {
        try {
            HelperMethod.waitForElementToBeVisible(DriverManager.getDriver(), myAccount, 10);
            HelperMethod.waitForElementToBeVisible(DriverManager.getDriver(), transactions, 10);
            HelperMethod.waitForElementToBeVisible(DriverManager.getDriver(), transferMoney, 10);
            HelperMethod.waitForElementToBeVisible(DriverManager.getDriver(), addMoney, 10);
            return myAccount.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickOpenMoneyTransferButton() {
        HelperMethod.clickElement(DriverManager.getDriver(), openMoneyTransfer, 10);
    }
}
