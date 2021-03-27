package com.tiko.paymentservice.api.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paiement")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paiement {
    @Id
    @GeneratedValue
    private Long paymentId;
    private String paymentStatus;
    private Long reservationId;
    private int montant;
}
