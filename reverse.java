package array;
import java.util.*;
public class reverse {
    public static void reverse(int arr[]){
        int first = 0, last = arr.length - 1;
        while (first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first ++;
            last --;

        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr [] = new int [size];
        System.out.println("Enter the elements in array");
        for(int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("The reverse of array is ");
            reverse(arr);
            for(int i =0; i< arr.length ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }


