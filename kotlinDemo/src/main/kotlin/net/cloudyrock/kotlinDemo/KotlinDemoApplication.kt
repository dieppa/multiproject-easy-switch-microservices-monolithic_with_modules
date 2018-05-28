package net.cloudyrock.kotlinDemo

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinDemoApplication

fun main(args: Array<String>) {
    SpringApplicationBuilder(KotlinEndPointConfigurationImpl::class.java)
            .bannerMode(Banner.Mode.OFF)
            .run(*args)
}
