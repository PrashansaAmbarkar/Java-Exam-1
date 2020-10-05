/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class PentagonArea {
    double sideLength;
    double rLength;
    double area;
    
    //public double method for pentagonarea
    public double pentagonArea(double rLength){
        sideLength=(2*(rLength)*Math.sin((Math.PI)/5)); //formula for side length
        area= (5*Math.pow(sideLength,2))/(4*Math.tan((Math.PI)/5)); //area formula
        return Math.round(area*100.00)/100.00; 
    }
    
}
