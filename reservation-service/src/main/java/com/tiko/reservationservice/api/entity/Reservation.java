package com.tiko.reservationservice.api.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "reservation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue
    private Long id;
    private String dateReservation;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Terrain terrain;
}
