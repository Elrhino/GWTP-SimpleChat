package com.renaud.webchat.client.application.action;

import com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl;
import com.renaud.webchat.shared.UserRegistrationResult;


public class UserRegistrationAction extends UnsecuredActionImpl<UserRegistrationResult> {

    private String username;
    private String password;

    public UserRegistrationAction() {
    }

    public UserRegistrationAction(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
