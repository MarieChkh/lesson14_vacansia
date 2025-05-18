<a href="https://spasibosberbank.ru/"><img src="media/logo/logo.3bbb7572.png" width="175" height="52"></a>

<h1 >Демопроект по автоматизации тестирования для <a href="https://ifellow.ru/">iFellow</a></h1>

## ☑️ Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins) и из терминала
- Allure-отчет
- Уведомление в Telegram о результатах прогона тестов
- Видео пример прохождения тестов


<a id="tools"></a>
## :ballot_box_with_check:Технологии и инструменты:

| Java                                                                                                           | IntelliJ  <br>  Idea                                                                                         | GitHub                                                                                               | JUnit 5                                                                                                           | Gradle                                                                                                           | Selenide                                                                                                         | Selenoid                                                                                                                  | Allure <br> Report                                                                                                         |  Jenkins                                                                                                        |   Telegram
|:---------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| <a href="https://www.java.com/"><img src="media/Java.svg" width="50" height="50"  alt="Java"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="media/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="media/Github.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="media/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="media/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="media/Selenide.svg" width="50" height="50"  alt="Selenide"/></a> | <a href="https://aerokube.com/selenoid/"><img src="media/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a> | <a href="https://github.com/allure-framework"><img src="media/Allure.svg" width="50" height="50"  alt="Allure"/></a> |<a href="https://www.jenkins.io/"><img src="media/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://web.telegram.org/"><img src="media/Telegram.svg" width="50" height="50" alt="Telegram"/></a> |<a href="https://qameta.io/"><img src="images\logo\Allure_TO.svg" width="50" height="50" alt="Allure_TO"/></a> |

<a id="cases"></a>
## :ballot_box_with_check:Реализованные проверки:

- Проверка заголовка главной страницы
- В разделе меню 'О компании' проверяем наличие заголовка
- В разделе меню 'Продукты' проверяем наличие заголовка
- В разделе меню 'Карьера' проверяем наличие заголовка
- В разделе меню 'Партнеры' проверяем наличие заголовка

## <img alt="Jenkins" height="25" src="media/Jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Students/job/18-lom14-betcity/)


<p align="center">  
<img src="media/screen/Jenkins.png" alt="Jenkins" width="950"/></a>  
</p>


## :ballot_box_with_check: Параметры сборки в Jenkins:

- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 127.0)
- browserSize (размер окна браузера, по умолчанию 1920x1080)


## Команды для запуска из терминала

Локальный запуск:
```bash  
gradle clean ifellow_test
```
Запуск с параметрами:
```bash  
-Dbrowser=chrome -DbrowserVersion=127.0 -DbrowserSize=1920x1080
```
Удаленный запуск через Jenkins:
```bash  
clean
ifellow_test
-Dbrowser=${BROWSER}
-Dbrowser_version=${BROWSER_VERSION}
-Dbrowser_size=${BROWSER_SIZE}
-Dbrowser_remote="https://user1:1234@${BROWSER_REMOTE}/wd/hub"
```

## <img alt="Allure" height="25" src="media/Allure.svg" width="25"/></a>  <a name="Allure"></a>Allure Report	</a>


## Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="media/screen/Allure.png" width="850">  
</p>  

## Тест-кейсы

<p align="center">  
<img title="Allure Tests" src="media/screen/AllureTests.png" width="850">  
</p>
____

## <img alt="Allure" height="25" src="media/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="media/screen/Telegram.png" width="550">  
</p>

____
## <img alt="Selenoid" height="25" src="media/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Selenoid
____
<p align="center">
<img title="SelenoidVideo" src="media/screen/gif/SelenoidVideo.gif" width="550" height="350"  alt="video">   
</p>