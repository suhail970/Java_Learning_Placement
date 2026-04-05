package Java_BusReservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
    private String passengerName;
    private int busNo;
    private Date d;
    
    Booking(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        this.passengerName = s.nextLine();

        System.out.println("Enter the Bus No : ");
        this.busNo = s.nextInt();
        s.nextLine();

        System.out.println("Enter the Date (dd-MM-yyyy): ");
        String date = s.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {
            this.d = format.parse(date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public boolean available(ArrayList<Bus> bus, ArrayList<Booking> book1){
        for(Bus i:bus){
            if(i.getBusNo() == this.busNo){
                int count = 0;
                for(Booking j:book1){
                    if(j.getBusNo() == busNo && j.getD().equals(j.d)){
                        count++;
                    }
                }

                if(count < i.getCapacity()){
                    return true;
                }
                else{
                    return false;
                }
            }
        }

        return false;
    }

    

    public int getBusNo() {
        return busNo;
    }
    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public Date getD() {
        return d;
    }
    public void setD(Date d) {
        this.d = d;
    }  


    
}
