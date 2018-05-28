package net.cloudyrock.demo2.module1.impl;

import net.cloudyrock.demo2.module1.api.M1Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class M1Controller implements M1Api {

    @Override
    public String getString() {
        return "OK-1";
    }
}
