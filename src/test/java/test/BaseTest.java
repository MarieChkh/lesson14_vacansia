package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.AttachmentsUtils;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static java.lang.System.getProperty;

public class BaseTest {

    @BeforeAll
    static void setupConfig() {
        Configuration.baseUrl = "https://ifellow.ru/";
        Configuration.browser = getProperty("browser", "chrome");
        Configuration.browserSize = getProperty("browserSize", "1920x1080");
        Configuration.browserVersion = getProperty("browserVersion", "128");
        Configuration.remote = System.getProperty("remoteUrl");
        if (Configuration.remote != null) {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                        "enableVNC", true,
                        "enableVideo", true
                ));
                Configuration.browserCapabilities = capabilities;
            }
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        AttachmentsUtils.screenshotAs("Screenshot");
        AttachmentsUtils.pageSource();
        AttachmentsUtils.browserConsoleLogs();
        if (Configuration.remote != null) {
            AttachmentsUtils.addVideo();
        }
        closeWebDriver();
    }
}
