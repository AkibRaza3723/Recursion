import java.util.*;

public class first {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,4,9,10,25};
        System.out.println(sorted(arr));
        System.out.println(linear(arr, 0, 4));
        linearAll(arr, 0, 4);
        System.out.println(list);
    }   

    // Sorted Array 
    static boolean sorted(int[] arr){
        return helper(arr, 0);
    }
    private static boolean helper(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return helper(arr, index+1);
        }else{
            return false;
        }
    }

    // linear Search 
    static int linear(int[] arr, int index, int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return linear(arr, index+1, target);
        }
    }// to remove providing index you can use helper function.
    // if you want all the matched targets use : array list
    static ArrayList<Integer> list = new ArrayList<>();
    static void linearAll(int[] arr, int index, int target){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        linearAll(arr, index+1, target);
    }
    // creating an Arrylist to every time we find a target and return it at the end of the function. with a check to see that if the list contains any elements or not.
    static ArrayList<Integer> linearAll2(int[] arr, int index, int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> comingdata = linearAll2(arr, index+1, target);
        // this will execute when the stack is emptying.
        list.addAll(comingdata);
        return list;
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        // Check if the left half is sorted
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }

        // Otherwise, the right half must be sorted
        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m + 1, e);
        }

        return search(arr, target, s, m - 1);
    }
}