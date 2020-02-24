package com.design.patterns.payment;

public class WeChatPay implements IPayment {
    @Override
    public void pay() {
        System.out.println("使用微信进行支付！");
    }
}
