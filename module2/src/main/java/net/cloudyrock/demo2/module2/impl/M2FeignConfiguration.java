package net.cloudyrock.demo2.module2.impl;

import net.cloudyrock.demo2.module1.api.ClientService;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(clients = ClientService.class)
public class M2FeignConfiguration {

}
