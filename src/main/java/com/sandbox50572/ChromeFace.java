package com.sandbox50572;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ChromeFace implements Runnable {
    private static org.openqa.selenium.chrome.ChromeDriver driver;
    private static String url;//url загружаемои страницы
    private static String name;
    private String login;
    private String password;

    public ChromeFace(String name, String url) {
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
        driver.get("https://www.facebook.com");
        //Авторизация
        WebElement loginField = driver.findElementById("email");
        loginField.sendKeys("jumshudivanych@gmail.com");
        WebElement passField = driver.findElementById("pass");
        passField.sendKeys("1234cani");
        WebElement buttonCom = driver.findElementById("u_0_2");
        buttonCom.click();

        //переход в Messenger
        driver.get("https://www.facebook.com/messages/t/100012940356613");
        //находим поле чат
        WebElement chat = driver.findElementByClassName("_1mf _1mj");
        //вводим сообщение
        chat.sendKeys("Привет Андрей!!!");
        chat.sendKeys(Keys.ENTER);
    }
}
