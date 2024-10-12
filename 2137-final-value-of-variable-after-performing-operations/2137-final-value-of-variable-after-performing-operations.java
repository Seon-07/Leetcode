class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
		for(String s: operations) {
			x = (s.contains("-")) ? --x : ++x;
		}
        return x;
    }
}