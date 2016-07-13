package averagegrade;
import  java.awt.*;
import  javax.swing.*;
import  java.awt.event.*;
import  javax.swing.event.*;
import  java.io.*;
import  java.util.*;
import  java.text.*;

//Kim, Justin

public class  AverageGrade
{
    public static void main(String [] args)
    {
        int NumStudent = 0;
        int NumTest = 0;
        int NumRuns = 0;
        int CurStudent = 0;
        double Sum = 0.0;
        double Average = 0.0;
        String FirstName;
        char LetterGrade = '0';
        
        //promp how many students
        System.out.println("How many students?: ");
        //read the number
        Scanner input = new Scanner(System.in);
        NumStudent += input.nextInt();
        System.out.println("Number of students are:"+NumStudent);
        
        //make loop for that many students
        for(CurStudent = 0; CurStudent < NumStudent; CurStudent++)
        {
            //prompt the first name, #of test
            //get name and # of test
            System.out.printf("First name of student #%d: ",CurStudent+1);
            FirstName = input.next();
           
            System.out.println("How many # of tests:");
            NumTest = 0;
            NumTest += input.nextInt();
            System.out.println("Total # of tests:"+NumTest);
            
            Sum = GetSum(NumTest);
            System.out.println("The total sum of your tests are:"+Sum);
            
            //Calculate the average grade of the tests
            Average = Sum / NumTest;
		
            System.out.printf("%s's Average grade is: %f\n", FirstName, Average);
		
            LetterGrade = GetGradeLetter(Average);
		
            System.out.printf("%s's letter grade is: %c\n", FirstName, LetterGrade);
            Sum = 0.0;
            NumRuns++;
            System.out.println("Number of Runs:"+NumRuns);
        }
    }
    
    public static double GetSum(int NumTest)
    {
	int curTest = 0;
	double Grade;
	double Sum = 0;
	
	//Ask the student for the grades of all the tests
	for( curTest = 0; curTest < NumTest; curTest++ )
	{
            System.out.printf("Enter percent grade for test #%d(0 - 100): ", curTest + 1);
            Scanner input = new Scanner(System.in);
            Grade = input.nextDouble();
            if(0 <= Grade && Grade <= 100)
                Sum += Grade;
            else
            {
            System.out.println("Invalid Input");
                urTest--;//decrements curTest back to invalid input test
            }
	}
	return Sum;
    } // GetSum()
    
    public static char GetGradeLetter(double Average)
    {
            char letterGrade = '0';

            /*
            A > 90
            B = 80 > 90
            C = 70 > 80
            D = 60 > 70
            F < 60		
            */
            if(Average >= 90)
                    letterGrade = 'A';
            else if(Average >= 80 && Average < 90)
                    letterGrade = 'B';
            else if(Average >= 70 && Average < 80)
                    letterGrade = 'C';
            else if(Average >= 60 && Average < 70)
                    letterGrade = 'D';
            else
                    letterGrade = 'F';

            return letterGrade;
    } // GetGradeLetter()   
}