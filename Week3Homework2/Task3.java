import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int Array[] = new int[5];
		int Array1[] = new int[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("Enter the element of first array " +(i+1));
			int num = input.nextInt();
			Array[i] = num;
		}
		System.out.println(Arrays.toString(Array));

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the elemnts of second array2 "+(i+1));
			int num1 = input.nextInt();
			Array1[i] = num1;
		}
		System.out.println(Arrays.toString(Array));
		System.out.println(Arrays.toString(Array1));
		int counter = -1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (Array[j] == Array[i])
					counter++;
			}
			if (counter != i)

				break;

		}
		System.out.println(counter);
		if (counter == 4)
			System.out.println("Arrays are identical");
		else
			System.out.println("Arrays are not identical");

	}
}
