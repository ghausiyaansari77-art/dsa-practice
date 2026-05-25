import java.util.*;


class Solution {
   public int majorityElement(int[] nums) {
       int n = nums.length;
       int count = 1;
       int majority = nums[0]; // Assume first element as candidate


       // Phase 1: Find potential majority candidate
       for (int i = 1; i < n; i++) {
           if (nums[i] == majority) {
               count++;
           } else {
               count--;
               if (count == 0) {
                   majority = nums[i];
                   count = 1;
               }
           }
       }


       // Phase 2: Verify the candidate
       count = 0;
       for (int i = 0; i < n; i++) {
           if (nums[i] == majority) {
               count++;
           }
       }


       // Return the element if it occurs more than n/2 times
       if (count > n / 2)
           return majority;
       else
           return -1; // No majority element found
   }


   public static void main(String[] args) {
       // Hardcoded input array
       int[] nums = {2, 2, 1, 1, 2, 2, 2};


       // Create Solution object and call the method
       Solution sol = new Solution();
       int result = sol.majorityElement(nums);


       // Print result
       if (result != -1)
           System.out.println("Majority element is: " + result);
       else
           System.out.println("No majority element found.");
   }
}