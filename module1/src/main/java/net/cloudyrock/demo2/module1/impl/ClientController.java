package net.cloudyrock.demo2.module1.impl;

import net.cloudyrock.demo2.module1.api.Client;
import net.cloudyrock.demo2.module1.api.ClientService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController implements ClientService {

    @Override
    public String getClientById(@PathVariable("id") String id) {
        return "ID: " + id;
    }

    @Override
    public Client createClient(Client client) {
        return Client.builder()
                .id("id_" + System.currentTimeMillis())
                .name(client.getName())
                .build();
    }

}
