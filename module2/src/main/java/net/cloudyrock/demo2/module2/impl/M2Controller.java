package net.cloudyrock.demo2.module2.impl;

import net.cloudyrock.demo2.module1.api.M1Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module2")
public class M2Controller {

    @Autowired M1Api m1Api;

    @GetMapping
    public String getString() {
        return "From module1: " + m1Api.getString();
    }
}
