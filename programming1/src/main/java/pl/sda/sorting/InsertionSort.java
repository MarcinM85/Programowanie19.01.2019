package pl.sda.sorting;

import java.util.Arrays;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=OGzPmgsI-pQ
 */
public class InsertionSort {
    public static void main(String[] args) {
        int arrayToSort[] = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
        insertionSort(arrayToSort);
        System.out.println("sorted arry" + Arrays.toString(arrayToSort));
    }

    private static void insertionSort(int[] arrayToSort) {

        for (int i = 0; i < arrayToSort.length; i++){
            for (int j = i + 1; j < arrayToSort.length; j++){
//                if (arrayToSort[j] < arrayToSort[]){
//
//                }
            }

        }

    }
}
