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
public class Overloading {
    public double multiply (double a,double b){
        return (a*b);
    }
    public double multiply(double x, double y, double z){
        return (x*y)*z;
    }
    public int multiply(int a,int b){
        return (a*b);
    }
    public int multiply(int x,int y,int z){
        return (x*y*z);
    }
    public double divide(double a,double b){
        return (a/b);
    }
    public int divide(int a,int b){
        return (a/b);
    }
    
    
}
