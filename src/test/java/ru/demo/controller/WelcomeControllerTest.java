package ru.demo.controller;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by bool on 07.09.17.
 */
public class WelcomeControllerTest {
    @org.junit.Test
    public void welcome() throws Exception {
        WelcomeController welcomeController = new WelcomeController();
        Map<String,Object> model = new HashMap<>();
        String result = welcomeController.Welcome(model);
        assertEquals("welcome",result);
        assertEquals("Hello World", model.get("message"));
    }

}
