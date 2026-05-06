package leetcode-style;

import java.util.Arrays;

/**
 * Basic Array Problems
 * Topics: Array manipulation, searching, sorting
 */
public class BasicArrayProblems {
    
    public static void main(String[] args) {
        System.out.println("=== ARRAY PROBLEMS ===\n");
        
        System.out.println("1. Find Maximum Element");
        int[] arr1 = {5, 2, 8, 1, 9, 3};
        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println("Maximum: " + findMax(arr1) + "\n");
        
        System.out.println("2. Find Minimum Element");
        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println("Minimum: " + findMin(arr1) + "\n");
        
        System.out.println("3. Array Sum");
        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println("Sum: " + arraySum(arr1) + "\n");
        
        System.out.println("4. Array Average");
        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println("Average: " + String.format("%.2f", arrayAverage(arr1)) + "\n");
        
        System.out.println("5. Linear Search");
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println("Array: " + Arrays.toString(arr2));
        System.out.println("Search 30: Index = " + linearSearch(arr2, 30) + "\n");
        
        System.out.println("6. Binary Search");
        int[] arr3 = {5, 10, 15, 20, 25, 30};
        System.out.println("Sorted Array: " + Arrays.toString(arr3));
        System.out.println("Search 20: Index = " + binarySearch(arr3, 20) + "\n");
        
        System.out.println("7. Reverse Array");
        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println("Original: " + Arrays.toString(arr4));
        reverseArray(arr4);
        System.out.println("Reversed: " + Arrays.toString(arr4) + "\n");
    }
    
    // Find maximum element
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
    
    // Find minimum element
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
    
    // Calculate sum
    static int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    // Calculate average
    static double arrayAverage(int[] arr) {
        return (double) arraySum(arr) / arr.length;
    }
    
    // Linear search
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    
    // Binary search
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    
    // Reverse array
    static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
