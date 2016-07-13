package equalisnot;
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


public class EqualIsNot {

    public static void main(String[] args) {
        //infinite loop 
        while(true){
            //scan for a string
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a sentence (use ctrl + z to stop the program): ");
            String str = input.nextLine();
            
            //method to check if not/is appears equal amount
            boolean val = equalIsNot(str);

            //print out if its true or false
            System.out.println(val);
            
            //replace all the white spaces with V_V
            str = str.replace(" ", "V_V");
            System.out.println(str);

        }//while()
    }//main()
    
    public static boolean equalIsNot(String str){
        int isCount = 0;
        int notCount = 0;

        //str += "X";
        //check the given string and count the is/not that appear
        for(int i = 0; i < str.length() - 2; i++){
            if(str.substring(i, i + 2).equals("is")) isCount++;
            if(str.substring(i, i + 3).equals("not")) notCount++;
        }
        //return boolean type
        return(isCount == notCount);
    }//equalIsNot()
    
}
