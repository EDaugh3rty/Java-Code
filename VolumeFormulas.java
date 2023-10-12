/*Ethan Daugherty
Assignment 4
Date completed: October 15, 2021
Total Time Worked on Project: 1 hour
Operating System: macOs
Description: 
   This is a class that you can send numbers to and receive a volume of a certain object.*/

class VolumeFormulas {
   //global variables 
   private  double radius, height;
   private  double four = 4;
   private  double three = 3;
   
   //no arg constructor
   VolumeFormulas() {
   }

   VolumeFormulas(double num1){//constructor that recieves one value
      radius = num1;
   }
   
   VolumeFormulas(double num1, double num2){//constructor that receives two values
      radius = num1;
      height = num2;
   }
   
   double cylinderVolume(double radius, double height){//method that finds the volume of a cylinder
      double volume;
      
      volume = Math.PI*(radius*radius)*height;
      
      return volume;
   }
   
   double cylinderVolume(){
      double volume;
      
      volume = Math.PI*(radius*radius)*height;
      
      return volume;
   }
   
   double coneVolume(double radius, double height){//method that finds the volume of a cone
      double volume;
      
      volume = Math.PI*(radius*radius)*(height/3);
      
      return volume;
   }
   
   double coneVolume(){
      double volume;
      
      volume = Math.PI*(radius*radius)*(height/3);
      
      return volume;
   }

   double sphereVolume(double radius){//method that finds the volume of a sphere
      double volume;
      
      
      volume = four/three*(Math.PI*(radius*radius*radius));
      
      return volume;
   }
   
   double sphereVolume(){
      double volume;
      
      volume = four/three*(Math.PI*(radius*radius*radius));
      
      return volume;
   }
         
}//ends class