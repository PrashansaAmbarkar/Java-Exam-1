/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author Sai Prashansa
 */
public class FanDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String color;
        double radius;
        int speed;
        boolean on;
        Fan f1=new Fan(); //object creation
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Fan Color:");
        color = scan.nextLine();
        
        //validation for color
        while(color.equals("") || color.equals(null)){
            System.out.print("Please enter fan color: ");
            color = scan.nextLine();
        }
        f1.setColor(color);
        System.out.print("Enter Fan Radius:");
        radius = scan.nextDouble();
        
        //validation for radius
        while(radius<=0){
            System.out.print("Radius cannot be zero. Please enter valid radius: ");
            radius = scan.nextDouble();
        }
        f1.setRadius(radius);
        System.out.print("Is fan on?(true/false): ");
        on= scan.nextBoolean();
        f1.setOn(on);
        if(on==true){
            System.out.print("Enter fan speed: ");
            speed= scan.nextInt();
            while(speed>=4 || speed<=0){
                System.out.print("Please enter values 1,2 or 3: ");
                speed= scan.nextInt();
            }
            f1.setSpeed(speed);
        }
        System.out.println("\n*****Getter Method*****");
        System.out.println("Radius: " + f1.getRadius());
        System.out.println("Color: " + f1.getColor());
        if(f1.isOn()==true){
            System.out.println("Fan status: ON");
            System.out.println("Speed: "+f1.getSpeed());
        }else{
            System.out.println("Fan Status: OFF");
        }
        System.out.println("\n*****ToString Method*****\n"+f1.toString());
    }
   
}
