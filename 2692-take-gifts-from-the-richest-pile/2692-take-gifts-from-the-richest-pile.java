class Solution {
    public long pickGifts(int[] gifts, int k) {
        List<Long> list = new ArrayList<>();
		long result = 0;
		for(int n : gifts) {
			list.add((long)n);
			result += n;
		}
		for(int i = 0; i < k; i++) {
			long max = Collections.max(list);
			int idx = list.indexOf(max);
			double num = Math.sqrt(max);
			list.set(idx, (long)num);
			result -= (max-num);
		}
		return result;
    }
}