package array;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int[] nums = new int[]{0,2,1,5,3,4};
        int[] ints = buildArray(nums);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] buildArray(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i =0; i<nums.length; i++) {
            answer[i] = nums[nums[i]];
        }
        return answer;
    }
}
