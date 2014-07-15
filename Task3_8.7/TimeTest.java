/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Truonglx.93
 */
 import java.util.Scanner;
public class TimeTest {
     public static void main( String args[] )
     {
        Time t = new Time( 12,00,00 );          // 02:00:00
        Time t1 = new Time( 23, 10 );     // 21:34:00
        Time t2 = new Time( 23, 59, 10 ); // 12:25:42
      

        System.out.println(
           "time t :" );
        System.out.printf( "   %s\n", t.toUniversalString() );
        System.out.printf( "   %s\n", t.toString() );
        
        t.incrementMinute();
        System.out.println(
           "time t sau khi tang them 1 phut :" );
        System.out.printf( "   %s\n", t.toUniversalString() );
        System.out.printf( "   %s\n", t.toString() );


        System.out.println(
           "time t1 :" );
        System.out.printf( "   %s\n", t1.toUniversalString() );
        System.out.printf( "   %s\n", t1.toString() );
        
         t1.incrementHour();
        System.out.println(
           "time t1 sau khi tang them 1 gio :" );
        System.out.printf( "   %s\n", t1.toUniversalString() );
        System.out.printf( "   %s\n", t1.toString() );
        
        System.out.println( "time t2 :" );
        System.out.printf( "   %s\n", t2.toUniversalString() );
        System.out.printf( "   %s\n", t2.toString() );
       
        
        t2.incrementMinute();
        System.out.println(
           "time t2 sau khi tang them 1 phut :" );
        System.out.printf( "   %s\n", t2.toUniversalString() );
        System.out.printf( "   %s\n", t2.toString() );


        
       
      
     } // end main
  } // end class Time2Test

