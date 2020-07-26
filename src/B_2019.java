

import java.util.Scanner;

public class B_2019 {
    public static void main(String[] args) {
        int p, q, a, b, c, d, x, y, n, result = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        x = 0;
        y = 0;
        for (int i = 0; i < n; i++) {
            p = scan.nextInt();
            q = scan.nextInt();
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            d = scan.nextInt();
            y = ((int) (q / c)*d);
            x = p;
            int t = 0;

            t = (int) ((y - x) / (b + a));
            if(x==y) result = x;
            else {
                result = Math.min(x + (a * t), y - (b * t));
                for (int k = 0; k < 10; k++) {
                    t = t + k;
                    result = Math.max(result, Math.min(x + (a * t), y - (b * t)));
                }
                t = (int) ((y - x) / (b + a));
                for (int k = 0; k > -10; k--) {
                    t = t + k;
                    result = Math.max(result, Math.min(x + (a * t), y - (b * t)));
                }
            }

            if (result < 0 || a == b) System.out.println(0);
            else {
                System.out.println(result);
            }

        }

    }

}
