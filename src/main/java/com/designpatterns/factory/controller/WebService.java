package com.designpatterns.factory.controller;

import com.designpatterns.factory.dto.PaymentMethod;
import com.designpatterns.factory.pattern.PaymentFactory;
import com.designpatterns.factory.pattern.PaymentType;
import com.designpatterns.factory.service.PaymentService;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class WebService {

    private final PaymentService paymentService;

    @PostMapping(value = "/pay", consumes = "application/json")
    public ResponseEntity<?> doPayment(@RequestBody PaymentType paymentType){
        paymentService.buildPayment(paymentType);
        return ResponseEntity.ok().build();
    }
}
