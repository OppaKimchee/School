package checkingpassword;
import  java.awt.*;
import  javax.swing.*;
import  java.awt.event.*;
import  javax.swing.event.*;
import  java.io.*;
import  java.util.*;
import  java.text.*;

///////////////////////////////
//Kim,Justin                 //
//written in NetBeans IDE 8.1//
///////////////////////////////

public class CheckingPassword {

    public static void main(String[] args) {
        //write a program and method that checks whether a string is a valid password
        Print();
        Scanner input = new Scanner(System.in);
        String pass = input.next();
        System.out.println("Input password was: "+pass);
        while(true){
            PassCheck(pass);
            Print();
            pass = input.next();
        }//while()
    }//main()
    
    public static void PassCheck(String pass) {
        // a password must have at least 8 characters
        //a password consists of only letters and digits
        //a password must contain at least two digits
        if(pass.matches("^(?=.*?\\d.*\\d)[a-zA-Z0-9]{8,}$")) {                    
            //prompt the user to enter a password and displays "valid password"
            System.out.println("Valid Password");
        }
        else {
            //"invalid password" if rules are not followed.
            System.out.println("Invalid Password");
        }
    }//PassCheck()
    
    public static void Print() {
        System.out.println("Enter a password (must be at least 8 characters long with"
                + "with only letters and digits and at least 2 digits. *Ctrl+z to exit*):");
    }//Print()
}
