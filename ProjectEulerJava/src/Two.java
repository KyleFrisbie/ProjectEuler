import java.util.ArrayList;

/**
 * Created by Kyle on 1/23/2015.
 */
public class Two {
    ArrayList<Integer> fibNums;

    public static void main(String[] args) {
        Two driver = new Two();
        driver.fibNums = new ArrayList<>();
        driver.fibonacci();
        System.out.println(driver.findSum());
    }

    public void fibonacci() {
        int x = 1;
        int y = 2;
        while (x < 4000001) {
            if (x % 2 == 0) {
                fibNums.add(x);
            }
            int temp = x;
            x = y;
            y += temp;
        }
    }

    public int findSum() {
        int total = 0;
        for (int sum : fibNums) {
            total += sum;
        }
        return total;
    }
}