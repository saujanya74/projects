
import java.util.Base64;
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
public class login {
    String name= "admin";
    String password = "admin";
    Scanner sc = new Scanner(System.in);
   public void details()
    {
        System.out.println("welcome to Sajha Bank");
        
        //getting details to login the ppassword 
        
        System.out.println("enter your username please");
        
        String username = sc.nextLine();
        
        System.out.println("enter your passsword");
        
        String password = sc.nextLine();
        
        //encoding the password
        
        String encodedPassword= Base64.getEncoder().encodeToString(password.getBytes());
        
        System.out.println("the password has been saved in database as encoded");
        
        //checkking the password using the String API
        
        int namenum = username.compareTo(name);
        int passwordnum = password.compareTo(this.password);
        
        
        if(namenum!=0 || passwordnum!=0)
        {
            System.out.println("make sure the username and password are correct");
        }
        else
        {
            //directing to the phase to choose  the transaction
            dashboard db = new dashboard();
            db.choices();
        }
        
        
    }
    
}
