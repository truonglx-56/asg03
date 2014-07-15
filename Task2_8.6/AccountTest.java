/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Truonglx.93
 */
 import java.util.Scanner;
public class AccountTest {
      public static void main(String [] args){
                
                Scanner input = new Scanner(System.in);
                SavingsAccount saver1 = new SavingsAccount(4,2000.00);
            SavingsAccount saver2 = new SavingsAccount(4,3000.00);
            System.out.printf("lai thang nay la :%.2f",saver1.calculateMonthlyInterest());
            System.out.printf("\nso tien du cua tai khoan 1 la :%.2f",saver1.getsavingBalance());
            System.out.printf("\nso tien du cua tai khoan 2 la :%.2f",saver1.getsavingBalance());
            saver1.modifyInterestRate(5);
            saver2.modifyInterestRate(5);
            System.out.printf("\nlai thang tiep theo la :%.2f",saver1.calculateMonthlyInterest());
            System.out.printf("\nso tien du cua tai khoan 1 la :%.2f",saver1.getsavingBalance());
            System.out.printf("\nso tien du cua tai khoan 2 la :%.2f",saver1.getsavingBalance());
        }   
}

