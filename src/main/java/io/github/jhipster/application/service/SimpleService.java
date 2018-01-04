package io.github.jhipster.application.service;

import io.github.jhipster.application.web.rest.client.SimpleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SimpleService {

    @Autowired
    private SimpleClient simpleClient;

    public String getText() {
        Map<String, String> credentials = new HashMap<>();
        credentials.put("username", "masterbuilder");
        credentials.put("password", "itsnosecret");
        String a = null;
        try {
            a = simpleClient.getSomeText("masterbuilder", "itnosecret").getBody();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

}
