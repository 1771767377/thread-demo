package com.jh.thread.controller;

/**
 *  实现Runnable 接口来创建线程
 */
public class RunnableDemo implements Runnable{

    private Thread t;
    private String threadName;

    RunnableDemo(String Name ){
        threadName = Name;
        System.out.println("Creating"+ threadName);
    }

    public void run() {
        System.out.println("running"+ threadName);

        try {
            for (int i = 4; i > 0; i--){
                System.out.println("Thread "+threadName+","+i);
                //让线程休息一会
                Thread.sleep(50);
            }
        } catch (InterruptedException e){
            System.out.println("Thread"+threadName+"InterruptedException");
        }
        System.out.println("Thread"+threadName+"exiting");
    }

    public void start(){
        System.out.println("Starting"+threadName);
        if(t==null){
            t = new Thread(this,threadName);
            t.start();
        }
    }



}
