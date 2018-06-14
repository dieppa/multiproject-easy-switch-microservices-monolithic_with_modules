package net.cloudyrock.demo2.module1.impl;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ClientApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(
                ClientServiceEndpointConfig.class,
                SwaggerConfig.class,
                WebConfig.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
