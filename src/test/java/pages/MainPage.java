package pages;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public void openMainPage() {
        open("/");
    }

    public void goToAboutPage() {
        $("a[href='/about/']").click();
    }

    public void goToProductsPage() {
        $("a[href='/products/']").click();
    }

    public void goToCarrerPage() {
        $("a[href='/career/']").click();
    }

    public void goToPartnersPage() {
        $("a[href='/partners/']").click();
    }

    public void checkTitle(String expectedTitle) {
        title().equals(expectedTitle);
    }
    public void poiskEnter() { $("[data-path=\"search\"]").click();}
    public void poiskSet() { $("[name=\"q\"]").setValue("qa engineer").pressEnter();}
    public void poiskClick() { $(byText("Engineer")).click();
    }

}
