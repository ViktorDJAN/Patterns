package org.example.factoryMethod;

public class CreditCard implements Card{
    private int balance = 5000;
    @Override
    public void showBalance() {
        System.out.printf("The credit card balance is equal "+ balance);
    }
}
