/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Sai Prashansa
 */


public class Fan {
    public static final int SLOW= 1;
    public static final int MEDIUM=2;
    public static final int FAST= 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;
    
    //no-arg constructor
    public Fan() {
    }
    
    //getters and setters
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //to-string that returns fan description
    @Override
    public String toString() {
        if(on==true && speed==1){
            return "Speed=" + Fan.SLOW + "(Slow), Radius=" + radius + ", Color=" + color;
        }
        else if(on==true && speed==2){
            return "Speed=" + Fan.MEDIUM + "(Medium), Radius=" + radius + ", Color=" + color;
        }
        else if(on==true && speed==3){
            return "Speed=" + Fan.FAST + "(Fast), Radius=" + radius + ", Color=" + color;
        }
        else{
            return "Fan is off. "+"Radius=" + radius + ", Color=" + color; 
        }
    }
    
}       

