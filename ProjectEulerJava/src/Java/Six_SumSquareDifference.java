package Java;

/**
 * Created by Kyle on 3/8/2015.
 */
public class Six_SumSquareDifference {
    private long sumSquareDifference() {
        long sumOfSquares = 0;
        long squareOfSums = 0;
        for (int i = 1; i < 101; i++) {
            sumOfSquares += i * i;
            squareOfSums += i;
        }
        return (squareOfSums * squareOfSums) - sumOfSquares;
    }

    public static void main(String[] args) {
        Six_SumSquareDifference driver = new Six_SumSquareDifference();
        System.out.println(driver.sumSquareDifference());
    }
}
