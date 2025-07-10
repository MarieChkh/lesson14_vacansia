package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

public class PrimaryTests extends BaseTest {

    MainPage mainPage = new MainPage();
    AboutCompanyPage aboutCompanyPage = new AboutCompanyPage();
    CarrerPage carrerPage = new CarrerPage();
    PartnersPage partnersPage = new PartnersPage();
    ProductsPage productsPage = new ProductsPage();
    VacancyPage vacancyPage = new VacancyPage();

    @Test
    @DisplayName("Проверка заголовка страницы")
    void checkPageTitleTest() {
        step("Открыть главную страницу", () -> mainPage.openMainPage());
        step("Проверить заголовок <title>", () -> mainPage.checkTitle("Компания по разработке ПО, заказная разработка программных продуктов в Москве - iFellow"));
    }

    @Test
    @DisplayName("Переход в раздел 'О компании'")
    void goToAboutPageTest() {
        step("Открыть главную страницу", () -> mainPage.openMainPage());
        step("Нажать на пункт меню 'О компании'", () -> mainPage.goToAboutPage());
        step("Проверить заголовок страницы 'О компании'", () -> aboutCompanyPage.checkPageHeader("О компании"));
    }

    @Test
    @DisplayName("Переход в раздел 'Продукты'")
    void goToTeamPageTest() {
        step("Открыть главную страницу", () -> mainPage.openMainPage());
        step("Нажать на пункт меню 'Продукты'", () -> mainPage.goToProductsPage());
        step("Проверить заголовок страницы 'Продукты'", () -> productsPage.checkPageHeader("Продукты"));
    }

    @Test
    @DisplayName("Переход в раздел 'Карьера'")
    void goToProjectsPageTest() {
        step("Открыть главную страницу", () -> mainPage.openMainPage());
        step("Нажать на пункт меню 'Карьера'", () -> mainPage.goToCarrerPage());
        step("Проверить заголовок страницы 'Карьера'", () -> carrerPage.checkPageHeader("Карьера"));
    }

    @Test
    @DisplayName("Переход в раздел 'Партнеры'")
    void goToContactsPageTest() {
        step("Открыть главную страницу", () -> mainPage.openMainPage());
        step("Нажать на пункт меню 'Партнеры'", () -> mainPage.goToPartnersPage());
        step("Проверить заголовок страницы 'Партнеры'", () -> partnersPage.checkPageHeader("Партнеры"));
    }
    @Test
    @DisplayName("Поиск вакансии")
    void searchVacansieTest() {
        step("Открыть главную страницу", () -> mainPage.openMainPage());
        step("Нажать на кнопку поиска", () -> mainPage.poiskEnter());
        step("Заполнение поиска", () -> mainPage.poiskSet());
        step("Поиск вакансии qa engineer", () -> mainPage.poiskClick());
        step("Проверить заголовок страницы 'Вакансия'", () -> vacancyPage.checkVacancyQA("QA Engineer"));
        step("Отклик на вакансию qa engineer", () -> vacancyPage.otklick());
    }
}
