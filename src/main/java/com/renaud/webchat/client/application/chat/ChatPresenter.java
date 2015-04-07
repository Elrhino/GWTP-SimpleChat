package com.renaud.webchat.client.application.chat;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.renaud.webchat.client.place.NameTokens;
import com.renaud.webchat.shared.Message;

public class ChatPresenter extends Presenter<ChatPresenter.MyView, ChatPresenter.MyProxy> implements ChatUiHandlers {
    interface MyView extends View, HasUiHandlers<ChatUiHandlers> {
    }

    @ContentSlot
    public static final Type<RevealContentHandler<?>> SLOT_Chat = new Type<RevealContentHandler<?>>();

    @NameToken(NameTokens.chat)
    @ProxyCodeSplit
    public interface MyProxy extends ProxyPlace<ChatPresenter> {
    }

    @Inject
    public ChatPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);

        getView().setUiHandlers(this);
    }

    protected void onReset() {
        super.onReset();
    }

    @Override
    public void processMessage(String message) {

    }
}
