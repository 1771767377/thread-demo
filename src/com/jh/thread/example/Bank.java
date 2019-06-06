package com.jh.thread.example;

public class Bank{

    //实现 两个人  一个在柜台取钱，另一个在ATM取款机取钱
    static double money  = 1000;

    //柜台取钱
    public void Counter(double money){
        Bank.money -= money;
        System.out.println("柜台取钱"+money+"元，还剩"+Bank.money+"元");
    }

    //ATM机取钱
    public void ATM(double money){
        Bank.money -= money;
        System.out.println("ATM取钱"+money+"元，还剩"+Bank.money+"元");
    }

    //对外开放一个接口  判断提款时余额是否充足
    public synchronized void outMoney(double money,String mode){
            if(money > Bank.money){
                System.out.println("余额不足！！！");
            }

            if (mode.equals("ATM")){
                ATM(money);
            }else {
                Counter(money);
            }
    }


}
