/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class SalesJobDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double goal=30000;
        double commission=0;
        double salesAmount = 0;
        double amountbal=0;
        
        do{
            amountbal =0;
            commission = 0;
            if(salesAmount > 10000){
                amountbal = salesAmount - 10000;
                commission = commission + (amountbal * 0.12);
            }
            if(salesAmount > 5000){
                amountbal = amountbal - (amountbal - 5000);
                commission = commission + (amountbal * 0.10);
            }
            if(salesAmount > 0) {
                commission=commission+ (amountbal*0.08);
            }
            salesAmount = salesAmount + 1;
        }while(commission<goal);
         System.out.println(salesAmount);
	}
}
