/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question13;

import java.util.Scanner;

/**
 *
 * @author Sai Prashansa Ambarkar
 */

public class CreditCardDriver {
/**
 * @param args the command line argument
 */
        public static void main(String[] args) {
        // TODO code application logic here
		long number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a credit card number as a long integer: ");
		number = scan.nextLong();
		scan.close();
		
		if(CreditCard.isValid(number) == true) {
			System.out.println(number + " is valid.");
		}
		else {
			System.out.println(number + " is invalid");
		}
	}

}
