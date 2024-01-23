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
        int []array = {1, 8, 4, 6, 5, 21, 3, 4 ,21, 23};

        System.out.println( "Array before sorting : "+Arrays.toString(array) );
        bubbleSort(array);
        System.out.println("Array After sorting : "+Arrays.toString(array));
    }

    static public void bubbleSort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                //swap arr[j] and arr[j+1]
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
