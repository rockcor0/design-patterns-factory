package com.designpatterns.factory.pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayPalMethod implements Payment {
    @Override
    public void doPayment() {
        log.info("Pay with PayPal");
    }
}
