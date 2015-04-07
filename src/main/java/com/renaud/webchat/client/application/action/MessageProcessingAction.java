package com.renaud.webchat.client.application.action;

import com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl;
import com.renaud.webchat.shared.MessageProcessingResult;

public class MessageProcessingAction extends UnsecuredActionImpl<MessageProcessingResult>{

    private String author;
    private String message;

    public MessageProcessingAction() {
    }

    public MessageProcessingAction(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
