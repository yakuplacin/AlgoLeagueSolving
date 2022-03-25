import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int xchild = sc.nextInt();
		int childsum = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		int childDiff = 0;
		for (int i = 0; i < xchild; i++) {
			int childFirstCand = sc.nextInt();
			childsum = childsum + childFirstCand;
			array.add(childFirstCand);
		}
		Collections.sort(array);

		int candies = sc.nextInt();

		if ((childsum + candies) % xchild != 0) {
			System.out.println("0");
			System.exit(0);
		} else {
			for (int j = 0; j < array.size(); j++) {
				for (int k = 0; k < array.size(); k++) {
					if (Math.abs(array.get(j) - array.get(k)) > candies) {
						System.out.println("0");
						System.exit(0);
						break;
					}

				}
			}
		}

		int check = 0;
		for (int i = 0; i < array.size(); i++) {

			check = check + (array.get(xchild-1) - array.get(i));

		}
//		System.out.println(check);

		if (check <= candies) {
			if ((candies - check) % xchild == 0 || candies==check) {

				System.out.println("1");
				System.exit(0);
			} else {
				System.out.println("0");
				System.exit(0);

			}
			//System.out.println("jkdfhks");
			
		}
		System.out.println("0");

	}
}