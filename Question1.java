import java.util.*;
class Question1
{
     static int search(int arr[], int l, int r, int x)
     {
          if (r < l)
             return -1;
          if (arr[l] == x)
             return l;
          return search(arr, l+1, r, x);
     }
    
     public static void main(String[] args) 
     {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the Size of Array : "); 
       int N=s.nextInt();
        int[] arr=new int[N];
       System.out.print("Enter the elements of Array : ");
       for(int i=0;i<N;i++)
        {
          arr[i]=s.nextInt();
        }
       System.out.print("Enter the element to search : ");
       int M=s.nextInt();
        int index = search(arr, 0, N-1, M);
         if (index != -1)
           System.out.println("Element " + M + " is present");
        else
            System.out.println("Element " + M + " is not present");
        }
 }