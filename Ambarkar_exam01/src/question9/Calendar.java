/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

//GregorianCalender has been imported 
import java.util.GregorianCalendar;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class Calendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //no-arg constructor
        GregorianCalendar gcal = new GregorianCalendar();
        int year= gcal.get(GregorianCalendar.YEAR); //gets the current year
        int month= gcal.get(GregorianCalendar.MONTH)+1; // gets the current month - 1. Hence we have to increment by 1
        int day= gcal.get(GregorianCalendar.DAY_OF_MONTH); //gets the current day of the month
        
        System.out.println("The current year is: "+year);
        System.out.println("The current month is: "+month);
        System.out.println("The current day of the month is: "+day);
        System.out.println("Date:"+month+"-"+day+"-"+year);
        
        //Set a specified elapsed time since January 1, 1970.Value=1234567898765L
        
        gcal.setTimeInMillis(1234567898765L);
        
        int yeare=gcal.get(GregorianCalendar.YEAR);
        int monthe= gcal.get(GregorianCalendar.MONTH);
        int daye= gcal.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("The current year is: "+yeare);
        System.out.println("The current month is: "+monthe);
        System.out.println("The current day of the month is: "+daye);
        System.out.println("Date after value has been set time in millis:"+monthe+"-"+daye+"-"+yeare);
        
              
        
        
    }
    
}
