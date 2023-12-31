package org.example.factoryMethod;

import org.example.factoryMethod.Card;
import org.example.factoryMethod.CardFactory;
import org.example.factoryMethod.CreditCardFactory;
import org.example.factoryMethod.DebitCardFactory;

import java.util.Scanner;

public class Program1 {
    /**
     * Задание №1. Реализовать фабрику создания кредитных и дебетовых карт с различными свойствами.*/

    public static void main(String[] args) {
        System.out.printf("Enter a factory name you wish to create: ");
        Scanner scanner = new Scanner(System.in);
        String factoryName = scanner.next();
        CardFactory cardFactory = choseFactory(factoryName);
        Card card = cardFactory.createNewCard();
        card.showBalance();
    }
    public static CardFactory choseFactory(String wishedFactory){
        if(wishedFactory.equalsIgnoreCase("credit")){
            return new CreditCardFactory();
        }
        else if (wishedFactory.equalsIgnoreCase("debit")) {
            return new DebitCardFactory();
        }
        else{
            throw new RuntimeException("an entered name = "+ wishedFactory +" does not exist in the system");
        }
    }
}