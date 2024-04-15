package edu.badpals.ricksy.business;

<<<<<<< Updated upstream
public class CrystalExpender implements GuestDispatcher {
    private int stock;
    private double itemCost;
=======
public class CrystalExpender {
    private int stock;
    private double itemCost;

>>>>>>> Stashed changes
    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }
<<<<<<< Updated upstream
    public void dispatch(){
=======
    public void dispatch(CreditCard creditCard){
>>>>>>> Stashed changes

    }
    @Override
    public String toString(){
<<<<<<< Updated upstream
        return "";
=======
        return null;
>>>>>>> Stashed changes

    }
    int stock(){
        return this.stock;
    }
<<<<<<< Updated upstream
    @Override
    public void dispatch(CreditCard paymentMethod) {
        if(paymentMethod.pay(itemCost)){ 
            stock = this.stock - 1;
        }else{
            System.out.println("No puede pagar el crystal ");
            System.out.println("No tiene dinero");
        }
    }
=======
>>>>>>> Stashed changes
}
