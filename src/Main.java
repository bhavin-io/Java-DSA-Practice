//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int nums[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int target = 2;

        int result = BinSearch(nums,target);
        if(result !=-1){
            System.out.println("Result: " + result);
        }
        else{
            System.out.println("Not Found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        for(int i=0; i<nums.length;i++){
            if (nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static int BinSearch(int[] nums, int target) {
       int l = 0;
       int r =nums.length -1;
       while(l<r){
           int mid = (l+r)/2;
           if (nums[mid] == target){
               return mid;
           } else if (nums[mid]<target) {
               l = mid+1;
           } else if (nums[mid]>target) {
               r=mid-1;
           }
           else{
               return -1;
           }
       }

        return -1;
    }
}