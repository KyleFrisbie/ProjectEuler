package Java;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Kyle on 3/7/2015.
 */
public class Three_LargestPrimes {
    final private BigInteger number = new BigInteger("600851475143");

    private ArrayList<BigInteger> findPrimes(BigInteger num) {
        ArrayList<BigInteger> primes = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(num.longValue()); i++) {
            if(num.mod(BigInteger.valueOf(i)).equals(BigInteger.valueOf(0))) {
                if(findPrimes(BigInteger.valueOf(i)).isEmpty()) {
                    primes.add(BigInteger.valueOf(i));
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Three_LargestPrimes driver = new Three_LargestPrimes();
        ArrayList<BigInteger> primes = driver.findPrimes(driver.number);
        System.out.println(primes);
    }
}
