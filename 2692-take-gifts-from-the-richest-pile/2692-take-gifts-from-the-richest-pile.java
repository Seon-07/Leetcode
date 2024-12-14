class Solution {
    public long pickGifts(int[] gifts, int k) {
        List<Long> list = new ArrayList<>();
		for(int n : gifts) {
			list.add((long)n);
		}
		for(int i = 0; i < k; i++) {
			long max = Collections.max(list);
			int idx = list.indexOf(max);
			double num = Math.sqrt(max);
			list.set(idx, (long)num);
		}
		long result = 0;
		for(long n : list) {
			result += n;
		}
		return result;
    }
}