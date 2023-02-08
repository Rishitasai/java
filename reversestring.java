import java.util.Scanner;
class reversestring
{
public static void main(String args[])
{
String s;
Scanner sc=new Scanner(System.in);
System.out.print("enter a string");
s=sc.nextLine();
System.out.print("After reversing the string");
int i=s.length();
while(i>0)
{
System.out.print(s.charAt(i-1));
i--;
}
}
}
