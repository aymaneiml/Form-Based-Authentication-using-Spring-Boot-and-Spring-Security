package com.Form_Based_Authentication.form_based_authentication1.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class WelComeController {

    @GetMapping("/")
    public String greeting(Authentication authentication){
        return "Welcom";
    }

}
