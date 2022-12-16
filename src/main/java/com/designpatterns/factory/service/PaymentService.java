package com.designpatterns.factory.service;

import com.designpatterns.factory.pattern.Payment;
import com.designpatterns.factory.pattern.PaymentFactory;
import com.designpatterns.factory.pattern.PaymentType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentService {
    private final PaymentFactory paymentFactory;

    public void buildPayment(PaymentType paymentType) {
        Payment payment = paymentFactory.buildPayment(paymentType);
        payment.doPayment();
    }
}
