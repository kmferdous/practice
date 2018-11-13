package uva;

import java.util.Scanner;

/**
 * @see 10038 - Jolly Jumpers
 */

public class Problem10038 {

    public static void start() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int len = sc.nextInt();
            int[] dataArr = new int[len];
            int[] diffArr = new int[len];
            int diff, sum = 0;

            for (int i = 0; i < len; i++) {
                dataArr[i] = sc.nextInt();
                if (i > 0) {
                    diff = Math.abs(dataArr[i] - dataArr[i - 1]);
                    if (diff < len && diffArr[diff] != 1) {
                        diffArr[diff] = 1;
                        sum++;
                    }
                }
            }

            if (sum == len - 1)
                System.out.println("Jolly");
            else
                System.out.println("Not jolly");
        }
    }
}
