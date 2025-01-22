package TwoPointer.Search.TwoSum;

public class TwoSum {

    public int[] tsum(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;
        int count = 0;

        while(l<r){
            int diff = arr[l]+arr[r];
            if (diff == target){
                return new int[] {l, r};
            } else if (diff < target) {
                l+=1;
            } else if (diff>target) {
                r-=1;
            }
        }
        return null;
    }
}
