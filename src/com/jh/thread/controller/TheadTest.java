package com.jh.thread.controller;

public class TheadTest {

    public static void main(String[] args) {

        /*RunnableDemo R1 = new RunnableDemo("Thread 1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread 2");
        R2.start();*/
        new ThreadDemo("R3 ").start();

        new ThreadDemo("R2 ").start();

        new ThreadDemo("R1 ").start();

    }

}
