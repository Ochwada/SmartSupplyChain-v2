package org.supplychain.items;


import org.supplychain.exception.ExpiredProductException;

/**
 * *******************************************************
 * Package: org.supplychain.items
 * File: Perishable.java
 * Author: Ochwada
 * Date: Monday, 28.Apr.2025, 5:24 PM
 * Description:
 * Objective:
 * *******************************************************
 */

public class Perishable extends Product{

   private int expirationDay ;

   public Perishable(String id, String name, int expirationDay){
       super(id, name);
       this.expirationDay = expirationDay;
   }

   @Override
    public String getType(){
       return "Perishable";
   }

   public boolean isExpired(int today){
       System.out.print("Expired: ");
       return today > getExpirationDay();
   }

   public void validateExpiration(int today){
       if(isExpired(today)){
           throw new ExpiredProductException("Product expired: " + toString());
       }

   }

    // --- Getter and Setter ---
    public int getExpirationDay() {
        return expirationDay;
    }

    public void setExpirationDay(int expirationDay) {
        this.expirationDay = expirationDay;
    }

}
