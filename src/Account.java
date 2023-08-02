
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lydia
 */
public class Account {
    private String CustomerID;
    private String accNumber;
    private String accName;
    private String accType;
    private double accBal;
    private String ICNo;
    private String Gender;
    private String Address;
    private String Race;
    private String ContactNo;
    
    public Account(String CustomerID, String accNumber, String accName, String accType, double accBal, String ICNo, String Gender, String Address, String Race, String ContactNo){
    this.CustomerID = CustomerID;
    this.accNumber =  accNumber;
    this.accName = accName;
    this.accType = accType;
    this.accBal = accBal;
    this.ICNo = ICNo;
    this.Gender = Gender;
    this.Address = Address;
    this.Race = Race;
    this.ContactNo = ContactNo;
    
}
    public void withdraw(double amount){

        if(accBal - amount < 100 && getAccType().equals("Savings Account")){
         JOptionPane.showMessageDialog(null, "Insufficient Balance! Minimum balance required for Savings Account is RM100!", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(accBal - amount < 500 && getAccType().equals("Current Account")){
            JOptionPane.showMessageDialog(null, "Insufficient Balance for current account!Minimum balance required for Current Account is RM500!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
             this.accBal = this.accBal - amount;
        }
    }
    public void deposit(double amount){
        this.accBal = this.accBal + amount;
    }
    public void transfer(Account a, double amount){
       if(accBal - amount < 100 && getAccType().equals("Savings Account")){
        JOptionPane.showMessageDialog(null, "Transaction Invalid! Minimum balance required for Savings Account is RM100!", "Error", JOptionPane.ERROR_MESSAGE);
       } else if(accBal - amount < 500 && getAccType().equals("Current Account")){
        JOptionPane.showMessageDialog(null, "Transaction Invalid! Minimum balance required for Current Account is RM500!", "Error", JOptionPane.ERROR_MESSAGE);
       } else{
        this.withdraw(amount);
        a.deposit(amount);
        JOptionPane.showMessageDialog(null, "Transaction has been made successfully!");
       }
    }
    public String getCustomerID(){
        return this.CustomerID;
    }
    public String getAccName(){
        return this.accName;
    }
    public String getAccType(){
        return this.accType;
    }
    public double getAccBal(){
        return this.accBal;
    }
    public String getICNo(){
        return this.ICNo;
    }
    public String getGender(){
        return this.Gender;
    }
    public String getAddress(){
        return this.Address;
    }
    public String getRace(){
        return this.Race;
    }
    public String getContactNo(){
        return this.ContactNo;
    }
    
    @Override
    public String toString(){
        return this.accNumber;
    }

}
   
