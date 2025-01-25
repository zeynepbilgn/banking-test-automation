package steps;

import com.thoughtworks.gauge.Step;
import driver.DriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Tag;
import pages.TransferPage;

@Slf4j
public class TransferStep {

    TransferPage transferPage = new TransferPage(DriverManager.getDriver());

    @Step("Kullanıcı Account Sayfasındaki Transfer Money Butonuna tıklar")
    @Tag("smoke")
    @Description("Kullanıcı Transfer Money butonuna tıklar ve transfer işlemi başlatılır.")
    public void openLoginPage() {
        log.info("Click transfer money button...");
        Allure.step("Click transfer money button...");
        transferPage.clickTransferMoneyButton();
        log.info("Transfer Money button success");
        Allure.step("Transfer Money button success");
    }

    @Step("Kullanıcı Transfer Money bilgilerini girer, sender: <sender>, receiver: <receiver>, amount: <amount>")
    @Tag("smoke")
    @Description("Kullanıcı transfer bilgilerini girer: Gönderen, Alıcı ve Miktar bilgileri giriliyor.")
    public void enterTransferMoneyInformation(String sender, String receiver, String amount) {
        log.info("enter transfer money information for sender:{}, receiver {} and amount {}", sender, receiver, amount);
        Allure.step("enter transfer money information for - Sender: " + sender + ", Receiver: " + receiver + ", Amount: " + amount);

        transferPage.enterTransferInformation(sender, receiver, amount);

        log.info("Enter Transfer information successfully.");
        Allure.step("Enter Transfer information successfully.");
    }

    @Step("Kullanıcı Transferi gerçekleştirir")
    @Tag("smoke")
    @Description("Kullanıcı transfer işlemini tamamlar.")
    public void sendMoney() {
        log.info("Send money process...");
        Allure.step("Send money process...");

        transferPage.clickSendMoneyButton();

        log.info("Send money process successfully...");
        Allure.step("Send money process successfully..");
    }

    @Step("Transferin dogru oldugu kontrol edilir")
    @Tag("smoke")
    @Description("Transfer işleminin doğru gerçekleştiği kontrol edilir.")
    public void checkMoneyTransfer() {
        log.info("Checking transfer money correctness...");
        Allure.step("Checking transfer money correctness...");

        transferPage.checkMoneyTransfer();

        log.info("Money transfer is correct.");
        Allure.step("Money transfer is correct.");
    }

    @Step("Kullanıcı Add Money butonuna tıklar")
    @Tag("smoke")
    @Description("Kullanıcı Add Money butonuna tıklar.")
    public void clickAddMoneyButton() {
        log.info("Click add money button...");
        Allure.step("Click add money button...");

        transferPage.clickAddMoneyButton();

        log.info("Click Add Money button successfully.");
        Allure.step("Click Add Money button successfully.");
    }

    @Step("Kullanıcı Add butonuna tıklar ve hesabına para yukler")
    @Tag("smoke")
    @Description("Kullanıcı Add butonuna tıklayarak hesabına para yükler.")
    public void clickAddMoneyToAccount() {
        log.info("Click add money to account...");
        Allure.step("Click add money to account...");

        transferPage.clickAddMoneyToAccount();

        log.info("Add Money process successfully.");
        Allure.step("Add Money process successfully.");
    }

    @Step("Kullanıcı Add Money bilgilerini girer," +
            " cardNum: <cardNum>, cardHolder: <cardHolder>, expiryDate: <expiry>, cvv: <cvv>, amount: <amount>")
    @Tag("smoke")
    @Description("Kullanıcı kredi kartı bilgilerini ve miktarı girerek para yükleme işlemi gerçekleştirir.")
    public void sendKeyAddMoneyInformation(String cardNum, String cardHolder, String expiry, String cvv, String amount) {
        log.info("Enter add money information for cardNum: {}", cardNum);
        Allure.step("Enter add money information for cardNum: " + cardNum);

        transferPage.sendKeyAddMoneyInformation(cardNum, cardHolder, expiry, cvv, amount);

        log.info("Enter Add Money information successfully");
        Allure.step("Enter Add Money information successfully");
    }

    @Step("Para eklemenın dogru oldugu kontrol edilir")
    @Tag("smoke")
    @Description("Para ekleme işleminin doğru olduğu kontrol edilir.")
    public void checkAddMoneyToAccount() {
        log.info("Checking add money correctness...");
        Allure.step("Checking add money correctness...");

        transferPage.checkAddMoneyToAccount();

        log.info("Checking add money correctness");
        Allure.step("Checking add money correctness");
    }
}
