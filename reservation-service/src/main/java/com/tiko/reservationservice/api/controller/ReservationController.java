package com.tiko.reservationservice.api.controller;
import com.tiko.reservationservice.api.entity.Reservation;
import com.tiko.reservationservice.api.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

   @PostMapping(value = "/save")
    public Reservation save(@RequestBody Reservation reservation){

        return reservationService.saveInsc(reservation);
    }

    @PostMapping(value = "/add")
    public Reservation saveReservation(@RequestBody Reservation reservation){

        return reservationService.saveReservation(reservation);
    }
}
