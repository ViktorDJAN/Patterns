package org.example.chainOfResponsibility;

public class StepProcessingThree extends RequestHandler {
    public StepProcessingThree(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    void handle(Client client, Credit credit) {
        int sumCredit = credit.getAmount();
        int percent = credit.getPercentsRate();
        int term = credit.getCreditTerm();
        int annualClientYield = client.getAnnualIncome();
        try {
            if (((sumCredit * percent) / (annualClientYield / 12) <= term * 12) && !client.getFullName().isEmpty()) {
                System.out.println("Credit is approved");

            } else {
                System.out.println("Impossible to issue a credit");
            }
            requestHandler.handle(client, credit);
        } catch (NullPointerException e) {
            System.out.println("null pointer catch when processing");
        }
    }
}