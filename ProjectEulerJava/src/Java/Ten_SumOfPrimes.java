package Java;

import java.math.BigInteger;

/**
 * Created by Kyle on 3/9/2015.
 */
public class Ten_SumOfPrimes {
    private BigInteger nthPrime() {
        BigInteger thisPrime = new BigInteger("1");
        BigInteger sum = new BigInteger("2");
        int i = 0;
        while (thisPrime.nextProbablePrime().longValue() <= 2000000) {
            thisPrime = thisPrime.nextProbablePrime();
//            System.out.println(thisPrime.toString());
            sum = sum.add(thisPrime);
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Ten_SumOfPrimes driver = new Ten_SumOfPrimes();

        System.out.println(driver.nthPrime());
    }

}
