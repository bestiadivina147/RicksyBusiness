package edu.badpals.ricksy.business;

public class CreditCard {
    private final String owner;

    private final String number;
    private double credit;
    private static final String SYMBOL = "";

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }
    boolean pay(double credit){
        return true;
    }
    String number(){
        return this.number;
    }
    String cardOwner(){
        return this.owner;
    }
    double credit(){
        return this.credit;
    }
    @Override
    public String toString(){
        return number;

    }

}
