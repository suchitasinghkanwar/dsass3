import java.util.*;
class Question3
{ 
    static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    else    
    return fib(n-1) + fib(n-2); 
    } 
       
    public static void main (String args[]) 
    { 
    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    System.out.println(fib(N)); 
    } 
} 