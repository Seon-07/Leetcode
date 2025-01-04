class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for(int[] account : accounts) {
        	int sum = 0;
        	for(int money : account) {
        		sum += money;
        	}
        	if(result < sum) result = sum;
        }
		return  result;
    }
}