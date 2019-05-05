package com.jh.controller;

public class WaitDemo implements Runnable{

    private String threadName;
    private Object prev;
    private Object self;

    public WaitDemo(String threadName,Object prev,Object self){
            this.threadName = threadName;
            this.prev = prev;
            this.self = self;
    }

    @Override
    public void run() {

        int count = 10;
        while (count > 0){
              synchronized (prev){
                  synchronized (self){
                      System.out.println(threadName);
                      count--;
                      //唤醒对象锁 ， 需要在synchronized语句块中执行，当synchronized语句块执行结束，才会执行该操作
                      self.notify();
                  }
                  try {
                        prev.wait();
                  }catch (InterruptedException e){
                      e.printStackTrace();
                  }
              }
        }
    }

    public static void main(String[] args) throws Exception{

        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        WaitDemo pa = new WaitDemo("A",c,a);
        WaitDemo pb = new WaitDemo("B",a,b);
        WaitDemo pc = new WaitDemo("C",b,c);

        new Thread(pa).start();
        Thread.sleep(100);
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);


    }



}
