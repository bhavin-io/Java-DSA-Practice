package Sorting;

import Sorting.Bubble.BubbleSort;
import Sorting.Quick.QuickSort;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {99,88,77,66,55,44,33,22,11,00};

        BubbleSort bs = new BubbleSort();
        bs.sort(arr);

        QuickSort qs = new QuickSort();
        int low = 0;
        int high = arr.length-1;
        qs.sort(arr,low,high);
        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
