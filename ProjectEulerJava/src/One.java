import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kyle on 1/22/2015.
 */
public class One {
    private ArrayList<Integer> threes = new ArrayList();
    private int threeCount = 0;
    private ArrayList<Integer> fives = new ArrayList();
    private int fiveCount = 0;
    private int sum = 0;

    public static void main(String[] args) {
        One driver = new One();
        int max = driver.getMax();
        for (int i = 1; i < max; i++) {
            if (i % 3 == 0) {
                driver.threes.add(i);
                driver.threeCount++;
                continue;
            }

            if (i % 5 == 0) {
                driver.fives.add(i);
                driver.fiveCount++;
            }
        }

        while (!driver.threes.isEmpty()) {
            driver.sum += driver.threes.remove(driver.threes.size() - 1);
        }

        while (!driver.fives.isEmpty()) {
            driver.sum += driver.fives.remove(driver.fives.size() - 1);
        }

        System.out.println(driver.sum);
    }

    public int getMax() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter maximum: ");
        return kb.nextInt();
    }
}
