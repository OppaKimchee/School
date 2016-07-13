package fileprocessing;
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

//student object for each entry in Data.txt
class Students {
    public String name;
    public String ssn;
    public int quizGrade;
    public int midtermGrade;
    public int assignmentGrade;
    public int participationGrade;
    public int finalGrade;
    public int total;

    //compute the total grade
    public void QuizGrade(int x){
        quizGrade = x * 15 / 100;
    }
    public void MidtermGrade(int x){
        midtermGrade = x * 15 / 100;
    }
    public void AssignmentGrade(int x){
        assignmentGrade = x * 40 / 100;
    }
    public void ParticipationGrade( int x) {
       participationGrade = x * 10 / 100;
    }
    public void FinalGrade(int x) {
        finalGrade =  x * 20 / 100;
    }
    public void TotalGrade(){
        total = quizGrade + midtermGrade + assignmentGrade 
                + participationGrade + finalGrade;
    }
    //method to turn grade to a letter grade
    public char letterGrade(){
        if(total >= 90){
            return 'A';
        }
        else if(total >= 80){
            return 'B';
        }
        else if(total >= 70){
            return 'C';
        }
        else if(total >= 60){
            return 'D';
        }
        else{
            return 'F';
        }
    }
}

public class FileProcessing {
    public static void main(String[] args) throws Exception{
        //open and read the data file
        File infile = new File("DATA.txt");
        Scanner input = new Scanner(infile);
        
        //make and write to result file
        File outfile = new File("RESULT.txt");
        PrintWriter pr = new PrintWriter(outfile);
        
        //create a student object
        Students student = new Students();
        //loop for each entry in data.txt
        while(input.hasNext()){
            //grabs the entire line
            String line = input.nextLine();
            //break each element in the line by spaces
            StringTokenizer st = new StringTokenizer(line);
            student.name = st.nextToken();
            student.ssn = st.nextToken();
            student.QuizGrade(Integer.parseInt(st.nextToken()));
            student.MidtermGrade(Integer.parseInt(st.nextToken()));
            student.AssignmentGrade(Integer.parseInt(st.nextToken()));
            student.ParticipationGrade(Integer.parseInt(st.nextToken()));
            student.FinalGrade(Integer.parseInt(st.nextToken()));
            student.TotalGrade();
            System.out.println(student.name + " " + student.ssn + " " + student.letterGrade());
            pr.println(student.name+" "+student.ssn+" "+student.letterGrade());            
        }//while loop
        //close the files
        input.close();
        pr.close();
    }//main
}//class
