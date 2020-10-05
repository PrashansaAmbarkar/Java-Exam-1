/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class PentagonAreaDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PentagonArea pa=new PentagonArea(); //object creation
        System.out.print("Enter the length from the center to a vertex: ");
        Scanner scan=new Scanner(System.in);
        double r= scan.nextDouble();
        System.out.println("The area of the pentagon is "+pa.pentagonArea(r));
    }
    
}
