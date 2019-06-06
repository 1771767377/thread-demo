package com.jh.thread.Test.Demo2.controller;

public class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行...");
    }
}
