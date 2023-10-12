/*Ethan Daugherty
Data Structures Assignment 6
Date of Completion: March 21, 2023
Total Time Worked on: some time
Operating System: MacOS
IDE: jGRASP
Description: Program that counts the frequency of characters in a file.*/

import java.io.*;
import java.util.*;
public class FrequencyCount{
   public static void main(String[] args) throws IOException{
      String theFile = args[0];
      
      File inputFile = new File(theFile);//sets up the input file
      
      FileInputStream fileData = new FileInputStream (inputFile);//allows input file to be read by characters
      
      int[] counter = new int[27];//counter array for all the characters in the alphabet and a space 
      char theChar, theLowerChar;//character variables to count all values of letters
      int theASCII;//variable to compare chacter value to 
      int theCharInt;//variable to store character from file
      int prevChar = 0;//variable to track previous character
      
      while(fileData.available() > 0){//reads the file 
         theChar = (char) fileData.read();//reads each byte of data
         theLowerChar = Character.toLowerCase(theChar);
         theCharInt = (int) theLowerChar;
         int x = 0;//counter variable for array
         theASCII = 97;//ASCII value for 'a' 
         
         
         while(theASCII < 123){//checks if the value is a letter or space
            if(48 < theCharInt && theCharInt < 58){//checks if character is a number and deletes the space after it
               counter[26] = counter[26] - 1;
               if(48 < prevChar && prevChar < 58){//checks if the digit is more than one digit
                  counter[26] = counter[26] + 1;
               }
               break;
            }
            
            else if(theCharInt == 32){//increments the space counter
               counter[26] = counter[26] + 1;
               break;
            }
            
            else if(theCharInt == theASCII){//increments letter counter
               counter[x] = counter[x] + 1;
               break;
            }
            
            else{//checks next value
               x++;
               theASCII = theASCII + 1;
            }
         }
         prevChar = theCharInt;
      }
      
      fileData.close();//closes file
      
      int y = 97;//ASCII value for 'a' used for output
      for(int x = 0; x < 26; x++){//loop for output
         System.out.println((char) y + " " + counter[x]);
         y++;
      }
      
      System.out.println("Spaces " + counter[26]);
      
   }//ends main method

}//ends class