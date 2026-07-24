class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> countMap = new HashMap();
        for (int num:nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        List<int[]> buckets = new ArrayList(nums.length + 1);

        for (Map.Entry<Integer,Integer> entry : countMap.entrySet()) {
            buckets.add(new int[] {entry.getValue(), entry.getKey()});
        }

        buckets.sort((a,b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i = 0; i < k ;i++) {
            res[i] = buckets.get(i)[1];
        }
        return res;





    }
}
