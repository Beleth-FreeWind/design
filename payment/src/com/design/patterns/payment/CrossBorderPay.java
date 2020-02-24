package com.design.patterns.payment;

public class CrossBorderPay implements IPayment {
    @Override
    public void pay() {
        System.out.println("使用跨境支付方式进行支付！");
    }
}
