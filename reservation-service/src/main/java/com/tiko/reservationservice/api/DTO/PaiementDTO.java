package com.tiko.reservationservice.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paiement")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaiementDTO {
    @Id
    @GeneratedValue
    private Long paymentId;
    private String paymentStatus;
    private Long reservationId;
    private int montant;
}
