package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class VacancyPage {

        public void checkVacancyQA(String expectedvacancyText) {
            $("h1").shouldHave(text(expectedvacancyText));
        }

    public void otklick() {
        $("[data-path=\"vacancy\"]").click();
    }

}
