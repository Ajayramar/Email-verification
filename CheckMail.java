package com.zoho;

import java.util.Scanner;

public class CheckMail {

    protected static String getMail()
    {
        Scanner input=new Scanner(System.in);

        System.out.print("Please Create Your Mail :");

        String email=input.nextLine();

        return email;
    }

    protected static boolean CheckAllTheCharacters(String email)
    {
        int dotCount=0;

        int atCount=0;

        boolean check=true;

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i)=='@'){
                atCount++;
            }else if(email.charAt(i)=='.'){
                dotCount++;
            }
        }
        if(atCount>0 && dotCount>0)
        {
            int indexOfDot=email.indexOf('.');

            String topDomain=email.substring(indexOfDot+1,email.length()-1);

            for(int i=0; i<topDomain.length(); i++)
            {
                if(!(topDomain.charAt(i)>96 && topDomain.charAt(i)<123))
                {
                    check=false;
                    break;
                }
            }
            if(check==false)
            {
                System.out.println("TOP DOMAIN NAME WRONG...............PLEASE CHECK Y0UR TOP DOMAIN NAME");
            }else
            {
                int indexOfAt=email.lastIndexOf('@');

              String domain=email.substring(indexOfAt+1,email.lastIndexOf('.'));

                for(int i=0; i<domain.length(); i++)
                {
                    if(!(domain.charAt(i)>96 && domain.charAt(i)<123))
                    {
                        check=false;
                        break;
                    }
                }
                if(check==false)
                {
                    System.out.println("DOMAIN NAME WRONG...............PLEASE CHECK Y0UR DOMAIN NAME");
                }else{
                    String bodyOfMail=email.substring(0,email.indexOf('@'));

                    for(int i=0; i<bodyOfMail.length(); i++)
                    {
                        if(i==0)
                        {
                            if(!((bodyOfMail.charAt(i)>96 && bodyOfMail.charAt(i)<123) || (bodyOfMail.charAt(i)>64 && bodyOfMail.charAt(i)<91)))
                            {
                                check = false;
                                break;
                            }
                        }
                        if(i==bodyOfMail.length()-1)
                        {
                            if(!((bodyOfMail.charAt(i)>96 && bodyOfMail.charAt(i)<123) || (bodyOfMail.charAt(i)>64 && bodyOfMail.charAt(i)<91) || (bodyOfMail.charAt(i)>47 && bodyOfMail.charAt(i)<58)))
                            {
                                check = false;
                                break;
                            }
                        }
                    }
                    if(check==false)
                    {
                        System.out.println("WRONG RECIPIENT NAME.............PLEASE CHECK YOUR RECIPIENT NAME");
                    }
                }
            }
        }else
        {
            check=false;
            System.out.println("DOT AND @ MISSING...................");
        }
        return check;
    }

    /*protected static boolean CheckSpecialCharacter(String mail)
    {
        boolean result=true;

        int atAndDotCount=0;

        if(mail.length()>16)
        {

            for (int i = 0; i < mail.length(); i++)
            {
                if (i == 0 || i == mail.length() - 1)
                {
                    if ((mail.charAt(i) < 48 || mail.charAt(i) > 57 && mail.charAt(i) < 65 || mail.charAt(i) > 90 && mail.charAt(i) < 97 || mail.charAt(i) > 122)) {
                        System.out.println("First and last character should not be Special Character.............");
                        result = false;
                        break;
                    }
                } else if (mail.charAt(i) == '@' || mail.charAt(i) == '.')
                {
                    atAndDotCount++;
                }
            }
            if (atAndDotCount >= 2)
            {
                result = true;
            } else
            {
                System.out.println("@ or Dot symbol is missing!!!!!!!!!!!!");
                result = false;
            }
        }else
        {
            System.out.println("Minimum 16 Characters Are Needed For Mail ID...............");
            result=false;
        }
        return  result;
    }*/
}
