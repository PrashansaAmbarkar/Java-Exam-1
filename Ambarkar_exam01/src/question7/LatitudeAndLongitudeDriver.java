/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class LatitudeAndLongitudeDriver {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter point1 (latitude and longitude) in degrees: ");
        String lat = scan.nextLine();
        int delim = 0;
        for(int i=0;i<lat.length();i++){
            if(lat.charAt(i) == ','){
                delim = i;
            }
        }
        double x1 = Double.parseDouble(lat.substring(0, delim));
        double y1 = Double.parseDouble(lat.substring(delim+1,lat.length()));
        System.out.print("Enter point2 (latitude and longitude) in degrees: ");
        String lon = scan.nextLine();
        int delim1 = 0;
        for(int i=0;i<lon.length();i++){
            if(lon.charAt(i) == ','){
                delim1 = i;
            }
        }
        double x2 = Double.parseDouble(lon.substring(0, delim1));
        double y2 = Double.parseDouble(lon.substring(delim1+1,lon.length()));
        LatitudeAndLongitude lal=new LatitudeAndLongitude();
        double dist=lal.distance(x1, x2, y1, y2);
        System.out.println("The distance between the two points is "+dist+" km");
        scan.close();
    }
    
}
