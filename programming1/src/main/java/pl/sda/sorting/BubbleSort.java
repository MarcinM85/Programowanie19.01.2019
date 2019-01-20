package pl.sda.sorting;

import java.util.Arrays;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=nmhjrI-aW5o
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arrayToSort[] = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };

        bubbleSort(arrayToSort);
        System.out.println("sorted arry" + Arrays.toString(arrayToSort));



//        do
//            swapped = false
//
//        for i = 1 to indexOfLastUnsortedElement-1
//
//        if leftElement > rightElement
//
//        swap(leftElement, rightElement)
//
//        swapped = true
//
//        while swapped
    }
    boolean swapped;

    private static void bubbleSort(int[] arrayToSort) {
//        for (int i = 0; i < arr.lenght; i++){
//            for (int j = 0; j < arr.lenght - 1; j++){
//                if (arr[j] > arr[i]){
//
//                }
//            }
//        }
    }
}
