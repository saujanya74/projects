/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author DELL
 */
class Product {
    String name;
    LocalDate date;
    float price;
    
    public Product(LocalDate d,String n ,float p)
            {
                super();
                this.name=n;
                this.date=d;
                this.price=p;
            }
    
      public float getPrice() { 
      return price; 
   } 
}
