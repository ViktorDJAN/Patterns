package org.example.factoryMethod;

public class CreditCardFactory implements CardFactory{
    @Override
    public Card createNewCard() {
        return new CreditCard();
    }
}
