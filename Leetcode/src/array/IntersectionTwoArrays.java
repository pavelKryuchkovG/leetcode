package array;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,3};
        int[] nums2 = new int[]{1,1,2,2};
        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums2).filter(value -> set1.contains(value))
                .boxed()
                .collect(Collectors.toSet()).stream().mapToInt(Integer::intValue).toArray();
    }
}
