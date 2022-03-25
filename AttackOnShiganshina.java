import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            int number1 = sc.nextInt();
            arr1[i] = number1;
        }

        for (int i = 0; i < n2; i++) {
            int number2 = sc.nextInt();
            arr2[i] = number2;
        }
        ArrayList<Integer> arsum = new ArrayList<>();
        int check = 0;
        for (int i = 0; i < n2; i++) {
            check = 0;
            for (int j = 0; j < n1; j++) {
                if (arr1[j] < arr2[i]) {
                    check++;
                }
            }
            
            arsum.add(check);

        }
        
        Collections.sort(arsum);
        for (int i = 0; i < arsum.size(); i++) {
            System.out.print(arsum.get(i)+" ");
        }
    }
}