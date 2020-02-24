package com.design.patterns.payment;

public class WeChatPayFactory implements IDomesticPaymentFactory {

    @Override
    public IPayment createPayment() {
        return new WeChatPay();
    }
}
