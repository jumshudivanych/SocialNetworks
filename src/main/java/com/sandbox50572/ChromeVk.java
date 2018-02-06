package com.sandbox50572;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ChromeVk implements Runnable{

    private static org.openqa.selenium.chrome.ChromeDriver driver;
    private static String url;//url загружаемои страницы
    private static String name;
    private String login;
    private String password;

    //конструктор
    public ChromeVk(String name, String url) {
        this.name = name;
        this.url = url;
        this.login = login;
        this.password = password;
    }

    public void run() {

        //TODO ЗАПУСК Chrome
        System.setProperty("webdriver.chrome.driver","C:/idea/chromedriver.exe");
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.manage().window().maximize();
        //неявное ожидание действует всякий раз при поиске элемента
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Заходим на страницу google
        driver.get(url);
        //TODO Автооризация в аккаунте google
        //находим элемент воити
        WebElement autorization = driver.findElementById("gb_70");
        //жмем на кнопку
        autorization.click();
        //находим поле login
        WebElement loginField = driver.findElementById("identifierId");
        //вводим E-mail
        loginField.sendKeys("jumshudivanych@gmail.com");
        //жмем кнопку Далее
        WebElement cont = driver.findElementByClassName("CwaK9");
        cont.click();
        //находим поле пароль
        WebElement passField = driver.findElementByName("password");
        //вводим пароль
        passField.sendKeys("1234cani");
        //находим и жмем кнопку
        WebElement cont2 = driver.findElementByClassName("CwaK9");
        cont2.click();
        //TODO Вход на ВК
        driver.get("https://www.vk.com");
        //Авторизация
        WebElement loginF = driver.findElementById("index_email");
        loginF.sendKeys("89042840876");
        WebElement passF = driver.findElementById("index_pass");
        passF.sendKeys("1234cani");
        WebElement buttonCom = driver.findElementById("index_login_button");
        buttonCom.click();

        //переход в Messenger
        //driver.get("https://www.facebook.com/messages/t/100012940356613");
        //находим поле чат
       // WebElement chat = driver.findElementByClassName("_1mf _1mj");
        //вводим сообщение
        //chat.sendKeys("Привет Андрей!!!");
        //chat.sendKeys(Keys.ENTER);

    }
}
