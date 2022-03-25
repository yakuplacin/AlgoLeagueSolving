import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();


        if (z == 0) {
            int s0 = n * (n - (y + 1));
//            System.out.println(s0);
//            System.out.println((x*(x+1)/2)-((x-y-1)*(x-y)/2) + " sdfsd");
//            System.out.println(n - x - 1 + " sadasd");
            int sum1;
            if (((n - (x + 1) - (y) + 1 <= 0))) {
                sum1 = ((n - x - 1) * (n - x) / 2);
//            System.out.println("asd");
            } else
                sum1 = ((n - x - 1) * (n - x) / 2) - ((n - (x + 1) - (y + 1)) * ((n - (x + 1) - (y))) / 2);
            //    System.out.println(((n - x - 1) * (n - x) / 2) - ((n - (x) - (y + 1)) * ((n - (x) - (y))) / 2) + " sad");
            //int sum1 = ((n - x - 1) * (n - x) / 2) - ((n - (x + 1) - (y + 1)) * ((n - (x + 1) - (y)) + 1) / 2);
            //      System.out.println(sum1);
            int sum2;
            if ((x - y) <= 0) {
                sum2 = (x * (x + 1) / 2);
            } else {
                sum2 = (x * (x + 1) / 2) - ((x - y - 1) * (x - y) / 2);
            }
            //  int sum2 = (x * (x + 1) / 2) - ((x - y - 1) * (x - y) / 2);

            //     System.out.println(sum2);
            int sq = n * n;

            //   System.out.println(sq);
            int result = sq - s0 - sum1 - sum2;
            System.out.println(result);
        } else if (z == 1) {
            int temp = x;
            x = y;
            y = temp;
            int s0 = n * (n - (y + 1));
            int sum1;
            if (((n - (x + 1) - (y) + 1 <= 0))) {
                sum1 = ((n - x - 1) * (n - x) / 2);
//            System.out.println("asd");
            } else
                sum1 = ((n - x - 1) * (n - x) / 2) - ((n - (x + 1) - (y + 1)) * ((n - (x + 1) - (y))) / 2);
            //    System.out.println(((n - x - 1) * (n - x) / 2) - ((n - (x) - (y + 1)) * ((n - (x) - (y))) / 2) + " sad");
            //int sum1 = ((n - x - 1) * (n - x) / 2) - ((n - (x + 1) - (y + 1)) * ((n - (x + 1) - (y)) + 1) / 2);
            //      System.out.println(sum1);
            int sum2;
            if ((x - y) <= 0) {
                sum2 = (x * (x + 1) / 2);
            } else {
                sum2 = (x * (x + 1) / 2) - ((x - y - 1) * (x - y) / 2);
            }
            //  int sum2 = (x * (x + 1) / 2) - ((x - y - 1) * (x - y) / 2);

            //     System.out.println(sum2);
            int sq = n * n;

            //   System.out.println(sq);
            int result = sq - s0 - sum1 - sum2;
            System.out.println(result);

        } else if (z == 2) {
            int temp = y;
            y = n - (y + 1);

            int s0 = n * (n - (y + 1));
//            System.out.println(s0);
//            System.out.println((x*(x+1)/2)-((x-y-1)*(x-y)/2) + " sdfsd");
//            System.out.println(n - x - 1 + " sadasd");
            int sum1;
            if (((n - (x + 1) - (y) + 1 <= 0))) {
                sum1 = ((n - x - 1) * (n - x) / 2);
//            System.out.println("asd");
            } else
                sum1 = ((n - x - 1) * (n - x) / 2) - ((n - (x + 1) - (y + 1)) * ((n - (x + 1) - (y))) / 2);
            //    System.out.println(((n - x - 1) * (n - x) / 2) - ((n - (x) - (y + 1)) * ((n - (x) - (y))) / 2) + " sad");
            //int sum1 = ((n - x - 1) * (n - x) / 2) - ((n - (x + 1) - (y + 1)) * ((n - (x + 1) - (y)) + 1) / 2);
            //      System.out.println(sum1);
            int sum2;
            if ((x - y) <= 0) {
                sum2 = (x * (x + 1) / 2);
            } else {
                sum2 = (x * (x + 1) / 2) - ((x - y - 1) * (x - y) / 2);
            }
            //  int sum2 = (x * (x + 1) / 2) - ((x - y - 1) * (x - y) / 2);

            //     System.out.println(sum2);
            int sq = n * n;

            //   System.out.println(sq);
            int result = sq - s0 - sum1 - sum2;
            System.out.println(result);
        } else {
            x = n-(x+1);
            int temp = x;
            x = y;
            y = temp;
            int s0 = n * (n - (y + 1));
            int sum1;
            if (((n - (x + 1) - (y) + 1 <= 0))) {
                sum1 = ((n - x - 1) * (n - x) / 2);
//            System.out.println("asd");
            } else
                sum1 = ((n - x - 1) * (n - x) / 2) - ((n - (x + 1) - (y + 1)) * ((n - (x + 1) - (y))) / 2);
            //    System.out.println(((n - x - 1) * (n - x) / 2) - ((n - (x) - (y + 1)) * ((n - (x) - (y))) / 2) + " sad");
            //int sum1 = ((n - x - 1) * (n - x) / 2) - ((n - (x + 1) - (y + 1)) * ((n - (x + 1) - (y)) + 1) / 2);
            //      System.out.println(sum1);
            int sum2;
            if ((x - y) <= 0) {
                sum2 = (x * (x + 1) / 2);
            } else {
                sum2 = (x * (x + 1) / 2) - ((x - y - 1) * (x - y) / 2);
            }
            //  int sum2 = (x * (x + 1) / 2) - ((x - y - 1) * (x - y) / 2);

            //     System.out.println(sum2);
            int sq = n * n;

            //   System.out.println(sq);
            int result = sq - s0 - sum1 - sum2;
            System.out.println(result);
        }
    }
}
