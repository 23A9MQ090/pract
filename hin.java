package pract;
import java.util.*;
public class hin {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=sc.nextInt();
    }
    int[] x= bubble_sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  static int[] bubble_sort(int arr[]){
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length-i-1; j++) {
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }
    }
    return arr;
  }
}