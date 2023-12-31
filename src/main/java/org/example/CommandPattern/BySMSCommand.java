package org.example.CommandPattern;

public class BySMSCommand implements Command {
    SendingMeans sendingMeans;

    public BySMSCommand(SendingMeans sendingMeans) {
        this.sendingMeans = sendingMeans;
    }

    @Override
    public void fulfill() {
        sendingMeans.sendBySms();
    }
}
