/*AIM: Program to learn different types of inheritance in java.

Objective: To study the execution of inheritance and its different types.

*/

class Animal{

   void walk()
{
         System.out.println("I am walking");

}
}

class Bird extends Animal

{

   void fly()
   {
       System.out.println("I am flying");
   }
   void sing()
{
        System.out.println("I am singing");
}
}


public class Solution

{

   public static void main(String[] args)

   {

     Bird bird = new Bird();

     bird.walk();

     bird.fly();

     bird.sing();

   }

}