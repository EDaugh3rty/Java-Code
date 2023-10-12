/*Ethan Daugherty
Data Structures Assignment 2
Date of Completion: January 31, 2023
Total Time Worked on: 3 hours and more :(
Operating System: MacOS
IDE: jGRASP
Description: A class that functions like the ArrayList class but starts at the end.*/


class BackwardArrayList{

   int arraySize = 100;//Starting size of array
   private int theCounter = 0;//Counting variable for how many integers are in the array
   private int found;
   private int count;
   
   protected int[] theArray = new int[arraySize];//Setting up the array
   protected int theBeginning = arraySize - 1;//finds the beginning of the array
   protected int theNext = theBeginning;//Variable for finding the next available location
   
   int theSize(){
      return theCounter;//Displays how many integers are in the array
   }
   
   boolean addSomething(int value){//Methods that adds an integer to the end of the array
       
       if(theNext < 0){//Checks if the array still has space
         makeBigger();
       }
       theArray[theNext] = value;
       theNext = theNext - 1;
       
       theCounter = theCounter + 1;
       
       
       
       return true;
   }
   
   boolean addSomething(int position, int value){//Adds something to any location in the array
      if(theNext < 0){
         makeBigger();
      }
      int i;
      int theBackwardIndex = theBeginning - position;
      int theAdd = theCounter - position;
      for (int x = 0; x < theAdd; x++){//Shifts the contents of the array so that a new value can be inputted without overwriting
         i = x + 1;
         theArray[theNext + x] = theArray[theNext + i];
         
      }
      
      theNext = theNext - 1;
      

  
      theArray[theBackwardIndex] = value;
      theCounter = theCounter + 1;//counts how many integers are in the array
      
      return true;
   }
   
   boolean removeSomething(int position){//removes an integer from the array
      
      theNext = theNext + 1;//shifts the next available location up
      int index;
      int theBackwardIndex = theBeginning - position;
      int theShift = theCounter - position;
      for (int x = -1; x < theShift; x++){//Shifts contents over to replace removed integer
         index = x + 1;
         theArray[theBackwardIndex - x] = theArray[theBackwardIndex - index];
      }
      
      
      
      theCounter = theCounter - 1;//Keeps track of the integers in the array
      
      return true;
   }
   
   int findSomething(int value){//allows the ability to find the location of an integer in the array
       
      int v = theBeginning;
      while(v > theNext){//Loops through the array to find the given value
         if (theArray[v] == value){
            found = arraySize - v;
            break;
            //return found;
         }
      
         else{
            found = -1;
           // return found;
         }
         v--;
      }
      return found;
   }
   
   void showList(){//Displays the contents of the array
   
      
      System.out.print("{");
      for (int x = theBeginning; x > theNext + 1; x--){
         System.out.print(theArray[x] + ", ");
      }
      
      System.out.println(theArray[theNext + 1] + "}");
      
   }
   
   void setNumBoxes(int num){//allows user to set the size of the array
      arraySize = num;
      theArray = new int[arraySize];
      theBeginning = num - 1;
      theNext = theBeginning;
   }
   
   private void makeBigger(){//method that is automatically called to increase the size of the array
      int[] theTempArray = new int[arraySize];
      for(int x = 0; x < theCounter; x++){
         theTempArray[x] = theArray[theBeginning - x];
      }
      count = theBeginning; 
      arraySize = arraySize + arraySize/2;//increments the size by half
      theNext = arraySize - theCounter - 1;//finds new location of next available spot
      theBeginning = arraySize - 1;
      theArray = new int[arraySize];
      for(int x = 0; x < theCounter; x++){
         theArray[theBeginning - x] = theTempArray[x];
      }
      
     
   }

}//ends class
//a book at the end 