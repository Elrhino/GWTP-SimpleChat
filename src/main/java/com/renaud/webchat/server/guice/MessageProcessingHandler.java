package com.renaud.webchat.server.guice;

import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.rpc.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;
import com.renaud.webchat.client.application.action.MessageProcessingAction;
import com.renaud.webchat.shared.MessageProcessingResult;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageProcessingHandler implements ActionHandler<MessageProcessingAction, MessageProcessingResult> {
    @Override
    public MessageProcessingResult execute(MessageProcessingAction action, ExecutionContext context) throws ActionException {
        String message = action.getMessage();
        String date = getCurrentDate();

        return new MessageProcessingResult(message);
    }

    @Override
    public Class<MessageProcessingAction> getActionType() {
        return null;
    }

    @Override
    public void undo(MessageProcessingAction action, MessageProcessingResult result, ExecutionContext context) throws ActionException {

    }

    private String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        return dateFormat.format(date);
    }
}
