/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class objects{
    
    
    public static void main(String[] args) {
        
    
    
       
List<Product> list=new ArrayList<Product>();
        //Adding Products
        LocalDate ld = LocalDate.now();
        System.out.println("date is "+ld);
        list.add(new Product(ld,"HP Laptop",25000f));
        list.add(new Product(ld.plusDays(12), "Keyboard", 300f));
        list.add(new Product(ld.plusDays(13),"Dell Mouse",150f));
        list.add(new Product(ld.plusDays(14),"Samsung A5",17000f));
        list.add(new Product(ld.plusDays(15),"Iphone 6S",65000f));
        list.add(new Product(ld.plusDays(9),"Sony Xperia",25000f));
        list.add(new Product(ld.plusDays(1),"Nokia Lumia",15000f));
        list.add(new Product(ld.plusDays(4),"Redmi4 ",26000f));
        list.add(new Product(ld.plusDays(6),"Lenevo Vibe",19000f));
        System.out.println(list);

  
      for(Product c : list){
            System.out.println(c.date+"=="+c.name+"=="+c.price);}
  
    System.out.println("enter your choice");
        System.out.println("1.view");
        System.out.println("2.sort by ascending name");
        System.out.println("3.sort by decending name");
        System.out.println("4.sort by ascending price");
        System.out.println("5.sort by decending price");
        System.out.println("6.sort by latest date");
        System.out.println("7.sort by lowest price");
        System.out.println("7.sort by highest price");
        
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt() ;
        switch(a)
        {
            case 1:
                System.out.println("view");
                for(Product c : list){
            System.out.println(c.date+"=="+c.name+"=="+c.price);}
            break;
            case 2 :
                System.out.println("sort by ascending name");
                
                
                System.out.println(list);
                 Collections.sort(list,(p1,p2)->{
                    
                return p1.name.compareTo(p2.name);
                     });
               for(Product c : list){
            System.out.println(c.date+"=="+c.name+"=="+c.price);}
//                System.out.println("check 2 ");
            case 3:
                 Collections.sort(list,(p1,p2)->{
                return p2.name.compareTo(p1.name);
            });
                  for(Product c : list){
            System.out.println(c.date+"=="+c.name+"=="+c.price);}
                 
            break;
            case 4:
                System.out.println("sort by early to late");
                  Collections.sort(list,(p1,p2)->{
                return p1.date.compareTo(p2.date);
                   });
                 for(Product c : list){
            System.out.println(c.date+"=="+c.name+"=="+c.price);}
         
            case 5:
                System.out.println("sort by date late to early");
                 Collections.sort(list,(p1,p2)->{
                return p2.date.compareTo(p1.date);
                   });
                 for(Product c : list){
            System.out.println(c.date+"=="+c.name+"=="+c.price);}
                
            case 6:
                System.out.println("sort by expensive to cheap");
                
                    Collections.sort(list, (b1, b2) -> (int) (b1.getPrice() - b2.getPrice()));
                  
                    for(Product c: list)
                    {
                        System.out.println(c.date+"=="+c.name+"=="+c.price);
                    }
            case 7:
                System.out.println("sort by cheap to expensive");
                Collections.sort(list,(b1,b2)->(int) (b2.getPrice() - b1.getPrice()));
                for(Product c:list){
                      System.out.println(c.date+"=="+c.name+"=="+c.price);
                }
               
        }
       
    }
    

}