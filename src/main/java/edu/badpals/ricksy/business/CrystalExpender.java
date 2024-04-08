package edu.badpals.ricksy.business;

public class CrystalExpender implements GuestDispatcher {
    private int stock;
    private double itemCost;
    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }
    public void dispatch(){

    }
    @Override
    public String toString(){
        return "";

    }
    int stock(){
        return this.stock;
    }
    @Override
    public void dispatch(CreditCard paymentMethod) {
        if(paymentMethod.pay(itemCost)){ 
            stock = this.stock - 1;
        }else{
            System.out.println("No puede pagar el crystal ");
            System.out.println("No tiene dinero");
        }
    }
}
