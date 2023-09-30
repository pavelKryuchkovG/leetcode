package array;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2,5,1,3,4,7};
        int[] shuffle = shuffle(nums1, 3);
        System.out.println(Arrays.toString(shuffle));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length; i = i + 2) {
            result[i] = nums[j];
            result[i + 1] = nums[n];
            j++;
            n++;
        }
        return result;
    }
}
