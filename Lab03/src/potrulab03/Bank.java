/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potrulab03;

/**
 *
 * @author S545537
 */
public class Bank {
    private int number;
    private double balance;
    private String customerName;
    private String customerPhoneNumber;
    double d;
    double S;
    double W;
    double K;
    public Bank(int number, double balance, String customerName, String customerPhoneNumber){
        this.number=number;
        this.balance=balance;
        this.customerName=customerName;
        this.customerPhoneNumber=customerPhoneNumber;
        
    }
    public Bank(){}
    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber=customerPhoneNumber;
    }
    public String getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }
    
    public void setD(double D){
        this.d=D;
    }
    public double deposit(){
        S=d+getBalance();
        return S;
    }
    
    public void setW(double W){
        this.W=W;
    }
    public double withdraw(){
        S=d+getBalance();
        K=S-W;
        return K;
    }
    @Override
    public String toString(){
        return "Account {number="+getNumber()+", balance="+withdraw()+", customerName="+getCustomerName()+", customerPhoneNumber="+getCustomerPhoneNumber()+"}";
    }

    
    
}

