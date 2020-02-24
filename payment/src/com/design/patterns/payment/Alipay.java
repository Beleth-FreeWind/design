package com.design.patterns.payment;

public class Alipay implements IPayment {

    @Override
    public void pay() {
        System.out.println("使用支付宝进行支付！");
    }

}
