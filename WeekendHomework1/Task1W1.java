public class Task1W1 {

	public static void main(String[] args) {
		/*
		 * Write a program that contains three integers a,b,c.Print is it
		 * possible to construct a triangle with sides with values a,b,c.
		 */

		int Num1 = 8;
		int Num2 = 4; // Values side of triangle
		int Num3 = 1;
		
		// The requirement to examine the possibility of construction of a
		// triangle
		
		if (Num1 + Num2 < Num3 || Num1 + Num3 < Num2 || Num2 + Num3 < Num1) {
			System.out
					.printf("It is not possible to construct a triangle with these values: a=%d b=%d c=%d",Num1,Num2,Num3);
		} else
			System.out
					.printf("It is possible to construct a triangle with these values: a=%d b=%d c=%d",Num1,Num2,Num3);
	}
}