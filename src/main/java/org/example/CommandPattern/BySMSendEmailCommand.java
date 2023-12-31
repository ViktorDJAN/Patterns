package org.example.CommandPattern;

public class BySMSendEmailCommand implements Command{
    SendingMeans sendingMeans;

    public BySMSendEmailCommand(SendingMeans sendingMeans) {
        this.sendingMeans = sendingMeans;
    }

    @Override
    public void fulfill() {
        sendingMeans.sendBySmsAndEmail();
    }
}
