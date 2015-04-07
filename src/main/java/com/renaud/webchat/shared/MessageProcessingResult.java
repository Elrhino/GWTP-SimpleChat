package com.renaud.webchat.shared;

import com.gwtplatform.dispatch.rpc.shared.Result;

public class MessageProcessingResult implements Result {

    private String author;
    private String date;
    private String message;

    public MessageProcessingResult() {
    }

    public MessageProcessingResult(String author, String date, String message) {
        this.author = author;
        this.date = date;
        this.message = message;
    }
}
