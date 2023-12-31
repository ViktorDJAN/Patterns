package org.example.chainOfResponsibility;

public class StepProcessingTwo extends RequestHandler{
    public StepProcessingTwo(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    void handle(Client client, Credit credit) {
        ClientCompliance compliant;

        if(!client.getFullName().equalsIgnoreCase("")){
            compliant = ClientCompliance.COMPLIANT;
            System.out.println("It is a Suitable for credit getting client");
            requestHandler.handle(client,credit);
        }
        else{
            compliant = ClientCompliance.UNCOMPLIANT;
            System.out.println("It is a UNsuitable for credit getting client");
            requestHandler.handle(client,credit);
        }

    }
}
