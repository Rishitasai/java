import java.math.BigInteger;
import java.util.Scanner;

public class DecimalToBinary {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
    int decimal = scanner.nextInt();
    String binary = Integer.toBinaryString(decimal);
    System.out.println("Binary representation of " + decimal + ": " + binary);

    String reverseBinary = new StringBuilder(binary).reverse().toString();
    System.out.println("Reverse of binary: " + reverseBinary);

    int reverseDecimal = new BigInteger(reverseBinary, 2).intValue();
    System.out.println("Decimal representation of reverse binary: " + reverseDecimal);
    scanner.close();
  }
}
