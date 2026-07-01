class Solution {


   public static boolean isAllocationPossible(int[] pages, int k, int maxPagesAllowed) {
       int currentPages = pages[0];
       int requiredStudents = 1;


       for (int i = 1; i < pages.length; i++) {
           currentPages += pages[i];


           if (currentPages > maxPagesAllowed) {
               requiredStudents++;
               currentPages = pages[i];
           }
       }


       return requiredStudents <= k;
   }


   public static int findPages(int[] pages, int k) {
       int n = pages.length;
       if (k>n) return -1;


       int maxSingleBook = pages[0];
       int totalPages = pages[0];


       for (int i = 1; i < n; i++) {
           maxSingleBook = Math.max(maxSingleBook, pages[i]);
           totalPages += pages[i];
       }


       int low = maxSingleBook;
       int high = totalPages;
       int answer = -1;


       while (low <= high) {
           int mid = (low + high) / 2;


           if (isAllocationPossible(pages,k, mid)) {
               answer = mid;
               high = mid - 1;
           } else {
               low = mid + 1;
           }
       }


       return answer;
   }
}

