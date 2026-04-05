package Java_OOPS_MiniProject;

//Encapsulation

class User{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Inheritance

class Customers extends User{
    void orderfood(){
        System.out.println("Food Ordered...");
    }
}
class Admin extends User{
    void manageRestorent(){
        System.out.println("Managing Restorent...");
    }
}

// Abstraction

abstract class Payment{
    abstract void pay();
}

class UPI extends Payment{
    public void pay(){
        System.out.println("Paid using UPI...");
    }
}
class Card extends Payment{
    public void pay(){
        System.out.println("Paid using Card...");
    }
}

public class Main{
    public static void main(String[] args) {
        Customers c = new Customers();
        c.setName("VEGETA");

        System.out.println("Customer Name : "+c.getName());

        c.orderfood();

        System.out.println("-----------");

        Payment p;

        p = new UPI();
        p.pay();

        p = new Card();
        p.pay();
    }
}