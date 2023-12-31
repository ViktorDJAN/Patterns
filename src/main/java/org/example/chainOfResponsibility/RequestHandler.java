package org.example.chainOfResponsibility;

abstract class RequestHandler {
    RequestHandler requestHandler;

    public RequestHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    abstract void handle(Client client, Credit credit);
}
