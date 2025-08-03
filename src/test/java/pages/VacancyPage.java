package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class VacancyPage {

    private SelenideElement otklick = $("[data-path=\"vacancy\"]");
    public void checkVacancyQA(String expectedvacancyText) {
            $("h1").shouldHave(text(expectedvacancyText));
        }

    public void otklick() {otklick.click();
    }

}
