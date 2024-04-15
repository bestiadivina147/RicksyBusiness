package edu.badpals.ricksy.business;

public class CreditCard {
    private final String owner;

    private final String number;
    private double credit=6;
    private static final String SYMBOL = "";

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }
    boolean pay(double charge){
        if(this.credit>=charge){
            return true;
        }else{
            return false;
        }
        
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
    public static void main(String[] args) {
        CreditCard example_CreditCard = new CreditCard("propietario", "3");
        CreditCard.pay(5.0);
    }



}
