package com.designpatterns.factory.pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreditCardMethod implements Payment {
    @Override
    public String doPayment() {
        log.info("Pay with Credit Card");
        return "Pay with Credit Card";
    }
}
