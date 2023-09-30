package array;

public class ConcationationOfArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        getConcatenation(nums);
    }

    private static int[] getConcatenation(final int[] nums) {
        int[] answer = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[i];
            answer[i + nums.length] = answer[i];
        }
        return answer;
    }
}
