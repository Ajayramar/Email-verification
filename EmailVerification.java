package com.zoho;


public class EmailVerification extends CheckMail{

    public static void main(String args[])
    {
       boolean result=CheckMail.CheckAllTheCharacters( getMail());

       if(result==false){
           System.out.println("INVALID MAIL ID...............");
       }else{
           System.out.println("VALID MAIL ID...............");
       }
    }

}
