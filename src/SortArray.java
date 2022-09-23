public class SortArray {
    public static void main(String[] args) {
        double[] nums = {-8.6, 4.5, 5.8, 5.9, -6.2, 9.6, -6.4, 4.7, -3.5, 8.6, 5.3, -2.8, -6.2, 5.5, -5.3};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                for (double a : nums) {
                    System.out.println(nums[i] / 8);
                    break;
                }
            }
        }
    }
    public static void hello() {

        int[] num = {-4, -2, 2, 3, 6, 8};
        for (int i = 0; i < num.length; i++) {
            int min = num[i];
            int max = i;

            for (int j = 0; j < num.length; j++) {

                if (num[j] < min) ;

                min = num[i];
                max = j;
                if (i != max) {
                    int tmp = num[i];
                    num[i] = num[max];
                    num[max] = tmp;
                }
            }
        }
    }
}