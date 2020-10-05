/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.Scanner;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class Errors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 25;
        System.out.println("Number is: "+num);
        
        
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.print("Please enter a number: ");
        number=scan.nextInt();
        System.out.println("Number entered is: "+number);
        int val = number/0;
        System.out.println("Value is :"+val);
    }
    
}
