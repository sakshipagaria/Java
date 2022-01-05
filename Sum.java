import java.util.*;
public class AddTwoNumbers2
{
public static void main(String[] arg) 
{
Scanner in=new Scanner(System.in);
System.out.println("Enter First Number:");
float n1=in.nextFloat();
System.out.println("Enter Second Number:");
float n2=in.nextFloat();

float sum =n1+n2;
float sub =n1-n2;
float mul =n1*n2;
float div =n1/n2;
float mod =n1%n2;


System.out.println("Sum:" + sum);
System.out.println("Differance:" + sum);
System.out.println("Multiplication:" + sum);
System.out.println("Division:" + sum);
System.out.println("Modulus:" + sum);
}
}
