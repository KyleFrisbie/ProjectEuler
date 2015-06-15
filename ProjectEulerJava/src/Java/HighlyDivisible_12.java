package Java;

import java.util.ArrayList;

/**
 * Created by Kyle on 5/19/2015.
 */
public class HighlyDivisible_12 {
    private ArrayList<Integer> naturalNums = new ArrayList<>(1000);
    private ArrayList<Integer> triangleNums = new ArrayList<>();

    private void generateArrayList() {
        for (int i = 1; i < 50000000; i++) {
            naturalNums.add(i);
            setSum(i);
        }
    }

    private void setSum(int nextNum) {
        if(triangleNums.size() > 0) {
            triangleNums.add(triangleNums.get(triangleNums.size() - 1) + nextNum);
        } else {
            triangleNums.add(nextNum);
        }
    }

    private int numberOfDivisiors() {
        int divisors = 0;
        int targetNum = triangleNums.get(triangleNums.size() - 1);
        for (int i = 0; i < naturalNums.size(); i++) {
            if((targetNum % naturalNums.get(i)) == 0) {
                divisors++;
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        HighlyDivisible_12 twelve = new HighlyDivisible_12();
        twelve.generateArrayList();
        System.out.println(twelve.numberOfDivisiors());
    }
}