package com.jh.threadpool.controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class newCacheThreadPool {

    public static void main(String[] args) {

        //创建一个可缓存线程池
        /*ExecutorService pool = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++){

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("正在执行"+Thread.currentThread().getName()+"线程");
                }
            });

        }*/

        //创建一个可重用固定个数的线程池
        /*ExecutorService threadPool = Executors.newFixedThreadPool(3);
        for (int j = 0;j < 10; j++){
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("线程"+Thread.currentThread().getName()+"正在执行");
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });
        }*/

        //创建一个定长线程池，支持周期及周期性任务执行——定期执行
        /*ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        //延迟1秒，每3秒执行一次
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟1秒后，每3秒执行1次");
            }
        },1,3,TimeUnit.SECONDS);*/

        //创建一个单线程化线程池
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int l =0; l < 10; l++){
            final int index = l;
            singleThreadExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("正在执行"+Thread.currentThread().getName()+"线程");
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });
        }

    }


}
