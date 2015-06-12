package Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Kyle on 3/8/2015.
 */
public class Eight_LargestProduct {
    private File fileIn;
    private Scanner input;
    private String inputFile;

    public Eight_LargestProduct() {
        try {
            fileIn = new File("eight_input.txt");
            input = new Scanner(fileIn);
            inputFile = input.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private long largestProduct() {
        long largestProduct = 0;
        long currentProduct;
        long[] series = new long[13];
        for (int i = 0; i < (inputFile.length() - 12); i++) {
            for (int j = 0; j < 13; j++) {
                series[j] = Integer.parseInt(String.valueOf(inputFile.charAt(i + j)));
            }
            currentProduct = series[0] * series[1] * series[2] * series[3] *
                    series[4] * series[5] * series[6] * series[7] * series[8] *
                    series[9] * series[10] * series[11] * series[12];
            if(currentProduct > largestProduct) {
                largestProduct = currentProduct;
            }
        }
        return largestProduct;
    }

    public static void main(String[] args) {
        Eight_LargestProduct driver = new Eight_LargestProduct();
        System.out.println(driver.largestProduct());
    }
}
