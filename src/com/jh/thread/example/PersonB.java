package com.jh.thread.example;

public class PersonB extends Thread {

    Bank bank;
    String mode;

    PersonB(Bank bank,String mode){
        this.bank = bank;
        this.mode = mode;
    }

    @Override
    public void run() {

        try {
            while(bank.money >= 100){
                bank.outMoney(100,mode);
                sleep(1000);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
