package net.cloudyrock.kotlinDemo

import net.cloudyrock.demo2.module1.impl.M1EndPointsConfiguration
import net.cloudyrock.demo2.module2.impl.M2EndPointsConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
class EndPointMonolithicKotlinConfiguration : M1EndPointsConfiguration, M2EndPointsConfiguration, KotlinEndPointsConfiguration{
}