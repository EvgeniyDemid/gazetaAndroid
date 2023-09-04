<h1 >Проект по автоматизации тестирования мобильного приложения Gazeta.Ru</h1>

![GZ.jpg](images/logo/GZ.jpg)

## Содержание 

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Реализованные проверки</a>

* <a href="#console">Запуск тестов из терминала</a>

* <a href="#allure">Allure Report отчеты</a>

## Технологии и инструменты

| Java                                                                                                     | IntelliJ Idea                                                                                                                 | Android Studio                                                                                                                              | GitHub                                                                                                    | JUnit 5                                                                                                           | Gradle                                                                                                     | Selenide                                                                                                         |  Jenkins                                                                                                           |  Appium                                                                                                                      |
|:---------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------------------------------|
| <a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a> | <a id ="tech" href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://developer.android.com/studio"><img src="images/logo/Android-studio.svg" width="50" height="50"  alt="Android Studio"/></a> | <a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>| <a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a> |   <a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://appium.io/"><img src="images/logo/Appium.svg" width="50" height="50"  alt="Appium"/></a>              |


|Allure                                                                                                                         |                                                                                                                                                       
|:------------------------------------------------------------------------------------------------------------------------------|
|<a href="https://github.com/allure-framework"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>     | 


<a id="cases"></a>
##  Реализованные проверки

-  Проверить элементы главного меню
-  Проверить главный экран
-  Проверить элементы футтера
-  Переход на страницу политики

<a id="console"></a>
##  Запуск тестов из терминала
### Локальный запуск тестов

```
gradle clean test 
```

<a id="allure"></a>
## <img src="media/logo/Allure.svg" width="25" height="25"/></a> 

### Основное окно

<p align="center">
<img title="Allure Dashboard" src="images/screen/AllureReport.png">
</p>

### Тесты

<p align="center">
<img title="Allure Tests" src="images/screen/AllureCase.png">
</p>

