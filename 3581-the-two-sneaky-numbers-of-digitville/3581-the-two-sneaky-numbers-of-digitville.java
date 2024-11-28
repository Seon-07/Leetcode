class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        int[] result = new int[2];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]) result[index++] = nums[i];
        }
        return result;
    }
}