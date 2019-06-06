package com.jh.thread.Test.Demo1.controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        RobtoMap rm = new RobtoMap();
        Thread th1 = new Thread(rm,"用户1");
        //th1.start();
        Thread th2 = new Thread(rm,"用户2");
        //th2.start();
        Thread th3 = new Thread(rm,"用户3");
        //th3.start();
        Thread th4 = new Thread(rm,"用户4");
        //th4.start();
        Thread th5 = new Thread(rm,"用户5");
        //th5.start();
        Thread th6 = new Thread(rm,"用户6");
        //th6.start();

        ExecutorService pool = Executors.newFixedThreadPool(6);
        pool.execute(th1);
        pool.execute(th2);
        pool.execute(th3);
        pool.execute(th4);
        pool.execute(th5);
        pool.execute(th6);
        pool.shutdown();




    }

}
