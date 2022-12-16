package com.designpatterns.factory.pattern;

import org.springframework.stereotype.Service;

@Service
public class PaymentFactory {

    public Payment buildPayment(PaymentType paymentType) {
        switch (paymentType) {
            case CREDIT -> {
                return new CreditCardMethod();
            }
            case DEBIT -> {
                return new DebitCardMethod();
            }
            case PAYPAL -> {
                return new PayPalMethod();
            }
            default -> {
                return new DefaultMethod();
            }
        }
    }
}
