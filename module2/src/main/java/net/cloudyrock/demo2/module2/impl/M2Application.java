package net.cloudyrock.demo2.module2.impl;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class M2Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(M2EndPointsConfigurationImpl.class, M2FeignConfiguration.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
