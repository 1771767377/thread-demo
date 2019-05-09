package com.jh.thread.controller;

/**
 * 继承Thread 类创建线程
 */
public class ThreadDemo extends Thread{

        private Thread t;
        private String ThreadName;

        ThreadDemo (String name){
            ThreadName = name;
            System.out.println("Creating"+ThreadName);
        }

        public void run(){
            System.out.println("Running"+ThreadName);

            try {
                    for (int i = 4; i > 0; i--){
                        System.out.println("Thread"+ThreadName+","+i);
                        Thread.sleep(50);
                }
            }catch(InterruptedException s){
                System.out.println("Thread"+ThreadName+"InterruptedException.");
            }
            System.out.println("Thread"+ThreadName+"exiting");
        }

        public void start(){
            System.out.println("Starting"+ThreadName);
            if(t == null){
                t = new Thread(this, ThreadName);
                t.start();
            }
        }


}
