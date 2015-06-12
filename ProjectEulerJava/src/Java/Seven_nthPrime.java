package Java;

import java.math.BigInteger;

/**
 * Created by Kyle on 3/8/2015.
 */
public class Seven_nthPrime {
    private BigInteger nthPrime() {
        BigInteger thisPrime = new BigInteger("1");
        int i = 0;
        while (i <10001) {
            thisPrime = thisPrime.nextProbablePrime();
            i++;
        }
        return thisPrime;
    }

    public static void main(String[] args) {
        Seven_nthPrime driver = new Seven_nthPrime();

        System.out.println(driver.nthPrime());
    }
}
