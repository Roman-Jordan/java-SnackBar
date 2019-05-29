package snackBar;

public class Main{
    public static void viewOutput(){
        //Customers
        Customer c1 = new Customer("Jane",45.25);
        Customer c2 = new Customer("Bob",33.14);

        //VendingMachines
        Vending v1 = new Vending("Food");
        Vending v2 = new Vending("Drink");
        Vending v3 = new Vending("Office");

        //Snack
        Snack sn1 = new Snack("Chips",1.25, 36);
        Snack sn2 = new Snack("Chocolate Bar",1.0, 36);
        Snack sn3 = new Snack("Pretzel",2.0, 30);

        //Beverages 
        Snack sn4 = new Snack("Soda",2.5, 24);
        Snack sn5 = new Snack("Water",2.75, 20);

        System.out.println("Customer 1 buys 3 of snack 4");
        c1.setCOH(sn4.purchaseItem(3));
        System.out.println(c1.getName() + "'s Remaining Cash On Hand is $" + c1.getCOH());
        System.out.println(sn4.getQuantity() + " " + sn4.getName() + "s Remaining");
        System.out.println();//Blank Line

        System.out.println("Customer 1 buys 1 of snack 3");
        c1.setCOH(sn3.purchaseItem(1));
        System.out.println(c1.getName() + "'s Remaining Cash On Hand is $" + c1.getCOH());
        System.out.println(sn3.getQuantity() + " " + sn3.getName() + "s Remaining");
        System.out.println();

        System.out.println("Customer 2 buys 2 of Snack 4");
        c2.setCOH(sn4.purchaseItem(4));
        System.out.println(c2.getName() + "'s Remaining Cash On Hand is $" + c2.getCOH());
        System.out.println(sn4.getQuantity() + " " + sn4.getName() + "s Remaining");
        System.out.println();

        System.out.println("Customer 1 finds $10");
        c1.setCOH(-10); // Save a function invert the number
        System.out.println();

        System.out.println("Customer 1 buys 1 of snack 2");
        c1.setCOH(sn2.purchaseItem(1));
        System.out.println(c1.getName() + "'s Remaining Cash On Hand is $" + c1.getCOH());
        System.out.println(sn2.getQuantity() + " " + sn2.getName() + "s Remaining");
        System.out.println();

        System.out.println("Add 12 more items to snack 3");
        sn3.addQuantity(12);
        System.out.println(sn3.getQuantity() + " " + sn3.getName() + "s Remaining");
        System.out.println();

        System.out.println("Customer 2 buys 3 of snack 3");
        c2.setCOH(sn3.purchaseItem(3));
        System.out.println(c2.getName() + "'s Remaining Cash On Hand is $" + c2.getCOH());
        System.out.println(sn3.getQuantity() + " " + sn3.getName() + "s Remaining");
        System.out.println();
    }

    public static void main(String[] args){
        viewOutput();
    }
}