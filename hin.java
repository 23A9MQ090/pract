package pract;
import java.util.*;
public class hin {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size");
    int size=sc.nextInt();
    int arr[]= new int[size];
    for (int i = 0; i < arr.length; i++) {
       arr[i]=sc.nextInt();
    }
    System.out.println("Enter a target");
    int target=sc.nextInt();
   System.out.println( linear_search(arr, target));
  }
  static int linear_search(int arr[],int target){
            for (int i = 0; i < arr.length; i++) {
              if (arr[i]==target) {
                return i;
              }
            }
            return -1;
  }
}