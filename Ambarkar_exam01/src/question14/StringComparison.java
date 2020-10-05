/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question14;

import java.util.Scanner;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class StringComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1 = scan.nextLine();
        System.out.print("Enter String 2: ");
        String s2 = scan.nextLine();
        scan.close();
        int count = 0;
        //checks whether the string 1 contains string 2
        while (s1.contains(s2)) {
            count++; //increase count if word is found
            s1 = s1.substring(0, s1.lastIndexOf(s2)); // eliminating string from the last index place from where the word is found
        }
        System.out.println("The number of occurrences of " + s2 + " in the above string are " + count);
    }
}


