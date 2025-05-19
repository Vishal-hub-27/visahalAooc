import java.util.*;
class isprime
{
public static void main(String args[])
{
int x = Integer.parseInt(args[0]);
int flag = 0;

if(x == 1)
{
System.out.println("1 is not a prime number");
}

 if(x != 1)
{
 for(int i =2;i<x;i++)
 {
 if(x%i == 0)
 {
 flag = 1;
 break;
 }
 }
 }
 if(flag == 0 && x != 1)
 {
 System.out.println(x+" is prime");
 }
 if(flag != 0)
 {
 System.out.println(x+" is not a prime ");
 }
}
}