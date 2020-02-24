package com.design.patterns.payment;

public class PaymentTest {

    public static void main(String[] args) {

        WeChatPayFactory weChatPayFactory = new WeChatPayFactory();
        IPayment iPayment = weChatPayFactory.createPayment();
        iPayment.pay();

        CrossBorderPayFactory crossBorderPayFactory = new CrossBorderPayFactory();
        iPayment = crossBorderPayFactory.createPayment();
        iPayment.pay();

    }
}
