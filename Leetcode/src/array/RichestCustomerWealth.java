package array;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = new int[][]{{1, 2, 3},{3, 2, 1}};
        maximumWealth(accounts);
    }

    public static int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                .mapToInt(value -> Arrays.stream(value).sum())
                .max()
                .getAsInt();

    }
}
