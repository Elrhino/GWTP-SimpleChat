package com.renaud.webchat.client.application.login;

import com.gwtplatform.mvp.client.UiHandlers;

public interface LoginUiHandlers extends UiHandlers   {
    void login(String username, String password);
}
