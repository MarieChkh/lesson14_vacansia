package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CarrerPage {
    public void checkPageHeader(String expectedHeaderText) {
        $("h1").shouldHave(text(expectedHeaderText));
    }

}
