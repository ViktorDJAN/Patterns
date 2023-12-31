package org.example.chainOfResponsibility;

public class StepProcessingOne extends RequestHandler{

    public StepProcessingOne(RequestHandler requestHandler) {
        super(requestHandler);
    }
    @Override
    void handle(Client client, Credit credit) {

        if(client.getAnnualIncome()!= 0 && !client.getFullName().isEmpty()){
            System.out.println("Entered data is correct");
            requestHandler.handle(client,credit);
        }
        else {
            System.out.println("there is not enough client info, check entered data");
        }
    }

}
