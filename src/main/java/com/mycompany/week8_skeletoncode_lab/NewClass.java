package com.mycompany.week8_skeletoncode_lab;
//com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author itlabs
 */
public class NewClass {

    public int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[12];
        int k = 0;
        int low = 0;
        int high = 5;
        
        NewClass nc = new NewClass();
        System.out.println(nc.runBinarySearchIteratively(arr, k, low, high));
    }
    // provide time and space analysis 

}
