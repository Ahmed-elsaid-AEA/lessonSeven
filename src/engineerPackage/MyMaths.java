/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engineerPackage;

/**
 *
 * @author A.E.A
 */
public class MyMaths {

    public static int sumAbsoulte(int firstName, int secondName) {
        if (firstName < 0) {
          firstName=-firstName;
        }
        
        if (secondName < 0) {
            secondName=-secondName;
        }
        return secondName + firstName;
    }

    public static double discount(double price) {
        if (price < 0) {
            return 0;
        } 
        return price - price * (.1);
    }
}
