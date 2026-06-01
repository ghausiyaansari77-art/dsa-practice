class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int rows = matrix.length;
      int cols = matrix[0].length;
      int start = 0;
      int end = rows-1;
      while(start<=end){
        int mid = start + (end - start)/2;
        if(target>= matrix[mid][0] && target <= matrix[mid][cols-1]){
            return
            binarySearch(matrix[mid] , target);
        }else if(target > matrix[mid][cols-1]){
            start = mid +1;
        }else{
            end = mid-1;
        }
      }
      return false;

    }
    private boolean binarySearch(int[] arr , int target){
        int left = 0 , right = arr.length -1;
        while(left <= right){
            int mid = left +(right - left)/2;
            if(arr[mid] == target)
            return true;
            else if(arr[mid]<target) left = mid+1;
            else right = mid-1;
        }
        return false;
    }
}

