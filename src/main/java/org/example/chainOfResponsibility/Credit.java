package org.example.chainOfResponsibility;

public class Credit {
    private int amount;
    private int creditTerm;
    private int monthPayment;
    private int percentsRate;

    public int getAmount() {
        return amount;
    }



    public int getCreditTerm() {
        return creditTerm;
    }

    public int getMonthPayment() {
        return monthPayment;
    }

    public int getPercentsRate() {
        return percentsRate;
    }

    public Credit(int amount,int creditTerm, int monthPayment, int percentsRate) {
        this.amount = amount;
        this.creditTerm = creditTerm;
        this.monthPayment = monthPayment;
        this.percentsRate = percentsRate;
    }

}
