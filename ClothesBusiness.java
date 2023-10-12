public class ClothesBusiness extends GeneralBusiness{
   String companyName;
   String[] itemNames;
   
   public void outputReceipt(){
      total = saleTaxAmount + subtotal;

      System.out.println(companyName);
      System.out.println(lastName + ", " + firstName);
      System.out.println("**********************");
      System.out.printf("Subtotal \t$%.2f\n",subtotal);
      System.out.printf("Sales Tax\t$%.2f\n",saleTaxAmount);
      System.out.printf("Total    \t$%.2f\n",total);
      System.out.println("THANK YOU!");      
   }
   
   public void outputMenu(String[] items){
      itemNames = new String[items.length];
      for(int n = 0; n < items.length; n++){
         itemNames [n] = items [n];
         System.out.println(itemNames[n]);
      }
   } 
   
   public void getCompanyName(){
      System.out.println("What is your Company's Name?");
      companyName = input.next();
   }
}   