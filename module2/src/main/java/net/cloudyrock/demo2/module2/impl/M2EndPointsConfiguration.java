package net.cloudyrock.demo2.module2.impl;

import org.springframework.context.annotation.Bean;

public interface M2EndPointsConfiguration {

    @Bean
    default StoreServiceImpl m2Controller() {
        return new StoreServiceImpl();
    }

    @Bean
    default FilterDemo filterDemo() {
        return new FilterDemo();
    }

}
