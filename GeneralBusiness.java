/*Ethan Daugherty
Assignment 9
Date completed: 
Total Time Worked on Project: 
Operating System: macOs
Description: 
   */
import java.io.*;
import java.util.Scanner;

class GeneralBusiness{
   double total, subtotal, saleTaxAmount;
   String[] stateNames = new String[5];
   double[] saleTax = new double [5];
   String firstName, lastName;
   int numItems,stateTax;
   Scanner input = new Scanner (System.in);
  
   public void selectSalesTax() throws IOException {
      File inputFile = new File("stateTaxInfo.txt");
      Scanner taxInfo = new Scanner(inputFile);
      int x = 0;
      while(taxInfo.hasNextLine()){
         stateNames[x] = taxInfo.next();
         saleTax[x] = taxInfo.nextDouble();
         x++;
         
      }
      for(int n = 0; n < 5; n++){
         
         System.out.println((n + 1) + " " + stateNames[n]); 
      }
      System.out.println("Type the number of the state you want to use for the tax rate.");
      stateTax = input.nextInt();
      
   }
   
   public void getCustomerName(){
      System.out.println("What is your first name?");
      firstName = input.next();
      System.out.println("What is your last name?");
      lastName = input.next();
   }
   
   public void calcSalesTax(double subtotal){
      
      this.subtotal = subtotal;
      saleTaxAmount = saleTax[stateTax] * subtotal;
   }
   
   public void outputReceipt(){
         total = saleTaxAmount + subtotal;

      System.out.printf("Subtotal \t$%.2f\n",subtotal);
      System.out.printf("Sales Tax\t$%.2f\n",saleTaxAmount);
      System.out.printf("Total    \t$%.2f\n",total);  
   }
   
   public void outputMenu(int numItems){
      for(int n = 0; n < numItems; n++){
         System.out.println("Item " + (n + 1)); 
      }
   }
}   