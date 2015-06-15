package Java;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Kyle on 3/8/2015.
 */
public class Four_PalindromeProduct {
    private boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        String firstHalf = "";
        String secondHalf = "";
        for (int i = 0; i <= str.length()/2; i++) {
            firstHalf += str.charAt(i);
//            System.out.println(firstHalf);
        }
        for (int i = 0; i <= str.length()/2; i++) {
            secondHalf += str.charAt(str.length() - 1 - i);
//            System.out.println(secondHalf);
        }
        if(firstHalf.equals(secondHalf)) {
            return true;
        }
        return false;
    }

    private ArrayList<Integer> largestPalindrome() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
//                System.out.println(i + " " + j);
                if (isPalindrome(j * i)) {
                    numbers.add((i * j));
                }
            }
        }
        Collections.sort(numbers);
        return numbers;
    }

    public static void main(String[] args) {
        Four_PalindromeProduct driver = new Four_PalindromeProduct();
        ArrayList<Integer> nums = driver.largestPalindrome();
        System.out.println(nums.get(nums.size() - 1));
    }
}
