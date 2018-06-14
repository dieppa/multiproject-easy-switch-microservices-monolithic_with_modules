package net.cloudyrock.demo2.module2.impl;

import net.cloudyrock.demo2.module1.api.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/store")
public class StoreServiceImpl {

    @Inject
    private ClientService clientService;


    @GetMapping
    public String getInvoices() {
        return "Client: " + clientService.getClientById("myId");
    }
}
