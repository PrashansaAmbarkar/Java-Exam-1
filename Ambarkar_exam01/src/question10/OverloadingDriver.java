/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author S541063
 */
public class OverloadingDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Overloading oload=new Overloading();
        System.out.println(oload.multiply(10.9, 50));
        System.out.println(oload.multiply(20,8));
        System.out.println(oload.multiply(3.2,4.4,6));
        System.out.println(oload.multiply(2,30,8));
        System.out.println(oload.divide(45.5,5));
        System.out.println(oload.divide(80,4));
       }
    
}
