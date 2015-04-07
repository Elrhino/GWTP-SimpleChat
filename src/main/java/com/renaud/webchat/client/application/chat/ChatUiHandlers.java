package com.renaud.webchat.client.application.chat;

import com.gwtplatform.mvp.client.UiHandlers;

public interface ChatUiHandlers extends UiHandlers {
    void processMessage(String message);
}
