package org.springframework.samples.petclinic.proxy;

public class Store {

    Payment payment;

    // 생성자 만들기 만축기 Art + Ins
    public Store(Payment payment) {
        this.payment = payment;
    }

    public void buySomething(int amount){
        payment.pay(amount);
    }
}
