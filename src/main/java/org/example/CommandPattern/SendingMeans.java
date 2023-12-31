package org.example.CommandPattern;

public class SendingMeans {
    private String smsMessage;
    private String emailMessage;



    public void sendBySms(){
        System.out.println(smsMessage + "This is sent by sms");

    }
    public void sendByEmail(){
        System.out.println(emailMessage + "This is sent by email");
    }
    public void sendBySmsAndEmail(){
        System.out.println(smsMessage + "These are sent by sms and "+ emailMessage + " by email");
    }

    public String getSmsMessage() {
        return smsMessage;
    }

    public void setSmsMessage(String smsMessage) {
        this.smsMessage = smsMessage;
    }

    public String getEmailMessage() {
        return emailMessage;
    }

    public void setEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
    }
}
