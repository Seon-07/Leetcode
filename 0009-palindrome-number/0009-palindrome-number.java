class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String r_numbers = new StringBuilder(x+"").reverse().toString();
        return (x+"").equals(r_numbers);
    }
}