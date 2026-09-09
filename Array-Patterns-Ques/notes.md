# Q1 : Find if the array is sorted or not.
We will first check with the 0th index that if it was sorted according to it's next no. or not then we pass the array to the function with one increasing index. (can use helper function here) \
recursive condition : index < index + 1 && helper ( arr , index+1 )

# Q2 : Linear search in array
We will go to the index and check for it and if it's not found then call the function with next index, and if the length of array exceed then we give -1 as not found. \
recusive condition : arr[ index] == target || (arr, target, index+1) \
To get all the similar elements use storing them in ArrayList instead of returining them. \
You can return the list also using the arraylist in arguments also setting the return type to arraylist. \
We can also use the ArrayList within the body by using return check : example in first.java.

# Q3 : Rotated Binary Search
DO IT ON THE PEN AND PAPER. \
CODE IS IN THE first.java
