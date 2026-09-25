import java.util.HashMap;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                temp[index++] = num;
                map.put(num, map.get(num) - 1);
            }
        }

        int[] ans = new int[index];

        for (int i = 0; i < index; i++) {
            ans[i] = temp[i];
        }

        return ans;
    }
}