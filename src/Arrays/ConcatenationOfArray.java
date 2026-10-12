package Arrays; /**
 1929. Concatenation of Array

 Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

 Specifically, ans is the concatenation of two nums arrays.

 Return the array ans.



 Example 1:

 Input: nums = [1,2,1]
 Output: [1,2,1,1,2,1]
 Explanation: The array ans is formed as follows:
 - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
 - ans = [1,2,1,1,2,1]
 Example 2:

 Input: nums = [1,3,2,1]
 Output: [1,3,2,1,1,3,2,1]
 Explanation: The array ans is formed as follows:
 - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
 - ans = [1,3,2,1,1,3,2,1]

 **/

import java.util.Scanner;

public class ConcatenationOfArray {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        int[] concArr =new int[size*2];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size ; i++)
            arr[i] = in.nextInt();

        ConcatenationOfArray array = new ConcatenationOfArray();

        array.concatenateArray(arr, concArr);

        System.out.print("Original Array: ");
        array.printArray(arr);

        System.out.print("Concatenated Array: ");
        array.printArray(concArr);


    }

    public void concatenateArray(int[] arr, int[] concArr){
        for(int i = 0 ; i < arr.length ; i++){
            concArr[i] = arr[i];
            concArr[arr.length+i] = arr[i];
        }
    }

    public void printArray(int[] arr){
        for (int i = 0 ; i < arr.length ; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
