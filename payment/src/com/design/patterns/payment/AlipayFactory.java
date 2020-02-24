package com.design.patterns.payment;

public class AlipayFactory implements IDomesticPaymentFactory {

    @Override
    public IPayment createPayment() {

        return new Alipay();
    }
}
