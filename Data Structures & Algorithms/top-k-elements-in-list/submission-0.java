class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        Integer[] arr = map.keySet().toArray(new Integer[0]);
        for(int i=0; i<arr.length; i++){
            int maxIndex = i;

            for(int j= i + 1; j < arr.length ; j++){
                if (map.get(arr[j]) > map.get(arr[maxIndex])) {
                    maxIndex = j;
                }
            }
            Integer temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}
