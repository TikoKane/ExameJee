package com.tiko.cloud.gateway;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallBackController {

    @RequestMapping(value = "/inscriptionFallBack")
    public Mono<String> inscriptionServiceFallback(){
        return Mono.just("Inscription Service prend du temps à répondre ou est indisponible. Veuillez réessayer plus tard svp!");
    }

    @RequestMapping(value = "/paiementFallBack")
    public Mono<String> paimentServiceFallback(){
        return Mono.just("Paiement Service prend du temps à répondre ou est indisponible. Veuillez réessayer plus tard svp!");
    }
}
