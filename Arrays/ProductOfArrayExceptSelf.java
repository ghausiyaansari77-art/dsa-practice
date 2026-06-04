public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Calculate the product of all elements to the left of each index
        result[0] = 1; // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        
        // Calculate the product of all elements to the right of each index
        int rightProduct = 1; // No elements to the right of the last element
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct; // Multiply with the left product
            rightProduct *= nums[i]; // Update right product for the next iteration
        }
        
        return result;
    }
    
}
