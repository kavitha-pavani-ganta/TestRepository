import java.util.Scanner;
class Greater
{

public static void main(String args[]){
int diff;
int sum;
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers");
int a=sc.nextInt();
int b=sc.nextInt();

if(a>b)
{

diff=a-b;
System.out.println(diff);
}
else
{
sum=a+b;
System.out.println(sum);
}

}
}