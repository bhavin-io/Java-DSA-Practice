package TwoPointer;

import TwoPointer.Search.BinSearch.BinSearch;
import TwoPointer.Search.LinSearch.LinSearch;
import TwoPointer.Search.TwoSum.TwoSum;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
//        int [] arr = new int[1000];
        int[] arr = {11,22,33,44,55,66,77,88,99,1200};
        int target = 99;

        BinSearch bns = new BinSearch();
         int result = bns.search(arr,target);
         if(result != -1){
             System.out.println("Result found at :"+result);
         }
         else{
             System.out.println("Not found! "+result);
         }

         LinSearch lns = new LinSearch();
        int result_lns = lns.search(arr,target);
         if(result_lns != -1){
             System.out.println("Result found at :"+result_lns);
         }
         else{
             System.out.println("Not found! "+result_lns);
         }

         TwoSum ts = new TwoSum();
       int[] result_tsm = ts.tsum(arr,target);
         if(result_tsm != null){
             System.out.println("Result found at :"+result_tsm[0]+" "+result_tsm[1]);
         }
         else{
             System.out.println("Not found! "+ Arrays.toString(result_tsm));
         }
    }
}
