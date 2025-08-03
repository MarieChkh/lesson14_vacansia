package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private SelenideElement aboutPage = $("a[href='/about/']");
    private SelenideElement productsPage = $("a[href='/products/']");
    private SelenideElement carrerPage = $("a[href='/career/']");
    private SelenideElement partnersPage = $("a[href='/partners/']");
    private SelenideElement searchData = $("[data-path=\"search\"]");
    private SelenideElement nameData = $("[name=\"q\"]");

    public void openMainPage() {
        open("/");
    }

    public void goToAboutPage() { aboutPage.click();
    }

    public void goToProductsPage() { productsPage.click();
    }

    public void goToCarrerPage() { carrerPage.click();
    }

    public void goToPartnersPage() {partnersPage.click();
    }

    public void checkTitle(String expectedTitle) {
        title().equals(expectedTitle);
    }
    public void poiskEnter() { searchData.click();}
    public void poiskSet() { nameData.setValue("qa engineer").pressEnter();}
    public void poiskClick() { $(byText("Engineer")).click();
    }

}
