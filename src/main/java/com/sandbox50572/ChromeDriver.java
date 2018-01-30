package com.sandbox50572;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ChromeDriver implements Runnable {

    private static org.openqa.selenium.chrome.ChromeDriver driver;
    private static String url;//url загружаемои страницы
    private static String name;
    private String login;
    private String password;

    public ChromeDriver(String name, String url) {
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

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //переход на саит
            driver.get("https://www.ok.ru");
            //авторизуемся в ОК
            WebElement loginF = driver.findElementByName("st.email");
            loginF.sendKeys("89046914386");
            WebElement passF = driver.findElementByName("st.password");
            passF.sendKeys("1234cani");
            //жмем ENTER
            passF.sendKeys(Keys.ENTER);

            //переход на oklive
            driver.get("https://www.ok.ru/video/liveApp");
            //переход на конкретное видео
            //driver.get("https://ok.ru/live/561967800182");

            //находим элемент чат
            //WebElement messageField = driver.findElementByXPath("//div[@data-placeholder='Написать сообщение']");
            //TODO формат запроса findElementByXPath("//тэг[@атрибут='значение']");
            //пишем сообщение
            //messageField.sendKeys("Привет");
            //messageField.sendKeys(Keys.ENTER);

            //Пауза
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //инициализация генератора случаиных чисел
            //Random random = new Random();
            //получение случайного числа
            // a = random.nextInt(6);
            //перевод в минуты
            //a = a * 60000;

            //вывод количества проиденных циклов
            // System.out.println(i);
            //System.out.println("Задержка равна " + a / 60000);

            //задержка
            // try {
            //    Thread.sleep(a);
            //} catch (InterruptedException e) {
            //    e.printStackTrace();
            //}




        /*
        //закрытие 4 вкладок
        for(int i=0; i<4; i++) {
            driver.quit();
            //TODO при закрытии автоматически не возвращает управление в оставшиеся открытыми
            driver.switchTo();//TODO ???
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        */
    }
}
