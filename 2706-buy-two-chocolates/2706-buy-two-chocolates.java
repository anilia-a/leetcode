class Solution {
    public int buyChoco(int[] prices, int money) {
        int minimum = prices[0] + prices[1];
        for(int i = 0; i < prices.length - 1; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                if((prices[i] + prices[j] < minimum) && (prices[i] + prices[j] <= money)) {
                    minimum = prices[i] + prices[j];
                }
            }
        }
        int leftover = money - minimum;
        if(leftover >= 0) return leftover;
        else return money;

    }
}