/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Truonglx.93
 */
import java.util.Scanner;
public class Time2EditTest {
     public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
        Time2Edit time = new Time2Edit();
        int a,b,c;
        System.out.println("nhap gio :");
        a=input.nextInt();
        System.out.println("nhap phut :");
        b=input.nextInt();
        System.out.println("nhap giay :");
        c=input.nextInt();
        if(time.setTime(a,b,c)==false){
        
                System.out.println("nhap sai thoi gian ket thuc chuong trinh");
                return;
        }
        System.out.println("thoi gian :");
        System.out.printf( "   %s\n", time.toUniversalString() );
        System.out.printf( "   %s\n", time.toString() );

    }
}
