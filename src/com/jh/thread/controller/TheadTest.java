package com.jh.thread.controller;

public class TheadTest {

    public static void main(String[] args) {

        /*RunnableDemo R1 = new RunnableDemo("Thread 1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread 2");
        R2.start();*/
        ThreadDemo R3 = new ThreadDemo("Thread 1");
        R3.start();

        ThreadDemo R4 = new ThreadDemo("Thread 2");
        R4.start();

    }

}
