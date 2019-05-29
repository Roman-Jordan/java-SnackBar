package snackBar;

public class Snack{
    private static int maxId = 0;
    private int id , vID, quantity;
    private String name;
    private double cost;

    public Snack(String name,double cost, int quantity){
        maxId++;
        id = maxId;

        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getCost(){
        return cost;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public int getVID(){
        return vID;
    }

    public void setVID(int vID){
        this.vID = vID;
    }

    public int getQuantity(){
        return quantity;
    }

    public void addQuantity(int quantity){
       this.quantity = this.quantity + quantity;
    }
    

    public double purchaseItem(int quantity){
        double total = this.cost * quantity;
        this.quantity = this.quantity - quantity;
        return total;
    }



    @Override
    public String toString(){
        String rtnStr = "id: " + vID + "\n" +
                        "name: " + name + "\n" +
                        "cost: " + cost + "\n" +
                        "Quantity: " + quantity + "\n";
                       
        return rtnStr;
    }
}