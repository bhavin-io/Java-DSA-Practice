package Sorting.Bubble;

public class BubbleSort {

    public void sort(int[] arr) {
    int i,j,temp = 0;
    int ar_size = arr.length;

    for (i=0;i<ar_size;i++){
        for (j=0;j<ar_size-i-1;j++){
            if (arr[j]>arr[j+1]){
                //swaps
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println();
        for (int n : arr){
            System.out.print(n +" ");
        }
    }
    }
}
