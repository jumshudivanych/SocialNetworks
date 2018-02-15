package com.sandbox50572;

public class Coordinator implements Runnable {

    //конструктор
    public Coordinator() {

    }
    public void run() {

        //TODO Вход в Ок
        //создание объекта
        Runnable chromeOk = new com.sandbox50572.ChromeOk("ChromeOk", "https://www.google.ru");
        //создание дочернего потока
        Thread threadNext = new Thread(chromeOk);
        //стартуем новыи поток
        threadNext.start();

        //Пауза
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //TODO Входим в ВК
        Runnable chromeVk = new com.sandbox50572.ChromeVk("MyVk", "https://www.google.ru");
        Thread threadVk = new Thread(chromeVk);
        threadVk.start();

        //Пауза
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //TODO Входим в facebook
        Runnable chromeFace = new com.sandbox50572.ChromeFace("MyFacebook", "https://www.google.ru");
        Thread threadFacebook = new Thread(chromeFace);
        threadFacebook.start();


        /*
        //цикл запускающии Chrome в новых потоках
        for(int i=0; i<2; i++) {
            //создание объекта
            Runnable chromeDriver1 = new com.sandbox50572.ChromeDriver("ChromeDriver" + i, "https://www.google.ru");
            //создание дочернего потока
            Thread threadNext = new Thread(chromeDriver1);
            //стартуем новыи поток
            threadNext.start();

            //TODO Разобраться с syncronized методами !!!
            //try {
                //засыпаем
            //    threadNext.wait(120000);
            //} catch (InterruptedException e) {
            //    e.printStackTrace();
            //}

            //пауза между созданием потоков
            //try {
            //    Thread.sleep(180000);
            //} catch (InterruptedException e) {
             //   e.printStackTrace();
            //}
            System.out.println(i);
        }

        */

    }
}
