package com.jh.thread.example;

public class MainClass {

    public static void main(String[] args) {
        Bank bank = new Bank();
        //new PersonA(bank, "ATM");
        PersonA a = new PersonA(bank, "ATM");
        PersonB b = new PersonB(bank, "Munctor");
        a.start();
        b.start();
    }

}
