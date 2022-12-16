package com.designpatterns.factory.pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultMethod implements Payment {
    @Override
    public String doPayment() {
        log.info("Pay with default method");
        return "Pay with default method";
    }
}
