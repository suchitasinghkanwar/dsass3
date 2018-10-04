import java.util.*;
class Question2 {
static void reverse(int arr[],int i, int j)
{
  int temp;        
  if(i < j)
  {
    temp = arr[i]; 
    arr[i] = arr[j];
    arr[j] = temp;
    reverse(arr, ++i, --j);
  } 
}     
 public static void main(String args[]) {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the Size of Array : "); 
       int N=s.nextInt();
        int[] arr=new int[N];
       System.out.print("Enter the elements of Array : ");
       for(int i=0;i<N;i++)
        {
          arr[i]=s.nextInt();
        }  
        reverse(arr, 0, N-1);
        System.out.print("Reversed array is \n");
        System.out.println(Arrays.toString(arr)); 
        
    }
}