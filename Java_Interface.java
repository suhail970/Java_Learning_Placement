
interface Payment{
    void pay();
}

class Paying implements Payment{
    public void pay(){
        System.out.println("Payment Successfull...");
    }
}


public class Java_Interface {
    public static void main(String[] args) {
        Payment p = new Paying();

        p.pay();
    }
}
