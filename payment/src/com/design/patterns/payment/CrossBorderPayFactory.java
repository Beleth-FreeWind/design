package com.design.patterns.payment;

public class CrossBorderPayFactory implements IInternationalPaymentFactory {

    @Override
    public IPayment createPayment() {
        return new CrossBorderPay();
    }
}
