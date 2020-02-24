package com.design.patterns.payment;

public class Unionpay implements IPayment{

    @Override
    public void pay() {
        System.out.println("使用银联进行支付！");
    }
}
