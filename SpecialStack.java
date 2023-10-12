/*Ethan Daugherty
Data Structures Assignment 3
Date of Completion: February 23, 2023
Total Time Worked on: ? was not keeping track
Operating System: MacOS
IDE: jGRASP
Description: A class that use the BackwardArrayList program to mimic the Stack class.*/

class SpecialStack extends BackwardArrayList{
   
   
   boolean empty(){//method that checks if the stack is empty
      if(theSize() == 0){
         return true;
      }
      else{
         return false;
      }
   }
   
   int peek(){//method to look at the the contents of the top of the stack
      int theTop;
      
      if(theSize() == 0){
         theTop = theBeginning;
      }
      else{
         theTop = theNext + 1;
      }
      return theArray[theTop];
   }
   
   int pop(){//method that removes the object on the top off of the stack
      removeSomething(theSize());
      
      int theItemRemoved;
      if(theSize() == 0){
         theItemRemoved = theBeginning;
      }
      else{
         theItemRemoved = theNext + 1;
      }
      return theArray[theItemRemoved];
   }
   
   int push(int num){//method that adds an object to the top of the stack
      addSomething(num);
      return num;
   }
    void showStack(){//Displays the contents of the stack
   
      
      System.out.print("{");
      for (int x = theNext + 1; x < theBeginning; x++){
         System.out.print(theArray[x] + ", ");
      }
      
      System.out.println(theArray[theBeginning] + "}");
      
   }
 

}//ends class