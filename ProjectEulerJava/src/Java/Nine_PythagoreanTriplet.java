package Java;

/**
 * Created by Kyle on 3/8/2015.
 */
public class Nine_PythagoreanTriplet {

    private int[] pythagoreanTriplet() {
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                for (int k = 1; k < 1000; k++) {
                    if ((((i * i) + (j * j)) == (k * k)) && ((i + j + k) == 1000)) {
                        return new int[] {i, j, k};
                    }
                }
            }
        }
        return new int[] {0, 0, 0};
    }
    public static void main(String[] args) {
        Nine_PythagoreanTriplet driver = new Nine_PythagoreanTriplet();
        int[] nums = driver.pythagoreanTriplet();
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
        long number = nums[0] * nums[1] * nums[2];
        System.out.println(number);
    }
}
