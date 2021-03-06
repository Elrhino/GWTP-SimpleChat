package com.renaud.webchat.shared;

import com.gwtplatform.dispatch.rpc.shared.Action;
import com.gwtplatform.dispatch.rpc.shared.ActionImpl;
import com.gwtplatform.dispatch.rpc.shared.Result;

public abstract class AbstractAction<R extends Result> implements Action<R> {
    @Override
    public String getServiceName() {
        String className = this.getClass().getName();
        int namePos = className.lastIndexOf(".") + 1;
        className = ActionImpl.DEFAULT_SERVICE_NAME + className.substring(namePos);

        return className;
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}