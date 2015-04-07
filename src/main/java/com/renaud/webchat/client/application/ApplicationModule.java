package com.renaud.webchat.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.renaud.webchat.client.application.chat.ChatModule;
import com.renaud.webchat.client.application.home.HomeModule;
import com.renaud.webchat.client.application.login.LoginModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new HomeModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
        install(new LoginModule());
        install(new ChatModule());
    }
}
