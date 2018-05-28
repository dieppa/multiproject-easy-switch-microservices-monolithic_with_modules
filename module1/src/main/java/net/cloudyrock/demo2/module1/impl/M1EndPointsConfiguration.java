package net.cloudyrock.demo2.module1.impl;

import net.cloudyrock.demo2.module1.api.M1Api;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public interface M1EndPointsConfiguration {

    @Bean
    default M1Api m1Controller() {
        return new M1Controller();
    }

}
