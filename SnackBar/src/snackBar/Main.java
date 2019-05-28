package snackBar;

public class Main{
    public static void viewOutput(){
        //Customers
        Customer c1 = new Customer('Jane',45.25);
        Customer c2 = new Customer('Bob',33.14);

        //VendingMachines
        Vending v1 = new Vending('Food');
        Vending v2 = new Vending('Drink');
        Vending v3 = new Vending('Office');

        //Snack
        Snack sn1 = new Snack("Chips",1.25, 36);
        Snack sn2 = new Snack("Chocolate Bar",1.0, 36);
        Snack sn3 = new Snack("Pretzel",2.0, 30);

        //Beverages 
        Snack sn4 = new Snack("Soda",2.5, 24);
        Snack sn5 = new Snack("Water",2.75, 20);

        //Customer 1 buys 3 of snack 4
        System.out.println();


        System.out.println(sn1.getQuantity());
        System.out.println(sn1.getID());
        System.out.println(sn1.getCost());


    }

    public static void main(String[] args){
        viewOutput();
    }
}