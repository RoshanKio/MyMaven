package com.takeo;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] arr = {10, 9, 8, 6, 4, 2, -1, 0, -7};
        System.out.println("Original Array : "+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorting Array : "+Arrays.toString(arr));
    }


    static public void bubbleSort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    //swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
