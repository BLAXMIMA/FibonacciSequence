
import java.util.*;
public class FibonacciSequence
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number");
int n=sc.nextInt();
int firstTerm=0;
int secondTerm=1;
System.out.println("Fibonacci Series Upto"+n+":");
while(firstTerm<=n){
System.out.print(firstTerm+" ");
int nextTerm=firstTerm+secondTerm;
firstTerm=secondTerm;
secondTerm=nextTerm;
}
}
}
