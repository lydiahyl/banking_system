
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lydia
 */
public class RetrieveCustomer {
     public static ArrayList<CustomerDetails> readFile(String Filename){
        ArrayList<CustomerDetails> customers = new ArrayList<>();
        try{
        FileReader fr = new FileReader("customer.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine())!=null){
            String[] cusDetails = line.split("<>");
            String CusID =  cusDetails[0];
            String AccNumber =  cusDetails[1];
            String FullName =  cusDetails[2];
            String AccountType =  cusDetails[3];
            double AccBalance = Double.parseDouble(cusDetails[4]);
            String ICNumber =  cusDetails[5];
            String Gender =  cusDetails[6];
            String Address =  cusDetails[7];
            String Race =  cusDetails[8];
            String ContactNumber =  cusDetails[9];
            CustomerDetails cus = new CustomerDetails(CusID, AccNumber, FullName, AccountType, AccBalance, ICNumber, Gender, Address, Race, ContactNumber);
            customers.add(cus);
        }
        br.close();
    }
        catch (Exception e){
            System.out.println(e);
            
        }
        return customers;
    }   
    public static void writeFile(ArrayList<CustomerDetails> customers, String fileName){
            try{
                FileWriter fw = new FileWriter(fileName);
                BufferedWriter bw = new BufferedWriter(fw);
                for (CustomerDetails a : customers){
                bw.write(a.getCusID() + "<>" + a.getAccNumber() + "<>"+ a.toString() + "<>" + a.getAccountType() + "<>" + String.valueOf(a.getAccBalance()) +
                       "<>" + a.getICNumber() + "<>" + a.getGender() + "<>" +  a.getAddress() + "<>" + a.getRace() + "<>" + a.getContactNumber() +  "\r\n");
               
                }
                bw.close();
            
                    }
            catch (Exception e){
                System.out.println(e);
            }
        }

    }
