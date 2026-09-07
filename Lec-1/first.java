import java.util.*;

public class first {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(fibo(6));
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 7, 0, arr.length-1));
    }

    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    // n==0 || n==1 why is this giving wrong output
    // first the tree will go left and execute the left side of the tree and then it will go to the right side of the tree and execute the right side of the tree. (first fibo(n-1) side will execute and when it finish and come to the flow then the fibo(n-2) will execute)

    public static int binarySearch(int[] arr, int target, int left, int right){
        if(left>right){
            return -1;
        }
        int mid = left + (right-left)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binarySearch(arr, target, left, mid-1);
        }
        else{
            return binarySearch(arr, target, mid+1, right);
        }
    } // we didn't pass the middle value in the argument cause it's not beneficial for the next function calling.
    // make sure to return the result of a function call, if you are calling a recursive function in a function.
} 
