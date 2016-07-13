import  java.awt.*;
import  javax.swing.*;
import  java.awt.event.*;
import  javax.swing.event.*;
import  java.io.*;
import  java.util.*;
import  java.text.*;

public class  DemoRandomString
{
	
	public static void main(String [] args)
        {
            for(int i = 0; i < 20; i++)
            {
                System.out.println("===>"+(int)(Math.random()) + 1);  
            }
        }
}

