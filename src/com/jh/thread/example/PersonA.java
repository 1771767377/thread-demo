package com.jh.thread.example;

public class PersonA extends Thread {

    Bank bank;
    String mode;

    PersonA(Bank bank,String mode){
        this.bank = bank;
        this.mode = mode;
    }

    @Override
    public void run() {
        while (bank.money >= 100){
            try {
                    bank.outMoney(100,mode);
                    sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
