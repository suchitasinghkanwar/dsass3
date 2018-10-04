import java.util.*;
class Question5{
static int add(int n)
    { 
        if (n == 0)
            return 0;
        return (n % 10 + add(n / 10));
    }
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Enter the Number : ");
String str =s.next();
int y=Integer.parseInt(str);
int SUM=add(y);
System.out.print("Sum of Digit is : " + SUM);
}
}