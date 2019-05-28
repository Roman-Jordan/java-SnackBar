package snackBar;
    
public class Vending{

    private static int maxID = 0;
    private int id;
    private String name;

    public Vending(String name){
        maxID++;
        id = maxID++;

        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}