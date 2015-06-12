package Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Kyle on 3/9/2015.
 */
public class Eleven_LargestProductGrid {
    private File fileIn;
    private Scanner input;
    private int[][] grid = new int[20][20];
    private long[] setOfLargest = new long[4];

    public Eleven_LargestProductGrid() {
        try {
            fileIn = new File("eleven_input.txt");
            input = new Scanner(fileIn);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void generateGrid() {
        int i = 0;
        int j = 0;
        while (input.hasNext()) {
            grid[i][j % 20] = input.nextInt();
            if ((j % 20) == 19) {
                i++;
            }
            j++;

        }
//        for (int k = 0; k < 20 ; k++) {
//            for (int l = 0; l < 20; l++) {
//                System.out.println(grid[k][l]);
//            }
//        }
    }

    private void largestEachRow() {
        int count = 0;
        long currentProduct = 0;
        long largestProduct = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 17; j++) {
                currentProduct = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
//                System.out.println("Row " + currentProduct);
                count++;
                if (currentProduct > largestProduct) {
                    largestProduct = currentProduct;
//                    System.out.println(currentProduct);
                }
            }
        }
        System.out.println("Row count: " + count);
        setOfLargest[0] = largestProduct;
    }

    private void largestEachColumn() {
        int count = 0;
        long currentProduct = 0;
        long largestProduct = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 17; j++) {
                count ++;
                currentProduct = grid[j][i] * grid[j + 1][i] * grid[j + 2][i] * grid[j + 3][i];
//                System.out.println("Column " + currentProduct);
                if (currentProduct > largestProduct) {
                    largestProduct = currentProduct;
                }
            }
        }
        System.out.println("Column count: " + count);
        setOfLargest[1] = largestProduct;
    }

    private void largestDiagForward() {
        int count = 0;
        long currentProduct = 0;
        long largestProduct = 0;
//        for (int i = 0; i < 17; i++) {
//            currentProduct = grid[i][i] * grid[i + 1][i + 1] * grid[i + 2][i + 2] * grid[i + 3][i + 3];
//            System.out.println("Diag Forward " + currentProduct);
//            if (currentProduct > largestProduct) {
//                largestProduct = currentProduct;
//            }
//        }
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                for (int k = 0; k < 4; k++) {
                    count++;
                    currentProduct = grid[i][i] * grid[i + 1][i + 1] * grid[i + 2][i + 2] * grid[i + 3][i + 3];
//                System.out.println("Diag Forward " + currentProduct);
                    if (currentProduct > largestProduct) {
                        largestProduct = currentProduct;
                    }
                }
            }
        }
        System.out.println("Diag forward count: " + count);
        setOfLargest[2] = largestProduct;
    }

    private void largestDiagBackward() {
        int count = 0;
        long currentProduct = 0;
        long largestProduct = 0;
//        for (int i = 19; i > 2; i--) {
//            currentProduct = grid[i][i] * grid[i - 1][i - 1] * grid[i - 2][i - 2] * grid[i - 3][i - 3];
//            System.out.println("Diag Back " + currentProduct);
//            if (currentProduct > largestProduct) {
//                largestProduct = currentProduct;
//            }
//        }
        for (int i = 0; i < 17; i++) {
            for (int j = 19; j > 2; j--) {
                for (int k = 0; k < 4; k++) {
                    count++;
                    currentProduct = grid[i][j] * grid[i + 1][j - 1] * grid[i + 2][j - 2] * grid[i + 3][j - 3];
//                System.out.println("Diag Back " + currentProduct);
                    if (currentProduct > largestProduct) {
                        largestProduct = currentProduct;
                    }
                }
            }
        }
        System.out.println("Diag back count: " + count);
        setOfLargest[3] = largestProduct;
    }

    private long getLargest() {
        generateGrid();
        largestEachColumn();
        largestEachRow();
        largestDiagForward();
        largestDiagBackward();
        long largest = setOfLargest[0];
        for (int i = 1; i < setOfLargest.length; i++) {
            if (setOfLargest[i] > largest) {
                largest = setOfLargest[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Eleven_LargestProductGrid driver = new Eleven_LargestProductGrid();
        for (int i = 0; i < driver.setOfLargest.length; i++) {
            System.out.println("Final " + driver.setOfLargest[i]);
        }
        System.out.println(driver.getLargest());
    }
}
