import java.util.Arrays; 
public class KadanesAlgorithm {
     // Function to find the maximum subarray sum using Kadane's Algorithm
   public static int maxSubArray(int[] nums) {
       int n = nums.length;  // Length of the input array
       int currSum = nums[0];  // Initialize current subarray sum with the first element
       int maxSum = nums[0];   // Initialize the maximum subarray sum with the first element
      
       // Iterate through the array starting from the second element
       for (int i = 1; i < n; i++) {
           // Update currSum by either adding the current element to the subarray or starting a new subarray
           currSum = Math.max(currSum + nums[i], nums[i]);
           // Update maxSum with the larger of maxSum and currSum
           maxSum = Math.max(maxSum, currSum);
       }
       return maxSum;  // Return the maximum subarray sum found
   }


   public static void main(String[] args) {
       // Test case: Define an array of integers
       int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
      
       // Call the maxSubArray function and store the result
       int result = maxSubArray(nums);
      
       // Output the result
       System.out.println("The maximum subarray sum is: " + result); 
      // Expected output: 6
   }
    
}
