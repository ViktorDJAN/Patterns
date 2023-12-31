package org.example.CommandPattern;

public class ByEmailCommand implements Command{
    SendingMeans sendingMeans;


    public ByEmailCommand(SendingMeans sendingMeans) {
        this.sendingMeans = sendingMeans;
    }

    @Override
    public void fulfill() {
        sendingMeans.sendByEmail();
    }
}
