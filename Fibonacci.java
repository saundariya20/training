package com.cg.Fibonaci;
import java.util.*;


public class Fibonacci {
static void fib(int N)
{
int sum=1;
int a=0,b=1;
while (sum <= N)
{
System.out.print(sum + " ");
a=b;
b=sum;
sum = a+b;
}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input: ");
    int N = sc.nextInt();
fib(N);
}



}