
abstract class User{
    String name;
    String password;
    
    abstract void check();

    void display(){
        System.out.println(this.name+this.password);
    }
}

class Customer extends User{

    void check(){
        System.out.println(super.name);
    }
}

public class Java_OOPS{
    public static void main(String[] args) {
        
        User s = new Customer();

        s.name = "Suhail";
        s.password = "123";

        s.check();
        s.display();

    }
}