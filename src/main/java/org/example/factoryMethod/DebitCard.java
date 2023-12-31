package org.example.factoryMethod;

public class DebitCard implements Card {
    private int balance = 1000;

    @Override
    public void showBalance() {
        System.out.printf("The debit card balance is equal "+ balance);
    }
}
