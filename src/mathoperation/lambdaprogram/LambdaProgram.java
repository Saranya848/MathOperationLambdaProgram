package mathoperation.lambdaprogram;

@FunctionalInterface
interface Arithmetic1 {
	int operations(int a, int b);
}

public class LambdaProgram {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		/**
		 * Addition of Lambda Programs
		 */
		Arithmetic1 add = (int a, int b) -> a + b;
		int result = add.operations(x, y);
		System.out.println("Addition ==> " + result);
		
		/**
		 * Substraction of Lambda Programs
		 */
		Arithmetic1 sub = (int a, int b) -> a - b;
		int result1 = sub.operations(x, y);
		System.out.println("Substraction ==> " + result1);
		
		/**
		 * Multiplication of Lambda Programs
		 */
		Arithmetic1 mul = (int a, int b) -> a * b;
		int result2 = mul.operations(x, y);
		System.out.println("Multiplication ==> " + result2);
		
		/**
		 * Division of Lambda Programs
		 */
		Arithmetic1 divide = (int a, int b) -> a + b;
		int result3 = divide.operations(x, y);
		System.out.println("Division ==> " + result3);
	}
}
