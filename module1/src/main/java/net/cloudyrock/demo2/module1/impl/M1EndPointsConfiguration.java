package net.cloudyrock.demo2.module1.impl;

import net.cloudyrock.demo2.module1.api.ClientService;
import org.springframework.context.annotation.Bean;

public interface M1EndPointsConfiguration {

    @Bean
    default ClientService m1Controller() {
        return new ClientController();
    }

}
