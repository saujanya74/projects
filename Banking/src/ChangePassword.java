
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
public class ChangePassword {
    
    void Change_password()
    {
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("enter your current password");
        
        String currentpassword= sc.nextLine();
        login lg = new login();
       //comparing the password tto the current password to make sure the authenticaion is complete and legitimate 
        
       int compared = currentpassword.compareTo(lg.password);
       
        if (compared!=0) {
            System.out.println("the password you eneterd does not match");
        }
        else
        {
            System.out.println("enter the new password");
           String newPassword = sc.nextLine();
            System.out.println("confirm password");
            String finalPassword = sc.nextLine();
             compared = finalPassword.compareTo(newPassword);
            if (compared!=0) {
                System.out.println("Sorry the password you entered and the confirm passwordd do not match");
                
            }
            else
            {
                //changing the value in the password
                lg.password=finalPassword;
                System.out.println("your password has been changed please login again");
                
                //pening new login page to login again
                lg.details();
                
                
            }
        }
        
    }
    
}
