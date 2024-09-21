class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int o_number = x;
        int r_number = 0;
        while(x != 0) {
        	int e = x % 10;
        	r_number = (r_number * 10) + e;
        	x /= 10;
        }
        return o_number == r_number;
    }
}