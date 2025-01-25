package steps;

import com.thoughtworks.gauge.Step;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Tag;
import pages.AccountPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
public class LoginStep {

    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    @Step("Kullanıcı login sayfasını açar")
    @Tag("smoke")
    @Description("Kullanıcı login sayfasını başarılı bir şekilde açar")
    public void openLoginPage() {
        log.info("Login sayfası açılıyor...");
        Allure.step("Login sayfası açılıyor");

        loginPage.openLoginPage();

        log.info("Login sayfası başarıyla açıldı.");
        Allure.step("Login sayfası başarıyla açıldı");
    }

    @Step("Kullanıcı <username> ve <password> bilgileri ile giriş yapar")
    @Tag("smoke")
    @Description("Kullanıcı geçerli kimlik bilgileri ile giriş yapar")
    public void loginWithCredentials(String username, String password) {
        log.info("Kullanıcı giriş yapıyor - Kullanıcı adı: {}, Şifre: ******", username);
        Allure.step("Kullanıcı bilgileri giriliyor - Kullanıcı adı: " + username);

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        log.info("Kullanıcı giriş işlemi tamamlandı.");
        Allure.step("Kullanıcı giriş işlemi tamamlandı");
    }

    @Step("Kullanıcı hesap overview sayfasında olduğunu doğrular")
    @Tag("smoke")
    @Description("Kullanıcı hesap overview sayfasını başarılı bir şekilde doğrular")
    public void verifyAccountPage() {
        log.info("Hesap sayfasının görüntülendiği kontrol ediliyor...");
        Allure.step("Hesap sayfasının görüntülendiği kontrol ediliyor");

        boolean isDisplayed = accountPage.isAccountOverviewPageDisplayed();
        if (isDisplayed) {
            log.info("Hesap sayfası başarıyla görüntülendi.");
            Allure.step("Hesap sayfası başarıyla görüntülendi");
        } else {
            String errorMessage = "Hesap sayfası görüntülenemedi!";
            log.error(errorMessage);

            // Hata mesajını Allure raporuna ekliyoruz
            Allure.addAttachment("Hata", errorMessage);

            throw new AssertionError(errorMessage);
        }
        assertTrue(true, "Hesap sayfası görüntülenmedi!");
    }
}
