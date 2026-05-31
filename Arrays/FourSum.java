
import java.util.*;


class Solution {
   public List<List<Integer>> fourSum(int[] nums, int target) {
       int n = nums.length;
       Arrays.sort(nums); // Step 1: Sort the array
       List<List<Integer>> result = new ArrayList<>();


       // Loop for the first number
       for (int first = 0; first < n - 3; first++) {
           if (first > 0 && nums[first] == nums[first - 1]) continue; // Skip duplicates


           // Loop for the second number
           for (int second = first + 1; second < n - 2; second++) {
               if (second > first + 1 && nums[second] == nums[second - 1]) continue; // Skip duplicates


               long remainingTarget = (long)target - nums[first] - nums[second];
               int left = second + 1, right = n - 1;


               // Two-pointer search for remaining two numbers
               while (left < right) {
                   int sum = nums[left] + nums[right];


                   if (sum < remainingTarget) {
                       left++;
                   } else if (sum > remainingTarget) {
                       right--;
                   } else {
                       result.add(Arrays.asList(nums[first], nums[second], nums[left], nums[right]));


                       // Skip duplicates
                       int prevLeft = nums[left], prevRight = nums[right];
                       while (left < right && nums[left] == prevLeft) left++;
                       while (left < right && nums[right] == prevRight) right--;
                   }
               }
           }
       }


       return result;
   }


   // Main method
   public static void main(String[] args) {
       Solution sol = new Solution();
       int[] nums = {1, 0, -1, 0, -2, 2};
       int target = 0;


       List<List<Integer>> result = sol.fourSum(nums, target);


       System.out.println("Quadruplets summing to " + target + ":");
       for (List<Integer> quad : result) {
           System.out.println(quad);
       }
   }
}

