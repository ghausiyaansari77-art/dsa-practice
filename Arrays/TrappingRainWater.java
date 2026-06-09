class Solution {
   public int trap(int[] height) {
       int n = height.length;
      
       int ans = 0;
       int lmax = height[0];  // Maximum height on the left
       int rmax = height[n - 1];  // Maximum height on the right
       int low = 1;  // Pointer from the left
       int high = n - 2;  // Pointer from the right


       while (low <= high) {
           lmax = Math.max(lmax, height[low]);
           rmax = Math.max(rmax, height[high]);


           if (lmax < rmax) {
               ans += lmax - height[low];
               low++;
           } else {
               ans += rmax - height[high];
               high--;
           }
       }
       return ans;
   }
}




