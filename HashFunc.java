/*Ethan Daugherty
Data Structures Assignment 8
Date of Completion: April 28, 2023
Total Time Worked on: ? was not keeping track
Operating System: MacOS
IDE: jGRASP
Description: Testing multiple hash functions and collision rates*/
/*I had a lot of trouble with the equation from the book because it kept giving me negative
  values because it kept being too big of a number and the conversion did not work
  I also do not really understand linked lists so I did not do those either
  Sorry for not being able to do this. I should have started early.*/

import java.io.*;
import java.util.*;

public class HashFunc{
   public static void main(String[] args) throws IOException{
      String[] names = new String[177];//array to hold names of the file
      int n = 0;//counter variable
      String theFile = args[0];//Takes a file from the command line 
      File theInput = new File(theFile);//opens the file
      Scanner fileData = new Scanner(theInput);//allows the input to be read from the file
      char[] theLetters;//array of characters for names 
      
      while(fileData.hasNext()){//puts the data in the file into an array
         names[n] = fileData.next();
         n++;
      }
//----------------Case 1-----------------------------
      //Variables for the 1st case of the hash function
      int x = 0;
      int i = 0;
      int theASCII, theIndex, z;
      int theVal = 0;
      int collisions = 0;
      String[] theHash = new String[177];
      
      while(x < names.length){
         z = 0;
         i = 0;
         theVal = 0;
         theLetters = names[x].toCharArray();
         while(i < theLetters.length){
            theASCII = theLetters[i];
            theVal = theVal + theASCII;
            i++;
         }
         theIndex = theVal % 177;
         while(z != 1){//loop to put the value in the correct location
            if(theIndex >= 177){
               theIndex = 0;
            }
            else if(theHash[theIndex] == null){
               theHash[theIndex] = names[x];
               z = 1;
            }
            else{
               theIndex = theIndex + 1;
               collisions = collisions + 1;
            } 
         }  
         x++;
      }
      
// //----------------Case 2-----------------------------
//       //Variables for the 2nd case of the hash function
//       
//       x = 0;
//       int collisions1 = 0;
//       int  num,h;
//       long theVal1, hashFunc;
//       
//       String[] theHash1 = new String[177];
//       
//       while(x < names.length){
//          z = 0;
//          i = 0;
//          h = 1;
//          
//          
//          theVal1 = 0;
//          
//          theVal1 = names[x].hashCode() % 177;
//          int theIndex1 = theVal1.intValue();
//          
//          while(z != 1){
//             if(theIndex1 >= 177){
//                theIndex1 = 0;
//             }
//             else if(theHash1[theIndex1] == null){
//                theHash1[theIndex1] = names[x];
//                z = 1;
//             }
//             else{
//                theIndex1 = theIndex1 + 1;
//                collisions1 = collisions1 + 1;
//             } 
//          }  
//          x++;
//       }  
      
//----------------Case 3-----------------------------
      //Variables for the 3rd case of the hash function
      x = 0;
      i = 0;
      
      
      int collisions2 = 0;
      String[] theHash2 = new String[359];
      
      while(x < names.length){
         z = 0;
         i = 0;
         theVal = 0;
         theLetters = names[x].toCharArray();
         while(i < theLetters.length){
            theASCII = theLetters[i];
            theVal = theVal + theASCII;
            i++;
         }
         theIndex = theVal % 359;
         while(z != 1){//loop to put the value in the correct location
            if(theIndex >= 359){
               theIndex = 0;
            }
            else if(theHash2[theIndex] == null){
               theHash2[theIndex] = names[x];
               z = 1;
            }
            else{
               theIndex = theIndex + 1;
               collisions2 = collisions2 + 1;
            } 
         }  
         x++;
      }  

//----------------Case 8-----------------------------
      //Variables for the 8th case of the hash function
      x = 0;
      i = 0;
      
      
      int collisions7 = 0;
      String[] theHash7 = new String[177];
      
      while(x < names.length){
         z = 0;
         i = 0;
         theVal = 0;
         theLetters = names[x].toCharArray();
         while(i < theLetters.length){
            theASCII = theLetters[i];
            theVal = theVal + (theASCII * 5) + 7;
            i++;
         }
         theIndex = theVal % 177;
         while(z != 1){//loop to put the value in the correct location
            if(theIndex >= 177){
               theIndex = 0;
            }
            else if(theHash7[theIndex] == null){
               theHash7[theIndex] = names[x];
               z = 1;
            }
            else{
               theIndex = theIndex + 1;
               collisions7 = collisions7 + 1;
            } 
         }  
         x++;
      }        
      
//-------------------------OUTPUT---------------------------------

      System.out.println("case 1: " + collisions + " collisions");
      // System.out.println("case 2: " + collisions1 + " collisions");
      System.out.println("case 3: " + collisions2 + " collisions");
//       System.out.println("case 4: " + collisions3 + " collisions");
//       System.out.println("case 5: " + collisions4 + " collisions");
//       System.out.println("case 6: " + collisions5 + " collisions");
//       System.out.println("case 7: " + collisions6 + " collisions");
      System.out.println("case 8: " + collisions7 + " collisions");
//       System.out.println("case 9: " + collisions8 + " collisions");
//       System.out.println("case 10: " + collisions9 + " collisions");
//       System.out.println("case 11: " + collisions10 + " collisions");
      fileData.close();//closes the file
   }//ends main method

}//ends class