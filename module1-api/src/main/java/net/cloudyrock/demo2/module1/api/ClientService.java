package net.cloudyrock.demo2.module1.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/client")
@FeignClient(name = "client-service", url = "localhost:8081")
public interface ClientService {

    @GetMapping("{id}")
    String getClientById(@PathVariable("id") String id);

    @PostMapping
    Client createClient(@RequestBody Client client);
}
