package com.renaud.webchat.client.application.login;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

import javax.inject.Inject;


public class LoginView extends ViewWithUiHandlers<LoginUiHandlers> implements LoginPresenter.MyView {

    interface Binder extends UiBinder<Widget, LoginView> {
    }

    @UiField TextBox txtUsername;
    @UiField PasswordTextBox txtPassword;
    @UiField Button btnSubmit;

    @Inject
    LoginView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        txtUsername.getElement().setAttribute("placeholder", "Username");
        txtPassword.getElement().setAttribute("placeholder", "Password");
    }

    @UiHandler("btnSubmit")
    public void onBtnSubmitClick(ClickEvent event) {
        processLogin();
    }

    @UiHandler("txtPassword")
    void onPasswordKeyUp(KeyUpEvent event) {
        if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
            processLogin();
        }
    }

    private void processLogin() {
        String username = this.txtUsername.getText();
        String password = this.txtPassword.getText();

        getUiHandlers().login(username, password);
    }
}
