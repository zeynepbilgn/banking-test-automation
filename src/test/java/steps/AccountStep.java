package steps;

import com.thoughtworks.gauge.Step;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Tag;
import pages.AccountPage;

@Slf4j
public class AccountStep {

    AccountPage accountPage = new AccountPage();

    @Step("Kullanıcı hesap overview sayfasında olduğunu doğrular")
    @Tag("smoke")
    @Description("Kullanıcı hesap overview sayfasında olduğunu doğrular.")
    public void verifyAccountOverviewPage() {
        log.info("Verify account overview page...");
        Allure.step("Hesap overview sayfasının görüntülendiği kontrol ediliyor...");

        boolean isDisplayed = accountPage.isAccountOverviewPageDisplayed();
        if (isDisplayed) {
            log.info("Hesap overview sayfası başarıyla görüntülendi.");
            Allure.step("Hesap overview sayfası başarıyla görüntülendi.");
        } else {
            String errorMessage = "Hesap overview sayfası görüntülenemedi!";
            log.error(errorMessage);
            Allure.addAttachment("Hata", errorMessage);
            throw new AssertionError(errorMessage);
        }
    }

    @Step("Kullanıcı hesap detay sayfasında olduğunu doğrular")
    @Tag("smoke")
    @Description("Kullanıcı hesap detay sayfasında olduğunu doğrular.")
    public void verifyAccountDetailPage() {
        log.info("Verify account detail page...");
        Allure.step("Hesap detay sayfasının görüntülendiği kontrol ediliyor...");

        boolean isDisplayed = accountPage.isAccountDetailPageDisplayed();
        if (isDisplayed) {
            log.info("Hesap detay sayfası başarıyla görüntülendi.");
            Allure.step("Hesap detay sayfası başarıyla görüntülendi.");
        } else {
            String errorMessage = "Hesap detay sayfası görüntülenemedi!";
            log.error(errorMessage);
            Allure.addAttachment("Hata", errorMessage);
            throw new AssertionError(errorMessage);
        }
    }

    @Step("Kullanıcı Account sayfasına gider")
    @Tag("smoke")
    @Description("Kullanıcı para transferi yapmak için Account sayfasına gider.")
    public void clickOpenMoneyTransferButton() {
        log.info("Click open money transfer button...");
        Allure.step("Para transferi yapmak için Account sayfasına gidiliyor...");

        accountPage.clickOpenMoneyTransferButton();

        log.info("Account sayfasına başarıyla gidildi.");
        Allure.step("Account sayfasına başarıyla gidildi.");
    }
}
