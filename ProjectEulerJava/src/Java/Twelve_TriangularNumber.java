package Java;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Kyle on 3/9/2015.
 */
public class Twelve_TriangularNumber {
    private ArrayList<Integer> triangleNumbers = new ArrayList<>(1200);
    private ArrayList<Integer> divisible = new ArrayList<>();

    private void getTriangleNumber() {
        while (triangleNumbers.size() < 1000000) {
            int sum = 0;
            for (int i = 1; i <= triangleNumbers.size() + 1; i++) {
                sum += i;
            }
            triangleNumbers.add(sum);
        }
        Collections.reverse(triangleNumbers);
    }

    private void divisibleByFiveHundredN() {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            int j = 1;
            int count = 0;
            while (j <= (triangleNumbers.get(i) / 2)) {
                if ((triangleNumbers.get(i) % j) == 0) {
                    count++;
                }
                j++;
            }
            if (count > 300) {
                factors.add(triangleNumbers.get(i));
            }
        }
        Collections.reverse(factors);
        System.out.println(factors);
    }

    public static void main(String[] args) {
        Twelve_TriangularNumber driver = new Twelve_TriangularNumber();
        driver.getTriangleNumber();
//        System.out.println(driver.triangleNumbers);
        driver.divisibleByFiveHundredN();
    }
}
