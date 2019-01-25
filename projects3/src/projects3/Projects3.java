/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Projects3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of sentences");
        ArrayList <String> lines = new ArrayList<String>();
        
        int a = sc.nextInt();
          sc.nextLine();
        for (int i = 0; i <a; i++) {
            System.out.println("enter the sentence number "+ i);
          
            lines.add(sc.nextLine());
            
            
        }
        
        ArrayList <String> positive = new ArrayList<String>();
        ArrayList <String> negative = new ArrayList<String>();
        for(String s : lines){
            
            
           if(s.contains("not"))
           {
               positive.add(s);
               System.out.println("negative"+s);
               
           }
           else
           {
               negative.add(s);
               System.out.println("positive"+s);
           }
        }
    }
} 
        
    

