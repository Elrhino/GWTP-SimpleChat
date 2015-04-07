package com.renaud.webchat.client.application.login;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.rpc.shared.DispatchAsync;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.renaud.webchat.client.application.action.UserRegistrationAction;
import com.renaud.webchat.client.place.NameTokens;
import com.renaud.webchat.shared.UserRegistrationResult;

public class LoginPresenter extends Presenter<LoginPresenter.MyView, LoginPresenter.MyProxy>
        implements LoginUiHandlers {

    interface MyView extends View, HasUiHandlers<LoginUiHandlers> {
    }

    private EventBus eventBus;
    private PlaceManager placeManager;
    private final DispatchAsync dispatcher;

    @NameToken(NameTokens.login)
    @ProxyCodeSplit
    public interface MyProxy extends ProxyPlace<LoginPresenter> {

    }

    @Inject
    public LoginPresenter(EventBus eventBus, MyView view, MyProxy proxy, PlaceManager placeManager, DispatchAsync dispatcher) {
        super(eventBus, view, proxy, RevealType.Root);

        this.eventBus = eventBus;
        this.placeManager = placeManager;
        this.dispatcher = dispatcher;
        getView().setUiHandlers(this);
    }

    @Override
    public void login(String username, String password) {
        UserRegistrationAction action = new UserRegistrationAction(username, password);
        dispatcher.execute(action, new AsyncCallback<UserRegistrationResult>() {
            @Override
            public void onFailure(Throwable throwable) {
                Window.alert(throwable.getMessage());
            }

            @Override
            public void onSuccess(UserRegistrationResult result) {
                PlaceRequest request = new PlaceRequest.Builder()
                        .nameToken(NameTokens.chat)
                        .build();
                placeManager.revealPlace(request);
            }
        });
    }

    protected void onBind() {
        super.onBind();
    }

    protected void onReset() {
        super.onReset();
    }
}
