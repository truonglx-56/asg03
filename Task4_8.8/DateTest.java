/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Truonglx.93
 */
import java.util.scanner;
public class DateTest {
      public static void main(String [] args){
        
         Scanner input = new Scanner(System.in);
         Date a = new Date(12,31,2012);
         
         System.out.println("Ngay da nhap la :"+a.toString());
         a.nextday();
         System.out.println("Ngay sau khi da tang 1 ngay la :"+a.toString());
         
         for(int i =1; i<=30;i++)
         a.nextday();
         System.out.println("Ngay sau khi da tang 1 thang la :"+a.toString());
         
         for(int i =1;i<=365;i++)
         a.nextday();
         System.out.println("Ngay sau khi da tang 1 nam la :"+a.toString());
        }
}
}
