package com.renaud.webchat.shared;

import com.gwtplatform.dispatch.rpc.shared.Result;

public class UserRegistrationResult implements Result {

    private boolean registered;
    private String username;

    public UserRegistrationResult() {
    }

    public UserRegistrationResult(boolean userIsRegistered) {
        this.registered = userIsRegistered;
    }

    public boolean isRegistered() {
        return registered;
    }

    public String getUsername() {
        return username;
    }
}
