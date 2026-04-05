package Java_BusReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bus> bus = new ArrayList<Bus>();
        ArrayList<Booking> book1 = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        bus.add(new Bus(1, true, 5));
        bus.add(new Bus(2, false, 3));
        bus.add(new Bus(3, true, 4));
        
        for(Bus i:bus){
            i.displayBusInfo();
        }

        int choice = 1;
        while(choice == 1){
            System.out.println("----------------------------");
            System.out.print("1, Booking \n2, Exit \nEnter Your Choice : ");
            choice = s.nextInt();

            if(choice == 1){
                Booking book = new Booking();

                if(book.available(bus, book1)){
                    book1.add(book);
                    System.out.println("Booking Successfull...");
                }
                else{
                    System.out.println("Bus Out of Seates...");
                }
            }

            System.out.println("----------------------------");
        }
    }
}
