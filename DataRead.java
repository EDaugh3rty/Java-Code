/*Ethan Daugherty
Data Structures Assignment 1
Date of Completion: January 19, 2023
Total Time Worked on: 2 hours?
Operating System: MacOS
IDE: jGRASP
Description: Takes numbers from a file and finds numbers in a certain range decided
by the user and writes those numbers to a new file.*/

import java.util.Scanner;
import java.io.*;

public class DataRead{
   public static void main(String[] args) throws IOException{
   
      String theFile = args[0];//Passes an argument from the command line to be the file
      String yourFile = getFileName();//gets the output file name
      
      File inputFile = new File(theFile);//opens the input file
      File outputFile = new File(yourFile);//opens output file
      
      PrintWriter fileOfNums = new PrintWriter(outputFile);//sets up output file to write to
      
      Scanner input = new Scanner(System.in);//Declares a scanner for inputs from keyboard
      Scanner fileData = new Scanner(inputFile);//Declares a scanner for inputs from the file
      
      double lowerBound, upperBound;// Declaring variables
      double[] theData = new double[6000];// Declaring array for information from the file
      double[] inNumRange = new double[6000];
      int n = 0;//Local uncreatively named counting variable
      int i = 0;//Just another bland counting variable
      int theCount = 0;//variable to count the numbers in the range
      
     while(fileData.hasNext()){//sets up an array from information in a file
         theData[n] = fileData.nextDouble();
         n++;
      }//ends while loop
      
      System.out.println("Please choose a number greater than or equal to zero for your lower bound");//sets the lower bound
      lowerBound = input.nextDouble();
      
      System.out.println("Please choose a number greater than or equal to zero for your upper bound");//sets the upper bound
      upperBound = input.nextDouble();
      
      while(upperBound < lowerBound){//loop to make sure that the user chooses a upper bound higher than or equal to the lower bound
         System.out.println("Please choose a number greater than or equal to your lower bound");
         upperBound = input.nextDouble();
      }//end while loop
      
      while(i != n){//sorts the numbers into an array with the give number range
         
         if(lowerBound <= theData[i] && theData[i] <= upperBound){
            inNumRange[theCount] = theData[i];
            i++;
            theCount++;
         }//end of if statement
         
         else{
            i++;
         }//ends else statement
      }//end while loop
      
      System.out.println("The operation has been completed.");
      System.out.println("Your output file is named " + yourFile);
      
      for(int x = 0; x != theCount; x++){//prints the number range array to the output file
         fileOfNums.printf("%.2f\n", inNumRange[x]);
      }//end of for loop
      
      fileData.close();//closes input file
      fileOfNums.close();//closes output file
      
   }//ends main method
   
   public static String getFileName(){//method to get output file name
   
      Scanner input = new Scanner(System.in);//Declares a scanner for inputs from keyboard
      String theFileName, firstName, lastName, c1, c2, u1, u2, capFirst, capLast;
      
      System.out.println("What is your first name?");
      firstName = input.next();
      c1 = firstName.substring(0,1).toUpperCase();//makes sure that the name starts with a upper case letter
      c2 = firstName.substring(1).toLowerCase();
      capFirst = c1 + c2;
      
      System.out.println("What is your last name?");
      lastName = input.next();
      u1= lastName.substring(0,1).toUpperCase();//makes sure that the name starts with a upper case letter
      u2= lastName.substring(1).toLowerCase();
      capLast = u1 + u2;
      
      theFileName = (capFirst + capLast + "Numbers.txt");//makes the output file name
      
      return theFileName;
   }
   //Just for fun, a book :)
}//ends class