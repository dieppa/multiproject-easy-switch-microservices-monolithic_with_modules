package net.cloudyrock.demo2.monolithic.app;

import net.cloudyrock.demo2.module1.impl.M1EndPointsConfiguration;
import net.cloudyrock.demo2.module2.impl.M2EndPointsConfiguration;
import net.cloudyrock.demo2.module2.impl.M2FeignConfiguration;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EndPointsMonolithicConfiguration.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
