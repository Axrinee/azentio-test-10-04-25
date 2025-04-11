
// 1. You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

// Example:

// Input: arr[] = [1, 2, 3, 5]
// Output: 4
// Explanation: All the numbers from 1 to 5 are present except 4.

public class missing{
    public static int number(int[] arr, int n){
        int formula = n*(n+1)/2;
        int sum = 0;

        for (int num : arr){
            sum +=num;
        }
        return formula - sum;
    }
    public static void main (String []args){
        int[] arr ={1,2,3,5};
        int n = 5;
        int missing = number (arr , n);
        System.out.println(missing);
    }
}
