package com.sandbox50572;

/**
 * Авторизация в соцсетях
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //создание объекта coordinator
        Runnable coordinator1 = new Coordinator();
        //создание потока
        Thread threadCoordinator = new Thread(coordinator1);
        //стартуем поток coordinator
        threadCoordinator.start();

        System.out.println( "Метод main завершен." );
    }
}
