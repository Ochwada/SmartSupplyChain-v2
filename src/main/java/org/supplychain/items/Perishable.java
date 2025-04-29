package org.supplychain.items;


import org.supplychain.exception.ExpiredProductException;

import java.time.LocalDate;

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
   // ---- Expiration Day Logic ----

   public boolean isExpired( ){
       int today = LocalDate.now().getDayOfYear(); //Day of the Year
       return today > getExpirationDay();
   }

   public void validateExpiration(){
       if(isExpired()){
           throw new ExpiredProductException("Product expired: " + toString());
       }

   }
   // --------------------------------

    // --- Getter and Setter ---
    public int getExpirationDay() {
        return expirationDay;
    }

    public void setExpirationDay(int expirationDay) {
        this.expirationDay = expirationDay;
    }

    @Override
    public String toString() {
        return getName() + " (Expires on day " + expirationDay + ")";
    }

}
