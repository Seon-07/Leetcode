class Solution {
    public static int numJewelsInStones(String jewels, String stones) {
		int result = 0;
		for(int i = 0; i < jewels.length(); i++) {
			String charStr = jewels.charAt(i)+"";
			if(stones.contains(charStr)) {
				for(int j=0; j < stones.length(); j++) {
					if(charStr.equals(stones.charAt(j)+"")) result ++;
				}
			}
		}
		return result;
    }
}