# PrimeNumber
import java.io.*;
import java.util.*;
class PrimeNumber
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
int N=sc.nextint();
if(N<=1000)
{
for(int i=2;i<=n;i++)
{
if(N%i==0)
{
count++;
}
}
if(count==0)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
}
