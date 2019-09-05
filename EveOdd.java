import java.util.*;
import java.util.Scanner;

class EveOdd
{

public static void main(String args[]){
int diff;
int sum;
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers");
int a=sc.nextInt();
int b=sc.nextInt();

if(a%2==0&&b%2==0)
{
System.out.println("even number");
diff=a-b;
System.out.println(diff);
}
else
{
System.out.println("odd number");
sum=a+b;
System.out.println(sum);
}

}
}