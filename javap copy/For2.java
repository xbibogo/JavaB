package javap;

public class For2
{
   public static void main(String[] args)
   {
      int total = 0;

      // total even integers from 2 through 20
      for (int number = 2; number <= 20; number += 2)
         total += number;

      System.out.printf("Sum is %d%n", total);
   } 
} // end class Sum

