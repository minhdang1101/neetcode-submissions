class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < m ; i++){
            list.add(nums1[i]);
        }
        for(int j = 0; j < n ; j++){
            list.add(nums2[j]);
        }

        Collections.sort(list);

        for(int z = 0; z < list.size(); z++){
            nums1[z] = list.get(z);
        }
    }
}