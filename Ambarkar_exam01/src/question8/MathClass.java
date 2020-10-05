/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

import java.util.Random;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class MathClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sin(2 * (Math.PI)));
        System.out.println(Math.cos(2 * (Math.PI)));
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.log(Math.E));
        System.out.println(Math.exp(1));
        System.out.println(Math.max(2, Math.min(3, 4)));
        System.out.println(Math.rint(-2.5));
        System.out.println(Math.ceil(-2.5));
        System.out.println(Math.floor(-2.5));
        System.out.println(Math.round(-2.5f));
        System.out.println(Math.round(-2.5));
        System.out.println(Math.rint(2.5));
        System.out.println(Math.ceil(2.5));
        System.out.println(Math.floor(2.5));
        System.out.println(Math.round(2.5f));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(Math.abs(-2.5))+"\n");
        
        double rad = Math.toRadians(47);
        System.out.println(rad);
        
        double pi=Math.toDegrees(Math.PI/7);
        System.out.println(pi);
        
        
        //obtains random integer between 34 and 55
        int num1=34 + (int)(Math.random()*(55-34));
        System.out.println("\n"+num1);
        //obtains random integer between 0 to 999
        int num2=(int)(Math.random() * 1000);
        System.out.println(num2);
        //obtains random integer between 5.5 to 55.5
        int num3= (int) (5.5 + (Math.random() * (55.5 - 5.5)));
        System.out.println(num3+"\n");
        
        System.out.println(Math.log(Math.exp(5.5)));
        System.out.println(Math.exp(Math.log(5.5)));
        System.out.println(Math.asin(Math.sin(Math.PI/6)));
        System.out.println(Math.sin(Math.asin(Math.PI/6)));
        
    }   
    
}
