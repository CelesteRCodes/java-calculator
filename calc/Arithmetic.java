package calc;


public class Arithmetic {
	public static float add(float num1, float num2) {
		return num1 + num2;
	}

	public static float subtract(float num1, float num2) {
		return num1 - num2;
	}

	public static float multiply(float num1, float num2) {
		return num1 * num2;
	}

	public static float divide(float num1, float num2) {
		return num1 / num2;
	}

	public static float square(float num1) {
		return num1 * num1;
	}

	public static float cube(float num1) {
		return num1 * num1 * num1;
	}

	public static float power(float num1, float num2) {
		
		float start_variable = num1;
		for (int i=1; i < num2; i++) {
			start_variable *= num1;
			
		}
		return start_variable;
	}	


	public static float mod(float num1, float num2) {
		return num1 % num2;
	}
}