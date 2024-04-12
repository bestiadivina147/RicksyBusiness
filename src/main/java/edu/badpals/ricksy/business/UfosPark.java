package edu.badpals.ricksy.business;

import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher {
    private double fee;
    private final Map<String, String> flota = new HashMap <String, String>();

    public UfosPark() {
    }

    void add(String ufo ){
        flota.put(ufo, ufo);
    }

    @Override
    public void dispatch(CreditCard paymentMethod) {
        if(paymentMethod.pay(fee)){ 

        }

    }
}
