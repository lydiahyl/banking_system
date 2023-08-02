
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lydia
 */
public class Retrieve {
    
    public static ArrayList<Account> readFile(String Filename){
        ArrayList<Account> accounts = new ArrayList<>();
        try{
        FileReader fr = new FileReader("customer.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine())!=null){
            String[] currentAccount = line.split("<>");
            String CustomerID = currentAccount[0];
            String accNum = currentAccount[1];
            String accName = currentAccount[2];
            String accType = currentAccount[3];
            double accBal = Double.parseDouble(currentAccount[4]);
            String ICNo = currentAccount[5];
            String Gender = currentAccount[6];
            String Address = currentAccount[7];
            String Race = currentAccount[8];
            String ContactNo = currentAccount[9];
            Account acc = new Account(CustomerID, accNum, accName, accType, accBal, ICNo, Gender, Address, Race, ContactNo);
            accounts.add(acc);
        }
        br.close();
    }
        catch (Exception e){
            System.out.println(e);
            
        }
        return accounts;
    }   
    public static void writeFile(ArrayList<Account> accounts, String fileName){
            try{
                FileWriter fw = new FileWriter(fileName);
                BufferedWriter bw = new BufferedWriter(fw);
                for (Account a : accounts){
                bw.write(a.getCustomerID() + "<>" + a.toString() + "<>"+ a.getAccName() + "<>" + a.getAccType() + "<>" + String.valueOf(a.getAccBal()) +
                       "<>" + a.getICNo() + "<>" + a.getGender() + "<>" + a.getAddress() + "<>" + a.getRace() + "<>" + a.getContactNo() + "\r\n");
                }
                bw.close();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
       
    }

