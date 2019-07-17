package com.poc.trcampinas.helloworld.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DateClient {

    public String getDate() {

        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.getForEntity("http://ec2-100-27-22-76.compute-1.amazonaws.com:8081", String.class);

            if (response.getStatusCode() == HttpStatus.OK) {
                return response.getBody();
            }
            return "Erro ao buscar data";

        } catch (RuntimeException ex) {
            return "Erro ao buscar data";
        }
    }
}
