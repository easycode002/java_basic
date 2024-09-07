package Day02;
// Assignment operators are used to assign values to variables.

public class Assignment01 {
	public static void main(String[] args) {
		int x = 10;
		System.out.println("Initial default value: " + x);
		x += 5;
		System.out.println("After += 5: " + x);
		x -= 5;
		System.out.println("After -= 5: " + x);
		x *= 5;
		System.out.println("After *= 5: " + x);
		x /= 5;
		System.out.println("After %= 5: " + x);
	}
}
