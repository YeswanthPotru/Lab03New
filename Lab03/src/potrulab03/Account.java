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
public class Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank empty =new Bank(12345,150.0,"James Harden","(666-278-567)");
        empty.setD(100.0);
        empty.setW(50.0);
        System.out.println("empty constructor called");
        System.out.println("Account Constructor with parameters called");
        System.out.println("number : "+empty.getNumber());
        System.out.println("balance : "+empty.getBalance());
        System.out.println("CustomerName : "+empty.getCustomerName());
        System.out.println("CustomerPhone: "+empty.getCustomerPhoneNumber());
        
        System.out.println("Deposit of 100.0 made. New balance is "+empty.deposit());
        System.out.println("withdraw of 50.0 processed , Remaining  balance = "+empty.withdraw());
        System.out.println("To String Calling");
        System.out.println(empty.toString());
    }
    
}
