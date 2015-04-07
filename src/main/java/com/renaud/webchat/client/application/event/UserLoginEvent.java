package com.renaud.webchat.client.application.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;

public class UserLoginEvent extends GwtEvent<UserLoginEvent.UserLoginHandler> {

    public interface UserLoginHandler extends EventHandler {
        void onLogin(UserLoginEvent event);
    }

    private static final Type<UserLoginHandler> TYPE = new Type<>();

    public UserLoginEvent() {
    }

    public static Type<UserLoginHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source) {
        source.fireEvent(new UserLoginEvent());
    }

    @Override
    public Type<UserLoginHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(UserLoginHandler handler) {
        handler.onLogin(this);
    }
}
