/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universalyazilim.universalodev.utilities;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author ahmad
 */
public class VerificationUtlis {
    
   public static boolean isValidEmailAddress(String email) {
   boolean result = true;
   try {
      InternetAddress emailAddr = new InternetAddress(email);
      emailAddr.validate();
   } catch (AddressException ex) {
      result = false;
   }
   return result;
}
   
   public static boolean isValidPhoneNumber (String phoneNumber){
      boolean result = true ;
      if (phoneNumber.matches("[0-9]+") && phoneNumber.length() > 10)
          result = true;
      else result = false;
      
      return result;
   }
}
