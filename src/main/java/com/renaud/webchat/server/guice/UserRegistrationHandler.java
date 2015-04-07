package com.renaud.webchat.server.guice;

import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.rpc.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;
import com.renaud.webchat.client.application.action.UserRegistrationAction;
import com.renaud.webchat.shared.UserRegistrationResult;

public class UserRegistrationHandler implements ActionHandler<UserRegistrationAction, UserRegistrationResult> {

    private final String PASSWORD = "admin123";

    @Override
    public UserRegistrationResult execute(UserRegistrationAction action, ExecutionContext context) throws ActionException {
        if (action.getPassword().equals(PASSWORD)) {
            return new UserRegistrationResult(true);
        }
        throw new ActionException("Wrong password");
    }

    @Override
    public Class<UserRegistrationAction> getActionType() {
        return null;
    }

    @Override
    public void undo(UserRegistrationAction userRegistrationAction, UserRegistrationResult userRegistrationResult, ExecutionContext executionContext) throws ActionException {

    }
}
