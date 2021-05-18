package com.paduris.client.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ClientService {

    private WebClient webClient;

    public ClientService(WebClient webClient) {
        this.webClient = webClient;
    }


    public Mono<String> get(Integer id) {

        return webClient.get()
                .uri("http://localhost:8092/server/" + id)
                .retrieve()
                .bodyToMono(String.class);

    }
}
