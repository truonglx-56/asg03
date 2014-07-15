/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Truonglx.93
 */
import java.util.Scanner;
public class DateAndTime {
    
        public static void main(String [] args){
        
         Scanner input = new Scanner(System.in);
         int m,s,h,month,day,year;
         System.out.println("nhap gio :");
         h=input.nextInt();
         System.out.println("nhap phut :");
         m=input.nextInt();
         System.out.println("nhap giay :");
         s=input.nextInt();
         System.out.println("nhap ngay :");
         day=input.nextInt();
         System.out.println("nhap thang :");
         month=input.nextInt();
         System.out.println("nhap nam :");
         year=input.nextInt();
         Time a =new Time(); 
         a.setTime(h,m,s,month,day,year);
         
     System.out.println("time  :" );
     System.out.printf( "   %s\n", a.toUniversalString() );
     System.out.printf( "   %s\n", a.toString() );
     
     a.incrementHour();
     System.out.println("Thoi gian sau khi tang 1 gio :");
     
     System.out.println(
           "time  :" );
     System.out.printf( "   %s\n", a.toUniversalString() );
     System.out.printf( "   %s\n", a.toString() );
     
         
        }
}

