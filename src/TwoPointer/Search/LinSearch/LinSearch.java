package TwoPointer.Search.LinSearch;

public class LinSearch {

    public int search(int[] arr, int target) {
        int count=0;
        for(int i = 0; i <= arr.length-1;i++){
            count ++;
           if(arr[i] == target){

                System.out.println("Steps TwoPointer.Search.LinSearch: " + count );

               return i;

           }
        }
            System.out.println("Steps TwoPointer.Search.LinSearch: " + count );
        return -1;
    }
}
