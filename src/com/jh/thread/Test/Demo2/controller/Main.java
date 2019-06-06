package com.jh.thread.Test.Demo2.controller;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        /*ExecutorService pool = Executors.newFixedThreadPool(2);

        Thread th1 = new ThreadDemo();
        Thread th2 = new ThreadDemo();
        Thread th3 = new ThreadDemo();
        Thread th4 = new ThreadDemo();
        //将线程放入池中进行执行
        pool.execute(th1);
        pool.execute(th2);
        pool.execute(th3);
        pool.execute(th4);
        //关闭线程池
        pool.shutdown();*/

        ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(1);
        pool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("========");
            }
        },1000,5000, TimeUnit.MILLISECONDS);

        pool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(System.nanoTime());
            }
        },100,2000,TimeUnit.MILLISECONDS);

    }

}
