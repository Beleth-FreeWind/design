package com.design.patterns.payment;

public class UnionpayFactory implements IDomesticPaymentFactory {
    @Override
    public IPayment createPayment() {
        return new Unionpay();
    }
}
