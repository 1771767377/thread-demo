package com.jh.thread.Test.Demo1.controller;

import java.util.concurrent.locks.ReentrantLock;

public class RobtoMap implements Runnable {

    int i = 5;
    Object obj = new Object();
    ReentrantLock rt = new ReentrantLock();

    @Override
    public void run() {
            synchronized (obj){
                rt.lock();
                if(i > 0){
                    i--;
                    System.out.println("恭喜"+Thread.currentThread().getName()+"抢到名额，还剩"+i+"个名额");
                }else {
                    System.out.println("对不起，名额已经发放完毕");
                }
                 rt.unlock();
        }

    }
}
