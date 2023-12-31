package org.example.factoryMethod;

public class DebitCardFactory implements CardFactory{
    @Override
    public Card createNewCard() {
        return new DebitCard();
    }
}
