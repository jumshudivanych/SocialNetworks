package com.sandbox50572;

public class Coordinator implements Runnable {

    //конструктор
    public Coordinator() {

    }
    public void run() {

        //TODO Входим в facebook
        Runnable chromeFace = new com.sandbox50572.ChromeFace("MyFacebook", "https://www.google.ru");
        Thread threadFacebook = new Thread(chromeFace);
        threadFacebook.start();
        /*
        //цикл запускающии Chrome в новых потоках
        for(int i=0; i<100; i++) {
            //создание объекта
            Runnable chromeDriver1 = new com.sandbox50572.ChromeDriver("ChromeDriver" + i, "https://www.google.ru");
            //создание дочернего потока
            Thread threadNext = new Thread(chromeDriver1);
            //стартуем новыи поток
            threadNext.start();

            //пауза между созданием потоков
            try {
                Thread.sleep(180000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println(i);
        }
        */

    }
}
