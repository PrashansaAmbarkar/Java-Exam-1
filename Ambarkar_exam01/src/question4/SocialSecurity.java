/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class SocialSecurity {
    String ssn;
    boolean dash;
    boolean length;
    
    //public method of return type String to check the right format, with paramters ssn of return type String
    public String CorrectFormat(String ssn){
        if(ssn.length()== 11){
            this.length=true;
            if(length==true){
                if((ssn.charAt(3) == '-')&&(ssn.charAt(6) == '-')){ //checks if the character at 3,6 is a dash(-)
                    this.dash=true;
                }
                else{
                return ssn + " is a invalid social security number";
                }
            boolean digit0= Character.isDigit(ssn.charAt(0));
            boolean digit1= Character.isDigit(ssn.charAt(1));
            boolean digit2= Character.isDigit(ssn.charAt(2));
            boolean digit3= Character.isDigit(ssn.charAt(4));
            boolean digit4= Character.isDigit(ssn.charAt(5));
            boolean digit5= Character.isDigit(ssn.charAt(7));
            boolean digit6= Character.isDigit(ssn.charAt(8));
            boolean digit7= Character.isDigit(ssn.charAt(9));
            boolean digit8= Character.isDigit(ssn.charAt(10));
                //if loop to check if the characters at 0,1,2,4,5,7,8,9,10 are digits
                if(digit1==true && digit2== true && digit3==true && digit4==true 
                        && digit5==true && digit6==true && digit7==true && digit8==true 
                        && digit0==true){
                    return ssn + " is a valid social security number";
                }
                else{
                    return ssn + " is an invalid social security number";
                }
            }
        }
        else{
            return ssn + " is a invalid social security number";
        }
    return "Enter valid ssn";
    }
}
