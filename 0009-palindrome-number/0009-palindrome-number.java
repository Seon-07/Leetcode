class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String numbers = x+"";
        for(int i = 0; i < numbers.length()/2; i++) {
        	if(numbers.charAt(i) != numbers.charAt(numbers.length()-1 -i)){
        		return false;
        	};
        }
        return true;
    }
}