package com.api_rest_spring.api_rest_springboot_webflux_mongo.services;

import com.api_rest_spring.api_rest_springboot_webflux_mongo.documents.Client;
import reactor.core.publisher.Flux;

public interface ClienteService {

    public Flux<Client> findAll();
}
