package com.designpatterns.factory.dto;

import com.designpatterns.factory.pattern.PaymentType;
import lombok.Data;

@Data
public class PaymentMethod {
    private PaymentType paymentType;
}
