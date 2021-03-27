package com.tiko.paymentservice.api.service;

import com.tiko.paymentservice.api.entity.Paiement;
import com.tiko.paymentservice.api.repository.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class PaiementService {

    @Autowired
    private PaiementRepository paiementRepository;

    public List<Paiement> getPaiements(){
        return  paiementRepository.findAll();
    }
    public Paiement addPayment(Paiement paiement){
        paiement.setPaymentStatus(paymentProcessing());
     //   paiement.setMontant(25000);
        return paiementRepository.save(paiement);
    }

    public String paymentProcessing(){
        //simulation de la réponse d'un third party(papypal, orange money) lors d'un paiment
        return new Random().nextBoolean()?"success":"false";
    }

    public Paiement findPaiementHistoryByReservationId(Long id) {
        return paiementRepository.findByReservationId(id);
    }
}
