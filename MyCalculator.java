class MyCalculator {
   // global class variables
  private static int count = 0;
  double data1, data2;
  
  
   // no-arg constructor
   MyCalculator() {
   }
   
   MyCalculator(double num1, double num2){
      data1 = num1;
      data2 = num2;
   }
   
   
   int displayCount(){
      return count;
   }
   // method that receives two double values and adds them together
   double addThem(double valueOne, double valueTwo) {
      double result;
            
      result = valueOne + valueTwo;
      
      count++;
      return result;
   }
   
   double addThem() {
      double result;
            
      result = data1 + data2;
      
      count++;
      return result;
   }
   
   // method that receives two double values and subtracts the second one from the first one
   double subtractThem(double valueOne, double valueTwo) {
      double result;
      
      result = valueOne - valueTwo;
      
      count++;
      return result;
   }
   
   // method that receives two double values and multiplies them together
   double multiplyThem(double valueOne, double valueTwo) {
      double result;
      
      result = valueOne * valueTwo;
      
      count++;
      return result;
   }
   
   // method that receives two double values and divides the first one from the second one
   double divideThem(double valueOne, double valueTwo) {
      double result;
      
      
      result = valueOne / valueTwo;
      
      count++;
      return result;
   }
}// end of the class