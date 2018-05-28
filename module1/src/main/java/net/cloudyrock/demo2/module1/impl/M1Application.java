package net.cloudyrock.demo2.module1.impl;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class M1Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(M1EndPointsConfigurationImpl.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
