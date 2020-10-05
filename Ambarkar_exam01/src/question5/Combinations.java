/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class Combinations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, count=0;
        for (num1 = 1; num1 <= 7; num1++) { //for loop for the first number
            for (num2 = num1 + 1; num2 <= 7; num2++) { //for loop for the second number
                System.out.println(num1 + " " + num2);
                count++; //incrementing count to get the number of combinations
            }
        }
        System.out.println("The total number of all combinations is "+count); //printing combinations
    }

}

