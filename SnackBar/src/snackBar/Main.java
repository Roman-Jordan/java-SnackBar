package snackBar;

public class Main{
    public static void viewOutput(){

        Snack sn1 = new Snack("Twix",1.25, 10);
        Customer c1 = new Customer("Will",1.25);
        sn1.getTotal(100);
        System.out.println(sn1.getName());
        System.out.println(sn1.getQuantity());
        System.out.println(sn1.getID());
        System.out.println(sn1.getCost());


    }

    public static void main(String[] args){
        viewOutput();
    }
}