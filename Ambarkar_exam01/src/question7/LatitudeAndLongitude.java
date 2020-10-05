/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class LatitudeAndLongitude {
    double x1,x2,y1,y2;
    double d;
    double radius=6371.01;
    
    //a public double method to find the distance between two points of the great circle 
    public double distance(double x1, double x2, double y1, double y2){
        x1=Math.toRadians(x1);
        x2=Math.toRadians(x2);
        y1=Math.toRadians(y1);
        y2=Math.toRadians(y2);
        double eq = Math.sin(x1)*Math.sin(x2)+
                    Math.cos(x1)*Math.cos(x2)*
                    Math.cos(y1-y2);
        d= radius * Math.acos(eq);
        return d;
    }
    
    
}
