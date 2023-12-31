package org.example.CommandPattern;

public class DispathService {
    Command byEmail;
    Command bySMS;
    Command bySMSandEmail;

    public DispathService(Command byEmailSending, Command bySMS, Command bySMSandEmail) {
        this.byEmail = byEmailSending;
        this.bySMS = bySMS;
        this.bySMSandEmail = bySMSandEmail;
    }

    public void sendEmail(){
        byEmail.fulfill();
    }

    public void sendSMS(){
        bySMS.fulfill();
    }

    public void sendSMSandEmail(){
        bySMSandEmail.fulfill();
    }
}
