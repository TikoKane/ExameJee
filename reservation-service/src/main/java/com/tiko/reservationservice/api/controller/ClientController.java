package com.tiko.reservationservice.api.controller;

import com.tiko.reservationservice.api.entity.Client;
import com.tiko.reservationservice.api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value ="/all")
    public List<Client> findAll(){
        return clientService.allClient();
    }

    @PostMapping(value = "/add")
    public Client save(@RequestBody Client c){
        return clientService.saveClient(c);
    }
}
