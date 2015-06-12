package Java;

/**
 * Created by Kyle on 3/8/2015.
 */
public class Five_LowestMultiple {
    private int dividesEvenlyByAll() {
        for (int i = 20; ; i += 20) {
            boolean divisibleByAll = true;
            for (int j = 1; j < 20; j++) {
                if ((i % j) != 0) {
                    divisibleByAll = false;
                    break;
                }
            }
            if(divisibleByAll) {
                return i;
            }
        }
    }

    public static void main(String[] args) {
        Five_LowestMultiple driver = new Five_LowestMultiple();
        System.out.println(driver.dividesEvenlyByAll());
    }
}
