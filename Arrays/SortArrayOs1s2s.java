import java.util.Arrays;

public class SortArrayOs1s2s {
    // Helper method to swap elements in the array
   private static void swap(int[] nums, int a, int b) {
       int temp = nums[a];
       nums[a] = nums[b];
       nums[b] = temp;
   }


   public static void sortColors(int[] nums) {
       // Dutch National Flag algorithm
       int low = 0, mid = 0, high = nums.length - 1;


       // Loop through the array
       while (mid <= high) {
           if (nums[mid] == 0) {
               // Move 0 to the beginning
               swap(nums, low, mid);
               low++;
               mid++;
           } else if (nums[mid] == 1) {
               // Leave 1 in place
               mid++;
           } else {
               // Move 2 to the end
               swap(nums, mid, high);
               high--;
           }
       }
   }


   public static void main(String[] args) {
       int[] nums = {2, 0, 2, 1, 1, 0};
       sortColors(nums);
       System.out.println("Sorted colors: " + Arrays.toString(nums));
   }
    
}
