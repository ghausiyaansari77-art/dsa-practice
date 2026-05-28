
import java.util.*;


public class StockBuyAndSell {


   static class Solution {
       public int maxProfit(int[] prices) {
         // Initialize the buying price with the first day's price
       int buy = prices[0];
       int profit = 0;


       // Traverse the array from the second day to the last day
       for (int i = 1; i < prices.length; i++) {
           // If we find a lower price, update the buy value
           if (prices[i] < buy) {
               buy = prices[i];
           }
           // If selling today gives a better profit, update the profit
           else if (prices[i] - buy > profit) {
               profit = prices[i] - buy;
           }
       }
       // Return the maximum profit found
       return profit;


       }
   }


   public static void main(String[] args) {
       // Sample input
       int[] prices = {7, 1, 5, 3, 6, 4};


       Solution sol = new Solution();
       int result = sol.maxProfit(prices);


       System.out.println("Maximum Profit: " + result);
   }
}

