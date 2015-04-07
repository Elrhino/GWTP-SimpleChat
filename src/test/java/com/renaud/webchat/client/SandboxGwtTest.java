package com.renaud.webchat.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.renaud.ircchat.ircChat";
    }

    public void testSandbox() {
        assertTrue(true);
    }
}
