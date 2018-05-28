package net.cloudyrock.kotlinDemo

import org.springframework.context.annotation.Bean

interface KotlinEndPointsConfiguration {

    @Bean
    fun kotlinController() : KotlinController {
        return KotlinController()
    }
}