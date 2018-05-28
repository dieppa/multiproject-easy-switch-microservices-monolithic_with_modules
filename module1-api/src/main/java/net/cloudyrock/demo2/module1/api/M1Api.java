package net.cloudyrock.demo2.module1.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/module1")
@FeignClient(name = "module1", url = "localhost:8081")
public interface M1Api {


    @GetMapping
    String getString();
}
