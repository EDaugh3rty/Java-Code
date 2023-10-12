import java.util.Scanner;

public class TheAverage{

   public static void main(String[] args){
      int num1, num2, num3, theSum;
      double theAvg; 
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter your first positive integer.");
      num1 = keyboard.nextInt();
      
      System.out.println("Enter your second positive integer.");
      num2 = keyboard.nextInt();
      
      System.out.println("Enter your third positive integer.");
      num3 = keyboard.nextInt();
      
      theSum = num1 + num2 + num3;
      
      theAvg = theSum/3.0;
      
      System.out.printf("The average is %.3f", theAvg);//alllows you to control the output of decimals
   }//ends main method
}//ends the class