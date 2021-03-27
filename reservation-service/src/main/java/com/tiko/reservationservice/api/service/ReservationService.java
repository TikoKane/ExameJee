package com.tiko.reservationservice.api.service;

import com.tiko.reservationservice.api.DTO.PaiementDTO;
import com.tiko.reservationservice.api.entity.Client;
import com.tiko.reservationservice.api.entity.Reservation;
import com.tiko.reservationservice.api.entity.Terrain;
import com.tiko.reservationservice.api.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private ClientService clientService;
    @Autowired
    private TerrainService terrainService;
    @Autowired
    private RestTemplate template;

    public Reservation saveInsc(Reservation reservation){
        Client client = clientService.saveClient(reservation.getClient());
        Terrain terrain = terrainService.saveTerrain(reservation.getTerrain());
        reservation.setClient(client);
        reservation.setTerrain(terrain);
        return reservationRepository.save(reservation);
    }

    public Reservation saveReservation(Reservation reservation){
        String response ="";
        //  Reservation reservation = transactionRequest.getReservation();
        Client client = clientService.saveClient(reservation.getClient());
        Terrain terrain = terrainService.saveTerrain(reservation.getTerrain());
        reservation.setClient(client);
        reservation.setTerrain(terrain);
        reservationRepository.save(reservation);


        PaiementDTO paiementDTO = new PaiementDTO();
        paiementDTO.setReservationId(reservation.getId());
        paiementDTO.setMontant(25000);
        //rest call
       PaiementDTO paiementResponse = template.postForObject("http://PAIEMENT-SERVICE/payment/add", paiementDTO, PaiementDTO.class);
      response = paiementResponse.getPaymentStatus().equals("succes")?"PaiementDTO réussi!":"PaiementDTO échoué!";

       return reservation;
    }
}
