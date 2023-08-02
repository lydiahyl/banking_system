/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lydia
 */
public class CustomerDetails {
    private String CusID;
    private String AccNumber;
    private String FullName;
    private String AccountType;
    private double AccBalance;
    private String ICNumber;
    private String Gender;
    private String Address;
    private String Race;
    private String ContactNumber;

    public CustomerDetails(String CusID, String AccNumber, String FullName, String AccountType, double AccBalance, String ICNumber, String Gender, String Address, String Race, String ContactNumber){
    this.CusID =  CusID;
    this.AccNumber = AccNumber;
    this.FullName = FullName;
    this.AccountType = AccountType;
    this.AccBalance = AccBalance;
    this.ICNumber = ICNumber;
    this.Gender = Gender;
    this.Address = Address;
    this.Race = Race;
    this.ContactNumber = ContactNumber;
    
}
     public void update(String updateAdd){
        this.Address = updateAdd;
    }
     public void contact(String updateContact){
         this.ContactNumber = updateContact;
     }

     public String getCusID(){
        return this.CusID;
    }
     public String getAccNumber(){
        return this.AccNumber;
    }
     public String getCboFullName(){
        return this.FullName;
    }
    public String getAccountType(){
        return this.AccountType;
    }
    public double getAccBalance(){
        return this.AccBalance;
    }
    public String getICNumber(){
        return this.ICNumber;
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
    public String getContactNumber(){
        return this.ContactNumber;
    }
    
    @Override
    public String toString(){
        return this.FullName;
    }   

}
