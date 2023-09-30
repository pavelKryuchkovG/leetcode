package array;

public class FindValueAfterOperations {
    public static void main(String[] args) {
        String[] operations = new String[]{"--X","X++","X++"};
        int i = finalValueAfterOperations(operations);
        System.out.println(i);
    }

    public static int finalValueAfterOperations(String[] operations) {
        int valueResult = 0;
        for (int i = 0; i < operations.length; i++) {
            if ("++X".equals(operations[i]) || "X++".equals(operations[i])) {
                valueResult++;
            } else {
                valueResult--;
            }
        }
        return valueResult;
    }
}
