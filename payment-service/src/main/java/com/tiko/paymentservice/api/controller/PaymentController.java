package com.tiko.paymentservice.api.controller;

import com.tiko.paymentservice.api.entity.Paiement;
import com.tiko.paymentservice.api.service.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaiementService paiementService;

    @GetMapping(value ="/all")
    public List<Paiement> findAll(){
        return paiementService.getPaiements();
    }

    @PostMapping(value = "/add")
    public Paiement save(@RequestBody Paiement p){
        return paiementService.addPayment(p);
    }

    @GetMapping(value ="/{id}")
    public Paiement findPaiementHistoryByInscriptionId(@PathVariable Long id){
        return paiementService.findPaiementHistoryByReservationId(id);
    }
}
