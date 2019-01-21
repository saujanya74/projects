/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saujanya
 */
public class Cash {
    
   private int balance;
    
   public void deposit(int money)
   {
       this.balance+=money;
   }
   public void withdraw(int money)
   {
       if (this.balance>=money) {
       this.balance-=money;    
           
       }
       else
       {
           System.out.println("sorry yoour balnce is less than you wanna withdraw");
       }
       
   }
   public void checkbalance()
   {
       System.out.println("yoour current balance is "+this.balance);
   }
   
}
