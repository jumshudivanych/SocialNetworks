package com.sandbox50572;

public class Coordinator implements Runnable {

    //конструктор
    public Coordinator() {

    }
    public void run() {

        //цикл запускающии Chrome в новых потоках
        for(int i=1; i<3; i++) {
            //создание объекта
            Runnable chromeDriver1 = new com.sandbox50572.ChromeDriver("ChromeDriver" + i, "https://www.google.ru");
            //создание дочернего потока
            Thread threadNext = new Thread(chromeDriver1);
            //стартуем новыи поток
            threadNext.start();
        }

    }
}
