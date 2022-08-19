public class Solution {
  public int maxProfit(int[] prices) {
    int buy = 0, max_profit = 0, n = prices.length;
    for (int sell = 1 ; sell < n; sell++) {
      if (prices[sell] > prices[buy]) {
        max_profit = Math.max(max_profit, prices[sell] - prices[buy]);
      } else {
        buy = sell;
      }
    }
    return max_profit;
  }
}
