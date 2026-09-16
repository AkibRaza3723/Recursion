import java.util.*;

public class first {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(fibo(6));
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // System.out.println(binarySearch(arr, 7, 0, arr.length-1));
        // fun(6);
        System.out.println(" ");
        System.out.println(fun2(5));
        System.out.println(" ");
        System.out.println(prodofdigits(158));
        reverse(1234);
        System.out.println(sum);
        
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

    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static int fun2(int n){
        if(n<=1){
            return 1;
        }
        return n * fun2(n-1);
    }

    static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumofdigits(n/10);
    }
    static int prodofdigits(int n){
        // if(n==0){
        //     return 1;
        // } // last function will return 1 so if we hv zero in between it will result in giving wrong output.
        if(n%10==n){
            return n;
        }// check for the last left digit.
        return n%10 * prodofdigits(n/10);
    }

    static int sum = 0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem; 
        reverse(n/10);
    }// here we are using an external variable to store the sum

    static int reverse2(int n){
    // sometimes you need some additional variables in the argument 
    // in that case, make another function.
        int digits = (int)(Math.log10(n))+1; // to get total no. of digits
        return helper(n,digits);
    }
    private static int helper(int n, int digits){
        if(n%10==n) return n;
        int rem = n % 10;
        return (int)(rem * Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }// now using this helper function you can get the ans without creating an extra varible.

    static int count(int n){
        return helper2(n,0);
    }
    private static int helper2(int n, int count){
        if(n==0){
            return count;
        }
        int rem = n % 10;
        if (rem%2==0){
            count++;
            return helper2(n/10, count+1);
        }
        return helper2(n/10, count);   
    }
} 
