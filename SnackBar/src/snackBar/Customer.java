package snackBar;

public class Customer{
    private static int maxID = 0;
    private int id;
    private String name;
    private double cashOnHand;
    
    public Customer(String name,double cashOnHand){
        maxID++;
        id = maxID;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getCOH(){
        return cashOnHand;
    }

    public void setCOH(double adjust){
        this.cashOnHand = this.cashOnHand - adjust;
    }
}