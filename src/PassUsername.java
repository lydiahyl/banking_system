/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lydia
 */
public class PassUsername {
   public static String TxtUsername;
    
    public PassUsername(String TxtUsername){
    this.TxtUsername = TxtUsername;
    }
    public static void setTxtUsername(String TxtUsername){
        PassUsername.TxtUsername = TxtUsername;
    }
    public static String getTxtUsername(){
        return TxtUsername;
    }

}

