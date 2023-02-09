import java.util.Scanner;

public class DigitalSum {

   // method to find sum of digits
   // of a given number
   public static int sumOfDigits(int number) {

      // declare variables
      int lastDigit = 0;
      int sum = 0;

      // loop to repeat the process
      while(number != 0) {
         // find last digit
         lastDigit = number % 10;
         // add last digit to sum
         sum = sum + lastDigit;
         // remove last digit
         number = number / 10;
      }

      // sum value is the sum of digits
      // of the given number
      return sum;
  }

  // method to find digital sum
  public static int digitalSum(int number) {
     int result = number;
     while(result / 10 != 0) {
	   result = sumOfDigits(result);
     }
     return result;
  }

  public static void main(String[] args) {

      // declare variables
      int number = 0;
      int sumOfDigitsUntilSingle = 0;

      // create Scanner class object 
      // for reading the values
      Scanner scan =  new Scanner(System.in);
      // read inputs
      System.out.print("Enter an integer number:: ");
      number = scan.nextInt();

      // find sum of digits of number
      sumOfDigitsUntilSingle = digitalSum(number);

      // display result
      System.out.println("The sum of digits until" +
         " single digit of the number "+number+
         " = "+sumOfDigitsUntilSingle);

      // close Scanner class object
      scan.close();
  }
}
