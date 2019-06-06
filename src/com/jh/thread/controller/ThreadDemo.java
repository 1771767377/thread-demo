package com.jh.thread.controller;

/**
 * 继承Thread 类创建线程
 */
public class ThreadDemo extends Thread{

        private Thread t;
        private String ThreadName;

        ThreadDemo (String name){
            ThreadName = name;
            //System.out.println("Creating"+ThreadName);
        }

        static int num =20;
        Object obj = "aa";

        public void run(){
            //System.out.println("Running"+ThreadName);
            while (num>0) {
                synchronized (obj) {
                    //Thread.sleep(50);
                        if (num > 0) {
                            System.out.println(ThreadName + num);
                            num--;
                        } else {
                            System.out.println("值已为空！");
                                break;
                        }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            //System.out.println("Thread"+ThreadName+"exiting");
        }

       /* public void start(){
            //System.out.println("Starting"+ThreadName);
            if(t == null){
                t = new Thread(this, ThreadName);
                t.start();
            }
        }*/


}
