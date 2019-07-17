package com.poc.trcampinas.helloworld.api;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
@Validated
public class HelloApi {


    @GetMapping("")
    public String get() {
        return "Hello World";
    }
}
