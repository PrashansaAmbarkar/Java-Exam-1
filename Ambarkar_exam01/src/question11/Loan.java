/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class Loan {
    
    double loanAmount;
    double years;
    double interestRate;
    double monthlyIR;
    double principleAmount;
    double monthlypay;
    double monthlyrate;
    double monthlyamount;
    double balance;
    private double totalPayment=0;
    
    //Constructor
    public Loan(double loanAmount, double years, double interestRate) {
        this.loanAmount = loanAmount;
        this.years = years;
        this.interestRate = interestRate;
        this.balance = loanAmount;
    }
    
    //public method to get monthly interest
    public double monthlyInt(){
        monthlyIR = (interestRate/100)/ 12;
        return monthlyIR;
    }
    
    //public double method to calculate the monthly pay
    public double monthlyPay(){
        double monthlyamount = balance * monthlyInt() / (1 - (1 /Math.pow(1 + monthlyInt(), years * 12)));
        return monthlyamount;
    }
    
    //public method to calculate total pay
    public double totalPay(){
        totalPayment = (monthlyPay()*12)*years;
        return totalPayment;
    }
    
    //public method to get interest 
    public double getMonthlyIntPay(){
        double monthlyrate=loanAmount*monthlyIR;
        return monthlyrate;
    }
    //public method to get principle amount
    public double getprincipleAmount(){
        principleAmount = monthlyPay()-getMonthlyIntPay();
        return principleAmount;
    }
    
    //public method to get balance
    public double getbalance(){
        loanAmount = loanAmount - getprincipleAmount();
        return loanAmount;
    }
}
