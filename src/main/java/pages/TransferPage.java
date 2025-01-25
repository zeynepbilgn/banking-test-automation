package pages;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.HelperMethod;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransferPage {

    @FindBy(css = "#root > div > div.css-175oi2r.r-13awgt0 > div:nth-child(2) > div.css-175oi2r.r-13awgt0 > div > div > div > div.css-175oi2r.r-1awozwy.r-1fvujvx.r-18u37iz.r-tzz3ar.r-1cmwbt1.r-1777fci.r-tuq35u > div:nth-child(1) > div")
    private WebElement transferMoney;

    @FindBy(css = "body > div:nth-child(6) > div > div.css-175oi2r > div > div > div > div > div.css-175oi2r.r-1awozwy.r-13awgt0.r-1777fci.r-nsbfu8.r-13qz1uu > div.css-175oi2r.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-agouwx.r-1pi2tsx.r-13qz1uu > div > div:nth-child(3) > select")
    private WebElement senderDropDown;

    @FindBy(css = "body > div:nth-child(6) > div > div.css-175oi2r > div > div > div > div > div.css-175oi2r.r-1awozwy.r-13awgt0.r-1777fci.r-nsbfu8.r-13qz1uu > div.css-175oi2r.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-agouwx.r-1pi2tsx.r-13qz1uu > div > div:nth-child(7) > select")
    private WebElement receiverDropDown;

    @FindBy(css = "body > div:nth-child(6) > div > div.css-175oi2r > div > div > div > div > div.css-175oi2r.r-1awozwy.r-13awgt0.r-1777fci.r-nsbfu8.r-13qz1uu > div.css-175oi2r.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-agouwx.r-1pi2tsx.r-13qz1uu > div > div:nth-child(11) > input")
    private WebElement amountDropDown;

    @FindBy(css = "body > div:nth-child(6) > div > div.css-175oi2r > div > div > div > div > div.css-175oi2r.r-1awozwy.r-13awgt0.r-1777fci.r-nsbfu8.r-13qz1uu > div.css-175oi2r.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-agouwx.r-1pi2tsx.r-13qz1uu > div > div.css-175oi2r.r-1i6wzkk.r-lrvibr.r-1loqt21.r-1otgn73.r-1awozwy.r-169ebfh.r-z2wwpe.r-h3s6tt.r-1777fci.r-tsynxw.r-13qz1uu > div")
    private WebElement sendMoney;

    @FindBy(css = "#root > div > div.css-175oi2r.r-13awgt0 > div:nth-child(2) > div.css-175oi2r.r-13awgt0 > div > div > div > div.css-175oi2r.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-agouwx > div > div")
    private List<WebElement> transactions;

    @FindBy(css = "#root > div > div.css-175oi2r.r-13awgt0 > div:nth-child(2) > div.css-175oi2r.r-13awgt0 > div > div > div > div.css-175oi2r.r-1awozwy.r-1fvujvx.r-18u37iz.r-tzz3ar.r-1cmwbt1.r-1777fci.r-tuq35u > div:nth-child(2) > div")
    private WebElement addMoneyButton;

    @FindBy(css = "body > div:nth-child(6) > div > div.css-175oi2r > div > div > div > div > div.css-175oi2r.r-1awozwy.r-13awgt0.r-1777fci.r-nsbfu8.r-13qz1uu > div.css-175oi2r.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-agouwx.r-1pi2tsx.r-13qz1uu > div > div:nth-child(2) > input")
    private WebElement cardNumber;

    @FindBy(css = "body > div:nth-child(6) > div > div.css-175oi2r > div > div > div > div > div.css-175oi2r.r-1awozwy.r-13awgt0.r-1777fci.r-nsbfu8.r-13qz1uu > div.css-175oi2r.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-agouwx.r-1pi2tsx.r-13qz1uu > div > div:nth-child(4) > input")
    private WebElement holder;

    @FindBy(css = "body > div:nth-child(6) > div > div.css-175oi2r > div > div > div > div > div.css-175oi2r.r-1awozwy.r-13awgt0.r-1777fci.r-nsbfu8.r-13qz1uu > div.css-175oi2r.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-agouwx.r-1pi2tsx.r-13qz1uu > div > div:nth-child(6) > div:nth-child(1) > div > input")
    private WebElement expiryDate;

    @FindBy(css = "body > div:nth-child(6) > div > div.css-175oi2r > div > div > div > div > div.css-175oi2r.r-1awozwy.r-13awgt0.r-1777fci.r-nsbfu8.r-13qz1uu > div.css-175oi2r.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-agouwx.r-1pi2tsx.r-13qz1uu > div > div:nth-child(6) > div:nth-child(2) > div > input")
    private WebElement cvvNumber;

    @FindBy(css = "body > div:nth-child(6) > div > div.css-175oi2r > div > div > div > div > div.css-175oi2r.r-1awozwy.r-13awgt0.r-1777fci.r-nsbfu8.r-13qz1uu > div.css-175oi2r.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-agouwx.r-1pi2tsx.r-13qz1uu > div > div:nth-child(8) > input")
    private WebElement amountAddMoney;

    @FindBy(css = "body > div:nth-child(6) > div > div.css-175oi2r > div > div > div > div > div.css-175oi2r.r-1awozwy.r-13awgt0.r-1777fci.r-nsbfu8.r-13qz1uu > div.css-175oi2r.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-agouwx.r-1pi2tsx.r-13qz1uu > div > div.css-175oi2r.r-1i6wzkk.r-lrvibr.r-1loqt21.r-1otgn73.r-1awozwy.r-169ebfh.r-z2wwpe.r-h3s6tt.r-1777fci.r-tsynxw.r-13qz1uu > div")
    private WebElement addMoneyAccount;

    public TransferPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickTransferMoneyButton() {
        HelperMethod.clickElement(DriverManager.getDriver(), transferMoney, 10);
    }

    public void clickSendMoneyButton() {
        HelperMethod.clickElement(DriverManager.getDriver(), sendMoney, 10);
    }

    public void enterTransferInformation(String sender, String receiver, String amount) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(senderDropDown));
        Select selectSenderDropDown = new Select(senderDropDown);
        Select selectReceiverDropDown = new Select(receiverDropDown);
        assertEquals(selectSenderDropDown.getFirstSelectedOption().getText(), sender, "sender is not same");
        assertEquals(selectReceiverDropDown.getFirstSelectedOption().getText(), receiver, "receiver is not same");
        amountDropDown.sendKeys(amount);
    }

    public void checkMoneyTransfer() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(transactions));
        String transaction = transactions.stream()
                .findFirst()
                .map(WebElement::getText)
                .orElseThrow(() -> new RuntimeException("empty list"));

        String amount = HelperMethod.extractAmount(transaction);
        assertEquals(amount, "110.00", "transaction amount is not same");
    }

    public void clickAddMoneyButton() {
        HelperMethod.clickElement(DriverManager.getDriver(), addMoneyButton, 10);
    }

    public void sendKeyAddMoneyInformation(String cardNum, String cardHolder, String expiry, String cvv, String amount) {
        HelperMethod.sendKeys(cardNum, DriverManager.getDriver(), cardNumber, 10);
        HelperMethod.sendKeys(cardHolder, DriverManager.getDriver(), holder, 10);
        HelperMethod.sendKeys(expiry, DriverManager.getDriver(), expiryDate, 10);
        HelperMethod.sendKeys(cvv, DriverManager.getDriver(), cvvNumber, 10);
        HelperMethod.sendKeys(amount, DriverManager.getDriver(), amountAddMoney, 10);
    }

    public void clickAddMoneyToAccount() {
        HelperMethod.clickElement(DriverManager.getDriver(), addMoneyAccount, 10);
    }

    public void checkAddMoneyToAccount(){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(transactions));
        String transaction = transactions.stream()
                .findFirst()
                .map(WebElement::getText)
                .orElseThrow(() -> new RuntimeException("empty list"));

        String amount = HelperMethod.extractAmount(transaction);
        assertEquals(amount, "10.00", "transaction amount is not same");
    }
}
