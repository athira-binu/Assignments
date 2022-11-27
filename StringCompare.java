package firstAssignment;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first version");
		String firstVersion = sc.next();// to give input value to string 1
		System.out.println("Enter the Second version");
		String secondVersion = sc.next();// to give input value to string 2
		String a[] = firstVersion.split("[.]");// splitting dot from the string and storing it as array
		String b[] = secondVersion.split("[.]");

		int a1 = Integer.parseInt(a[0]);// converting string to numerics
		int b1 = Integer.parseInt(b[0]);
		if (a1 > b1) { // checking whether index value zero of first array is greater than zero index
						// value of second array
			System.out.println("Latest version is " + firstVersion);

		} else if (b1 > a1) {
			System.out.println("Latest version is " + secondVersion);

		} else if (a1 == b1) {

			for (int i = 1; i < a.length; i++) { // to check all index value from index 1 of first array is greater or
													// less than second array
				int a2 = Integer.parseInt(a[i]);// converting string to numerics from first index position
				int b2 = Integer.parseInt(b[i]);
				if (a2 > b2) {
					System.out.println("Latest version is " + firstVersion);
					break;
				} else if (b2 > a2) {
					System.out.println("Latest version is " + secondVersion);
					break;
				}

				else if (a2 == b2) {
					System.out.println("Versions are same");
					break;

				}
			}

		}

	}

}
