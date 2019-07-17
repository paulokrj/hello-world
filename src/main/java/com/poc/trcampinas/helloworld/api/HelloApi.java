package com.poc.trcampinas.helloworld.api;

import com.poc.trcampinas.helloworld.client.DateClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
@Validated
public class HelloApi {

    @Autowired
    private DateClient dateClient;

    @GetMapping("")
    public String get() {
        return "Hello World ----------- " + dateClient.getDate();
    }
}
