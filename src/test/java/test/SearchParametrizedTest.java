package test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.*;
import static io.qameta.allure.Allure.step;

public class SearchParametrizedTest extends BaseTest {
    MainPage mainPage = new MainPage();
    @ParameterizedTest(name = "Проверка поиска вакансий: {0}")
    @ValueSource(strings = {"QA Engineer", "Data Engineer"})
    void searchParametrisedVacansieTest(String valueParametrized) {

        step("Открыть главную страницу", () -> mainPage.openMainPage());
        step("Нажать на кнопку поиска", () -> mainPage.poiskEnter());
        step("Заполнение поиска", () -> mainPage.poiskSet());
        step("Поиск вакансии qa engineer", () -> mainPage.poiskClick());
    }
}
