package array;

import java.util.HashMap;

public class NumberGoodPars {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1,1,6,3};
        numIdenticalPairs(nums);
    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> pair = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (pair.containsKey(nums[i])) {
                Integer count = pair.get(nums[i]);
                ans += count;
                pair.put(nums[i], count+1);
            } else {
                pair.put(nums[i], 1);
            }
        }
        return ans;
    }
}
