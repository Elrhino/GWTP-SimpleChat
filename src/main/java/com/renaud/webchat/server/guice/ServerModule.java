package com.renaud.webchat.server.guice;

import com.gwtplatform.dispatch.rpc.server.guice.HandlerModule;
import com.renaud.webchat.client.application.action.MessageProcessingAction;
import com.renaud.webchat.client.application.action.UserRegistrationAction;

public class ServerModule extends HandlerModule {
    @Override
    protected void configureHandlers() {
        bindHandler(UserRegistrationAction.class, UserRegistrationHandler.class);
        bindHandler(MessageProcessingAction.class, MessageProcessingHandler.class);
    }
}
