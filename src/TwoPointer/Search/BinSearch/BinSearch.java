package TwoPointer.Search.BinSearch;

public class BinSearch {
    public int search(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;
        int count1 =0;
        while (l <= r){

            int mid = (l+r)/2;
                count1++;
            if(arr[mid]==target){

                System.out.println("Steps TwoPointer.Search.BinSearch: " + count1 );
                return mid;
            } else if (arr[mid]<target) {
                l =mid+1;
            }
            else if(arr[mid]>target){
                r=mid-1;
            }
        }
        System.out.println("Steps TwoPointer.Search.BinSearch: " + count1 );
        return -1;
    }
}
