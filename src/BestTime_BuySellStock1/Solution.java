package BestTime_BuySellStock1;

class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length<=0){
            return 0;
        }

        int lowStockPrice=prices[0];
        int maxProfit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]<lowStockPrice){
                lowStockPrice=prices[i];
            }else{
                int diff=prices[i]-lowStockPrice;
                if(diff>maxProfit){
                    maxProfit=diff;
                }
            }
        }
        return maxProfit;
    }
}
