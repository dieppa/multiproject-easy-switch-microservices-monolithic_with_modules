package net.cloudyrock.demo2.module2.impl;

import org.springframework.context.annotation.Bean;

public interface M2EndPointsConfiguration {

    @Bean
    default M2Controller m2Controller() {
        return new M2Controller();
    }


}
