package com.tiko.reservationservice.api.service;

import com.tiko.reservationservice.api.entity.Client;
import com.tiko.reservationservice.api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> allClient(){
        return  clientRepository.findAll();
    }
    public Client saveClient(Client client){
        return clientRepository.save(client);
    }
}
