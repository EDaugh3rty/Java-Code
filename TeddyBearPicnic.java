/*Ethan Daugherty
Data Structures Assignment 4
Date of Completion: March 3, 2023
Total Time Worked on: 
Operating System: MacOS
IDE: jGRASP
Description: Program that uses recursion with a Teddy Bear scenario.*/

import java.util.Scanner;

public class TeddyBearPicnic{
   static int counter = 0;
   static boolean winner;
   public static boolean bears(int n){//method to check the teddy bear scenario
      counter++;
      int temp;
      
      if(n == 42){
         winner = true;
        //System.out.println("you won");
        return winner;
      }
      else if(n < 42){
         //System.out.println("false");
         return false;
      }
      
      if(n % 5 == 0){//checks if the number is divisable by 5
         temp = n - 42;
         bears(temp);    
      }
      
      if(n % 3 == 0 || n % 4 == 0){//checks if number is divisible by 3 or 4
         int lastDigits;
         lastDigits = (n % 10) * ((n % 100)/10);//multiplies the last two digits of the number together
         if(lastDigits != 0){
            temp = n - lastDigits;
            bears(temp);
         }
              
      }
         
      if(n % 2 == 0){//checks if the number is even
         temp = n/2;//returns the number  halfed 
         bears(temp);    
      }
      //System.out.println("this is reCURSED");
      return winner;    
   }//ends method
   
   public static void main(String[] args){
       int theNum;
       boolean checkWin;
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Please type an integer amount of teddy bears you would like to start with.");
       theNum = keyboard.nextInt();
       
       checkWin = bears(theNum); //is true (as shown above)
       
       if(checkWin == true){
         System.out.println("The number " + theNum + " will win the the Teddy Bear Challenge.");
       }
       else{
         System.out.println("The number " + theNum + " will not win the the Teddy Bear Challenge.");
       }
       System.out.println("The method was called " + counter + " times.");
      
       
   }//end of main method
     

}//end of class