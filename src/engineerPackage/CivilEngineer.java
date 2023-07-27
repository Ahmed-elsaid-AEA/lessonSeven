/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engineerPackage;

import java.util.Scanner;

/**
 *
 * @author A.E.A
 */
public class CivilEngineer {

    static Scanner input = new Scanner(System.in);

    public static String civilEngineerName() {
        System.out.println("Enter Your name ");
        return input.nextLine();
    }

    public static int civilEngineerAge() {
        System.out.println("Enter Your age ");
        return input.nextInt();
    }

   

}
