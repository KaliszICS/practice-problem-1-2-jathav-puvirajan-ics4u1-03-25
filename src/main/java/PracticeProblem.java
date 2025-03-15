public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validIndex(int[] arr, int i) {
		try {
			int element = arr[i];
			return true;  
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}
	public static int divide(int a, int b) {
		int result = 0;
		try {
			 result = a / b;
		} catch (ArithmeticException e) {
			result = 0;
		}
		return result;
	}
	public static int safeConvertStringtoInt(String s) {
		int output;
		try {
			 output = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			output = 0;
		}
		return output;
	}
}
