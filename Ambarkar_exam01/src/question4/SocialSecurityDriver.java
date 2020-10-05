/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

import java.util.Scanner;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class SocialSecurityDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ssn;
        System.out.print("Enter a Social Security Number: ");
        Scanner scan= new Scanner(System.in);
        ssn= scan.nextLine();
        SocialSecurity ss = new SocialSecurity();
        System.out.println(ss.CorrectFormat(ssn));   
    }
    
}
