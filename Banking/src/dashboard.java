
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saujanya
 */
public class dashboard {
    Scanner sc = new Scanner(System.in);
    void choices()
    {
        System.out.println("1. fast cash");
        System.out.println("2. cashWithdraw");
        System.out.println("3. checkBalance");
        System.out.println("4. change password");
        System.out.println("5. deposit");
        
        
        int num= sc.nextInt();
        
        //using switch case to direct to  the phase of wanted transaction
        
        switch(num)
        {
            
            case 1: 
                Cash c= new Cash();
                System.out.println("enter the amount you would like to deposit");
                c.withdraw(sc.nextInt());
                
            break;
            
            case 2 :
                 Cash c1 = new Cash();
                System.out.println("enter the amount you would like to deposit");
                c1.withdraw(sc.nextInt());
            
            break;
            
            case 3 :
                Cash c2 =  new Cash();
                c2.checkbalance();
               
            break;
            
            case 4 :System.out.println("Change password"); 
                    
                    ChangePassword cp = new ChangePassword();
                    cp.Change_password();
                    
            break;
            
            case 5 :
                Cash c3 = new Cash();
                System.out.println("pleasse enter the amount you would like to deposit");
                c3.deposit(sc.nextInt());
            break;
            
            // making sure the exception is caught in the default
            
            default:System.out.println("make sure you enter a vaid number");
            
        }
            
   
    }
}
