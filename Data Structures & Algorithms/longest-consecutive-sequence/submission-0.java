class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> n = new HashSet();
        for (int num : nums) {
            n.add(num);
        }

        int maxLen = 0;
        for (int num : n) {
            if (n.contains(num-1)) continue;
            int currLen = 1, tmp = num+1;
            while (n.contains(tmp++)) {
                currLen++;
            }
            maxLen = Math.max(currLen, maxLen);
        }

        return maxLen;
    }
}
