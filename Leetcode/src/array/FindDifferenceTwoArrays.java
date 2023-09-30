package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDifferenceTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,3};
        int[] nums2 = new int[]{1,1,2,2};
        List<List<Integer>> difference = findDifference(nums1, nums2);
        System.out.println(difference);
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).filter(value -> !set1.contains(value)).boxed().collect(Collectors.toSet());

        Arrays.stream(nums2).forEach(value -> set1.remove(value));
        return Arrays.asList(new ArrayList<>(set1), new ArrayList<>(set2));

    }
}
