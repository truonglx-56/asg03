/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Truonglx.93
 */
public class SavingsAccount {
    
     private 
                double annualInterestRate ;//bien luu lai suat hang nam
                double savingsBalance;//luu tai khoan hien tai
   
    
    public SavingsAccount()//ham tao cac gia tri
        {
          annualInterestRate=0.00 ;
           savingsBalance=0.00;
         }
    
    public double getsavingBalance()//ham lay gia tri tai khoan hien co 
        {
         return savingsBalance;
        }
        
        
    public SavingsAccount(double a, double b)//ham khoi tao cac gia tri cho class
        {
           annualInterestRate=a ;
           savingsBalance=b;
         }
         
         
    public double calculateMonthlyInterest()//tinh lai hang thang
        {
          double temp;
          temp= (annualInterestRate*savingsBalance)/12;
          savingsBalance=savingsBalance=temp;
          return temp;          
          }
        
    public void modifyInterestRate(double k)//ham thay doi gia tri lai suat
        {
          annualInterestRate=k;
                
         }
}

        
      
