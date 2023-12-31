package org.example.chainOfResponsibility;

public class Client {
    private String fullName;
    private int annualIncome;


    public String getFullName() {
        return fullName;
    }

    public int getAnnualIncome() {
        return annualIncome;
    }

    public Client(String fullName, int annualIncome) {
        this.fullName = fullName;
        this.annualIncome = annualIncome;
    }
}
