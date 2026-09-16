// import java.util.*;

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
        
       
//         int[][] arr = new int[n][2];
        
//         for(int i = 0; i < n; i++) {
//             arr[i][0] = nums[i];
//             arr[i][1] = i;
//         }
        
        
//         Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        
//         int left = 0, right = n - 1;
        
//         while(left < right) {
//             int sum = arr[left][0] + arr[right][0];
            
//             if(sum == target) {
//                 return new int[] {arr[left][1], arr[right][1]};
//             }
//             else if(sum < target) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
        
//         return new int[] {};
//     }
// }
import java.util.*;
class Solution{
    public static int[] twoSum(int[] nums , int target){

        int n = nums.length; // gives us array sizeeee
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
        //1st we have to cal required elemn for targetd sum
        int req = target - nums[i];


            if(map.containsKey(req)){
                // if the key contains in map then return arrays that elements index
                return new int[]{map.get(req) , i }; // i is currret i 
            }
            //if not contains key  put op of map and the current array element as key and value is its index
            map.put( nums[i] , i );
        }
          return new int[]{};
    }
}