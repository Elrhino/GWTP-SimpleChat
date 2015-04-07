package com.renaud.webchat.client.application.chat;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.*;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.renaud.webchat.shared.Message;

import javax.inject.Inject;


public class ChatView extends ViewWithUiHandlers<ChatUiHandlers> implements ChatPresenter.MyView {
    interface Binder extends UiBinder<Widget, ChatView> {
    }

    @UiField TextArea messageWindow;
    @UiField TextArea inputBox;
    @UiField TextArea usersList;
    @UiField Button btnSend;
    @UiField Button btnDisconnect;

    @Inject
    ChatView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("btnSend")
    public void onBtnSendClick(ClickEvent clickEvent) {
        processMessage(inputBox.getText());
    }

    @UiHandler("btnDisconnect")
    public void onBtnDisconnectClick(ClickEvent clickEvent) {
        // TODO
    }

    @UiHandler("inputBox")
    void onInputKeyUp(KeyUpEvent event) {
        if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
            processMessage(inputBox.getText());
        }
    }

    private void processMessage(String message) {
        getUiHandlers().processMessage(message);
    }
}
