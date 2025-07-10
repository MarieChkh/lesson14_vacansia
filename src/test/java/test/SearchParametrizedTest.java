package test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class SearchParametrizedTest extends BaseTest {


    @ParameterizedTest(name = "Проверка поиска вакансий: {0}")
    @ValueSource(strings = {"QA Engineer", "Data Engineer"})
    void searchParametrisedVacansieTest(String valueParametrized) {
        open("/");
        $("[data-path=\"search\"]").click();
        $("[name=\"q\"]").setValue(valueParametrized).pressEnter();
        $(byText("Engineer")).click();
    }
}
