package com.jh.controller;

public class YieldDemo extends Thread{

        public YieldDemo(String threadName){
            super(threadName);
        }

    @Override
    public void run() {

            for (int i = 1; i <= 50; i++){
                System.out.println(""+this.getName()+"-------"+i);
                if (i == 30 ){
                    this.yield();
                }
            }
    }

    public static void main(String[] args) {
        YieldDemo n1 = new YieldDemo("张三");
        YieldDemo n2 = new YieldDemo("李四");
        n1.start();
        n2.start();
    }

}
